package com.dnm.ioc.ui;

import com.dnm.ioc.service.IAccountService;
import com.dnm.ioc.service.impl.AccountServiceImpl;
import javafx.application.Application;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Client {
    public static void main(String[] args) {
        ApplicationContext ac = null;
        // ac = new ClassPathXmlApplicationContext("bean.xml");
        ac = new FileSystemXmlApplicationContext("C:\\Users\\dnm\\Documents\\Google Drive\\IDEA\\LearnSpring\\src\\main\\resources\\bean.xml");
        IAccountService as = (IAccountService) ac.getBean("accountService");
        as.saveAccount();
    }
}
