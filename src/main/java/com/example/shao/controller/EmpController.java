package com.example.shao.controller;

import com.example.shao.dao.EmpMapper;
import com.example.shao.entity.Emp;
import com.example.shao.util.Task;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmpController {

    @Autowired
    private EmpMapper empMapper;

    @RequestMapping("/findid")
    Emp findEmp(@Param("empno") Integer empno){
        return empMapper.findEmpByEmpno(empno);

    }

    @Autowired
    private Task task;

    @RequestMapping("/testTask")
    public String testTask() throws InterruptedException{

        task.doTaskOne();
        task.doTaskTwo();
        task.doTaskThree();
        return "hello";
    }


}
