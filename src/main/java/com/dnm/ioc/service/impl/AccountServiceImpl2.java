package com.dnm.ioc.service.impl;

import com.dnm.ioc.service.IAccountService;

import java.util.Date;

public class AccountServiceImpl2 implements IAccountService {
    // 经常变化的数据，并不适用于注入
    private String name;
    private Integer age;
    private Date birthday;
    public void saveAccount() {
        System.out.println("保存账户");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
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
