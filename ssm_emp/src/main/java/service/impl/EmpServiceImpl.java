package service.impl;

import dao.EmpDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pojo.Emp;
import service.EmpService;

import java.util.List;
@Service
public class EmpServiceImpl implements EmpService {
    @Autowired
    private EmpDao dao;
    @Override
    public List<Emp> getAllEmps() {
        return dao.getAllEmps();
    }
}
