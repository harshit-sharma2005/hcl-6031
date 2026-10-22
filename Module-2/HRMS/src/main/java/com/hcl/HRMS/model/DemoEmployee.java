package com.hcl.HRMS.model;

import com.hcl.HRMS.repository.EmpRepoImp;
import org.springframework.stereotype.Component;

//import com.HRMS.repository.EmpRepoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DemoEmployee {
    @Autowired
    private EmpRepoImp emprepo;

    public int add(){
        int a =20;
        int b =30;
        return emprepo.add(a,b);
    }
    public double squareRoot(){
        return emprepo.squareroot(2000);
    }
}