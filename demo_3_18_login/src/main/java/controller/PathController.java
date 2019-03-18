package controller;

import entity.User;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@Controller
@RequestMapping("/p1")
public class PathController {
    @RequestMapping("/m1")
    public void m1(){
        //最终访问p1/m1.jsp
        System.out.println("m1xxx");
    }
    @RequestMapping("/m2")
    public String  m2(){
        System.out.println("m2xxx");
        //最终访问login.jsp
        return "login";
    }

    /*
    http://localhost/p1/m3---无法访问
    http://localhost/p1/m3/---ok
    http://localhost/p1/m3/abc--ok
    http://localhost/p1/m3/abc/123--无法访问
     */
    @RequestMapping("/m3/*")
    public void m3(){
        System.out.println("m3xxx");
    }

    /*
    http://localhost/p1/m4/abc/aaa---ok
    http://localhost/p1/m4/abc--ok
    localhost/p1/m4/--ok
    localhost/p1/m4--ok
    * */
    @RequestMapping("/m4/**")
    public void m4(){
        System.out.println("m4xxx");
    }
    /*
    http://localhost/p1/m5/12--无法访问
    http://localhost/p1/m5/1---ok
    * */
    @RequestMapping("/m5/?")
    public void m5(){
        System.out.println("m5xxx");
    }

    @RequestMapping("/m6/{id}/{name}")
    public void m6(@PathVariable String id,@PathVariable("name") String n){
        System.out.println("m6xxx,id="+id+",name="+n);
    }

    @RequestMapping("/m7/*")
    public String m7(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("m7xxx");
        req.getRequestDispatcher("/login").forward(req,resp);
        return null;
        //return "login";//默认是转发
        //return "redirect:/showLogin";
    }

    @RequestMapping(path="/m8/{id:\\d+}" ,method= RequestMethod.GET)
    public void m8(@PathVariable String id,@PathVariable("name") String n){
        System.out.println("m6xxx,id="+id+",name="+n);
    }

    @RequestMapping(path={"/m9","/m10"})
    public void m9(){
        System.out.println("m9xxx");
    }

    @RequestMapping("/submit")
    public String sub1(String name,HttpServletRequest req, @RequestParam(name="a",required = true,defaultValue = "23") Integer age, Boolean ok, HttpSession session, Model m, User u,String[]hobbies){
        m.addAttribute("m1","hello");//将来页面获取数据${m1}
        System.out.println("name="+name);
        System.out.println("age="+age);
        System.out.println("ok="+ok);
        System.out.println("user="+u);
        m.addAttribute("name","abc");
        m.addAttribute("user",u);
        return "redirect:showLogin";
    }
}
