package com.devduck.duckmovie.controller;


import com.devduck.duckmovie.dto.MemberDTO;
import com.devduck.duckmovie.service.MemberService;
import lombok.extern.log4j.Log4j2;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.UUID;


@Log4j2
@WebServlet("/login")
public class LoginController extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        log.info("login get.....");
        request.getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        log.info("login post...");

        String mid = request.getParameter("mid");
        String mpw = request.getParameter("mpw");
        String auto = request.getParameter("auto");

        boolean remeberMe = auto != null && auto.equals("on");

        try{
            MemberDTO memberDTO = MemberService.INSTANCE.login(mid,mpw);

            if(remeberMe){
                String uuid = UUID.randomUUID().toString();
                MemberService.INSTANCE.updateUUID(mid,uuid);
                memberDTO.setUuid(uuid);

                Cookie rememberCookie = new Cookie("remember-me", uuid);
                rememberCookie.setMaxAge(60*60*24*7); //유효기간 1주일
                rememberCookie.setPath("/");
                response.addCookie(rememberCookie);
            }
            HttpSession session = request.getSession();
            session.setAttribute( "loginInfo", memberDTO);
            response.sendRedirect("/todo/list");

        }
        catch (Exception e){
            response.sendRedirect("/login?result=error");
        }



    }
}
