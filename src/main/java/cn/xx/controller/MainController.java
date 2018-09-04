package cn.xx.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// @Controller
@RestController
@EnableAutoConfiguration
public class MainController {

    @RequestMapping("/index")
    public String index(){
        System.out.println("index");
        return  "index";
    }

}
