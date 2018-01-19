package com.zhizus.forest.webadmin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by dempezheng on 2018/1/19.
 */
@Controller
public class HomeController {

    @RequestMapping("/index")
    public String index() {
        return "index";
    }

    @RequestMapping("/help")
    public String hello() {
        return "forest/readme";
    }
}
