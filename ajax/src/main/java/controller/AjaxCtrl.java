package controller;

import entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

@Controller
@RequestMapping("/ajax")
public class AjaxCtrl {
    @RequestMapping("/show")
    public String show(){
        return "ajax";
    }

    @ResponseBody
    @RequestMapping(value="/checkUser", produces="text/html;charset=utf-8")
    public String checkUser(String name){
        System.out.println("name:"+name);
        return "admin".equals(name)?"<font color='red'>用户名已存在</font>":"<font color='red'>用户名可用</font>";
    }

    @ResponseBody
    @RequestMapping("/findUser")
    public User findUser(String name){
        User u = new User();
        u.setName(name);
        u.setPass("123");
        u.setBirth(new Date());
        System.out.println("find中,name:"+name);
        return u;
    }


}
