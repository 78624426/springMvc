package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import pojo.Emp;
import service.EmpService;

import java.util.List;
import java.util.Map;

@Controller
public class EmpController {
    @Autowired
    EmpService service;
    public String listAllEmps(Map<String,Object> map){
        List<Emp>emps = service.getAllEmps();
        map.put("emps",emps);
        return "list";
    }

}
