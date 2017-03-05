package com.zhouwei.platform;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by zhouwei on 2017/3/3.
 */
@Controller
public class HelloController {

    @RequestMapping("/hello")
    public @ResponseBody String test() {
        return "hello, world! This com from spring!";
    }

}