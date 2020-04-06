package com.wwq.mvc.controller.demo;

import com.alibaba.fastjson.JSON;
import com.wwq.mvc.entity.UserInfo;
import com.wwq.mvc.service.demo.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

/**
 * @description: TDDO
 * @author: wuweiqiang
 * @create: 2020/4/5
 * @version: 1.0
 */
@Controller
public class TestController {

    @Autowired
    private  UserInfoService userInfoService;
    @RequestMapping("/hello/{uid}")
    public String hello(Model model, @PathVariable String uid) {
        UserInfo userInfo = userInfoService.queryUserInfoById(uid);
        model.addAttribute("user", userInfo);
        return "hello";
    }

    @RequestMapping("/saveUser")
    @ResponseBody
    public String saveUser(String userName,HttpServletRequest request) throws UnsupportedEncodingException {
        UserInfo info = new UserInfo();
        //String userName = request.getParameter("userName");
        info.setUserName(userName);
        int i = userInfoService.saveUser(info);
        Map<String, String> result = new HashMap<>();
        if (i>0) {
            result.put("returnFlag", "Y");
            result.put("message", "success");
        }
        return JSON.toJSONString(result);
    }

}
