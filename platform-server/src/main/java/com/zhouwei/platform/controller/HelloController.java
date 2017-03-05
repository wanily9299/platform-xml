package com.zhouwei.platform.controller;

import com.zhouwei.platform.bean.AppInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by zhouwei on 2017/3/3.
 */
@Controller
public class HelloController {

    @Autowired
    AppInfo appInfo;

    @RequestMapping("/hello")
    public @ResponseBody String test() {
        return "hello, world! This com from spring!";
    }

    @RequestMapping("/appinfo")
    public @ResponseBody String appinfo(){
        return appInfo.toString();
    }

}