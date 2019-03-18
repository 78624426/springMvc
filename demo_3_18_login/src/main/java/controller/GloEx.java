package controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice//表示全局异常处理类
public class GloEx {
    @ExceptionHandler(Exception.class)
    public String exe1Handle(Exception e, Model m){
        m.addAttribute("msg",e.getMessage());
        return "error";
    }
}
