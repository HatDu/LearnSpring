package com.dnm.ioc.service.impl;

import com.dnm.ioc.service.IAccountService;

import java.util.*;

public class AccountServiceImpl3 implements IAccountService {
    private String[] myStrs;
    private List<String> myList;
    private Set<String> mySet;
    private Map<String, String> myMap;
    private Properties myProps;

    public void setMyStrs(String[] myStrs) {
        this.myStrs = myStrs;
    }

    public void setMyList(List<String> myList) {
        this.myList = myList;
    }

    public void setMySet(Set<String> mySet) {
        this.mySet = mySet;
    }

    public void setMyMap(Map<String, String> myMap) {
        this.myMap = myMap;
    }

    public void setMyProps(Properties myProps) {
        this.myProps = myProps;
    }

    public void saveAccount() {

    }

    @Override
    public String toString() {
        return "AccountServiceImpl3{" +
                "\nmyStrs=" + Arrays.toString(myStrs) +
                "\nmyList=" + myList +
                "\nmySet=" + mySet +
                "\nmyMap=" + myMap +
                "\nmyProps=" + myProps +
                '}';
    }
}
