//package com.devduck.duckmovie.todo;
//
//import javax.servlet.RequestDispatcher;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//
//@WebServlet(name="todoRegisterController", urlPatterns = "/todo/register")
//public class TodoRegisterController extends HttpServlet {
//
//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        System.out.println("todoRegisterController - get으로 입력화면 볼 수 있도록 구성");
//
//        RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/todo/register.jsp");
//        dispatcher.forward(req, resp);
//
//    }
//
//    @Override
//    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        System.out.println("todoRegisterController - post로 입력 처리 후 목록 페이지로 이동");
//        resp.sendRedirect("/todo/list");
//    }
//
//}
