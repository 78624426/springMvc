package controller;


import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloController implements Controller{

    @Override
    public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse resp) throws Exception {
        String name = req.getParameter("name");
        ModelAndView m = new ModelAndView();
        m.setViewName("hello");
        m.addObject("msg","hello:"+name);
        return m;
    }
}
