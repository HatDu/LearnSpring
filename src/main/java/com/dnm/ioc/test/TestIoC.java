package com.dnm.ioc.test;

import com.dnm.ioc.service.IAccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestIoC {
    public static void main(String[] args) {
        test_01();
    }

    public static void test_01(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");

        // 构造器注入
//        IAccountService as = (IAccountService) ac.getBean("accountService");
        // setter注入
//        IAccountService as = (IAccountService) ac.getBean("accountService2");

        // 复杂类型注入
        IAccountService as = (IAccountService) ac.getBean("accountService3");
        System.out.println(as);
    }
}
