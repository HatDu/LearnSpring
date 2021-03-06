package com.dnm.ioc.service.impl;

import com.dnm.ioc.service.IAccountService;

import java.util.Date;

public class AccountServiceImpl implements IAccountService {
    // 经常变化的数据，并不适用于注入
    private String name;
    private Integer age;
    private Date birthday;

    public AccountServiceImpl(String name, Integer age, Date birthday) {
        this.name = name;
        this.age = age;
        this.birthday = birthday;
    }

    public void saveAccount() {
        System.out.println("保存账户");
    }

    @Override
    public String toString() {
        return "AccountServiceImpl{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", birthday=" + birthday +
                '}';
    }
}
