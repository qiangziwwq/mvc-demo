package com.wwq.mvc.controller.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @description: TDDO
 * @author: wuweiqiang
 * @create: 2020/4/6
 * @version: 1.0
 */
@Component
public class ExceptionResolver implements HandlerExceptionResolver {

    private static Logger logger = LoggerFactory.getLogger(ExceptionResolver.class);

    @Override
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, @Nullable Object o, Exception e) {
        logger.error("{} Exception",request.getRequestURI(),e);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("exception");
        //当使用是jackson2.x的时候使用MappingJackson2JsonView
        modelAndView.addObject("status","9999");
        modelAndView.addObject("msg","接口异常,详情请查看服务端日志的异常信息");
        modelAndView.addObject("data",e.toString());
        return modelAndView;
    }
}
