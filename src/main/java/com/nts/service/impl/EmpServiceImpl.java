package com.nts.service.impl;

import com.nts.dao.EmpDao;
import com.nts.entity.Emp;
import com.nts.service.EmpService;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class EmpServiceImpl implements EmpService {
    @Autowired
    private EmpDao empDao;

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public List<Emp> queryAll(Integer page, Integer rows) {
        List<Emp> emps = empDao.selectByRowBounds(new Emp(), new RowBounds((page - 1) * rows, rows));
        return emps;
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public Emp findOne(String id) {
        return empDao.selectOne(new Emp().setId(id));
    }

    @Override
    public void addEmp(Emp emp) {
        empDao.insertSelective(emp);
    }

    @Override
    public void deleteEmp(String id) {
        empDao.deleteByPrimaryKey(id);
    }

    @Override
    public void updateEmp(Emp emp) {
        empDao.updateByPrimaryKeySelective(emp);
    }
}
