package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;

@Controller//告诉springMVC这是一个Handler
public class HelloAnnoController {
    @RequestMapping("/hello")
    public ModelAndView sayHello(String name){
        ModelAndView m = new ModelAndView();
        m.setViewName("hello");
        m.addObject("msg","hello"+name);
        return m;
    }
}
