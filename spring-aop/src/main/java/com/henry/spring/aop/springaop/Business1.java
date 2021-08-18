package com.henry.spring.aop.springaop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Business1 {

    @Autowired
    private DAO1 dao;

    public String calcSomething(){
        return dao.retrieveSomething() + " is 20 loafs wide";
    }
}
