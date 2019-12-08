package com.nts.service;

import com.nts.entity.Emp;

import java.util.List;

public interface EmpService {
    List<Emp> queryAll(Integer page, Integer rows);

    Emp findOne(String id);

    void addEmp(Emp emp);

    void deleteEmp(String id);

    void updateEmp(Emp emp);
}
