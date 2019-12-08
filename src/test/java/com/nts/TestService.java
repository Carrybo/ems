package com.nts;

import com.nts.entity.Emp;
import com.nts.service.EmpService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@SpringBootTest(classes = EmsGitApplication.class)
@RunWith(SpringRunner.class)
public class TestService {
    @Autowired
    private EmpService es;

    @Test
    public void test0() {
        List<Emp> emps = es.queryAll(1, 5);
        emps.forEach(emp -> System.out.println(emp));
    }

    @Test
    public void test1() {
        Emp emp = new Emp();
        emp.setId(UUID.randomUUID().toString()).setAge(18).setBir(new Date()).setName("git添加").setSalary(500.0);
        es.addEmp(emp);
    }
}
