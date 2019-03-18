package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@Controller
public class LoginController {
    //@RequestMapping(value = "/login",method = RequestMethod.POST)
    public String login(String name, String pass, HttpServletRequest req){
        System.out.println("name="+name+",pass="+pass);

        return "success";
    }
    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String login1(String name,String pass){

        return "login";
    }
}
