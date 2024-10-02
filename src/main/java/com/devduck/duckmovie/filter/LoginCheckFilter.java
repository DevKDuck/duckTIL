//package com.devduck.duckmovie.filter;
//
//import com.devduck.duckmovie.dto.MemberDTO;
//import com.devduck.duckmovie.service.MemberService;
//import lombok.extern.log4j.Log4j2;
//
//import javax.servlet.*;
//import javax.servlet.annotation.WebFilter;
//import javax.servlet.http.Cookie;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;
//import java.io.IOException;
//import java.util.Arrays;
//import java.util.Optional;
//
//@WebFilter(urlPatterns = {"/todo/*"})
//@Log4j2
//public class LoginCheckFilter implements Filter {
//
//    @Override
//    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
//        log.info("Login check filter...");
//
//        HttpServletRequest request = (HttpServletRequest) servletRequest;
//        HttpServletResponse response = (HttpServletResponse) servletResponse;
//
//        HttpSession session = request.getSession();
//
//        if(session.getAttribute("loginInfo") != null){
//            filterChain.doFilter(servletRequest, servletResponse);
//            return;
//        }
//
//        //session에 loginInfo 값이 없다면 쿠키를 체크
//        Cookie cookie = findCookie(request.getCookies(),"remember-me");
//
//        //세션에도 없고 쿠키도 없다면 그냥 로그인
//        if(cookie == null){
//            response.sendRedirect("/login");
//            return;
//        }
//
//        //쿠키 존재시
//        log.info("cookie는 존재 합니다.");
//
//        String uuid = cookie.getValue();
//
//        try{
//            MemberDTO memberDTO = MemberService.INSTANCE.getByUUID(uuid);
//
//            log.info("쿠키의 값으로 조죄한 사용자 정보: " + memberDTO);
//            if(memberDTO == null){
//                throw new Exception("Cookie value is not valid");
//            }
//
//            //회원 정보를 세션에 추가
//            session.setAttribute("loginInfo", memberDTO);
//            filterChain.doFilter(request, response);
//        }
//        catch (Exception e){
//            e.printStackTrace();
//            response.sendRedirect("/login");
//        }
//
//
//    }
//    private Cookie findCookie(Cookie[] cookies, String name){
//        if(cookies == null || cookies.length == 0){
//            return null;
//        }
//
//        Optional<Cookie> result = Arrays.stream(cookies)
//                .filter(ck -> ck.getName().equals(name))
//                .findFirst();
//
//        return result.isPresent()?result.get():null;
//    }
//}
