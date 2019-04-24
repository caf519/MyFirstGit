package com.example.shao.dao;

import com.example.shao.entity.Emp;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface EmpMapper {

    /**
     * 根据编号查询员工信息
     * @param empno
     * @return
     */
    @Select("select * from emp where empno=#{empno}")
    public Emp findEmpByEmpno(@Param("empno") Integer empno);
}
