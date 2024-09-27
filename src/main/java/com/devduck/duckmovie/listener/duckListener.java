package com.devduck.duckmovie.listener;

import lombok.extern.log4j.Log4j2;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
@Log4j2
public class duckListener implements ServletContextListener {
/*
ServletContextListener 인터페이스를 구현하여 cotenxtInitalized() , contextDestroyed()에 파라미터로 ServletContextEvent을 이용하면
현재 앱이 실행되는 공간인 ServletContext를 접근할 수 있다.
 SevletContext는 웹 앱내 모든 자원들을 같이 사용할 수 있는 공간으로 모든 컨트롤러나 JSP에서 활용할 수 있다.
 */
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        log.info("===========init===========");
        log.info("===========init===========");
        log.info("===========init===========");

        ServletContext servletContext = sce.getServletContext();
        servletContext.setAttribute("appName", "duckmovie");
    }


    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        log.info("===========destroy===========");
        log.info("===========destroy===========");
        log.info("===========destroy===========");
    }
}
