package com.devduck.duckmovie.controller.exception;

import lombok.extern.log4j.Log4j2;
import org.apache.ibatis.javassist.NotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.NoHandlerFoundException;

import java.util.Arrays;

@ControllerAdvice
@Log4j2
public class CommonExceptionAdivce {

    @ResponseBody
    @ExceptionHandler(NumberFormatException.class)
    public String exceptNumber(NumberFormatException numberFormatException){
        log.error("----------------------------");
        log.error(numberFormatException.getMessage());
        return "Number Format Exception";
    }

    @ResponseBody
    @ExceptionHandler(Exception.class)
    public String exceptCommon(Exception exception){
        log.error("----------------------------");
        log.error(exception.getMessage());
        StringBuffer buffer = new StringBuffer("<ul>");
        buffer.append("<li>" +exception.getMessage()+"</li>");
        Arrays.stream(exception.getStackTrace()).forEach(stackTraceElement -> {
            buffer.append("<li>" +stackTraceElement.toString()+"</li>");
        });
        buffer.append("</ul>");
        return buffer.toString();
    }

    //잘못된 URL 호출시 404에러 면 페이지 이동
    @ExceptionHandler(NoHandlerFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String notFound(){
        return "custom404";
    }

}
