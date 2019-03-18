package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;

@Controller
@RequestMapping("/ex")
public class ExContr {
    @RequestMapping("test1")
    public void test() throws IOException {
        throw new IOException("io找不到文件异常");
    }

    @ExceptionHandler(NullPointerException.class)
    public ModelAndView e1(Exception e){
        return new ModelAndView("error","msg",e.getMessage());
    }
    @ExceptionHandler(IOException.class)
    public ModelAndView e2(Exception e){
        return new ModelAndView("error","msg",e.getMessage());
    }
    @ExceptionHandler(Exception.class)
    public ModelAndView e3(Exception e){
        return new ModelAndView("error","msg",e.getMessage());
    }
}
