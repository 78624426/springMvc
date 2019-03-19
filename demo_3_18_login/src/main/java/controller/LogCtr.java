package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/log")
public class LogCtr {
    @RequestMapping("/add")
    public void add(){
        System.out.println("add方法执行中...");
    }

    @RequestMapping("/find")
    public void find(){
        System.out.println("find方法执行中...");
    }
}
