package com.WebToolsPageObjects.ApplicationDataEnumsPageObjects;

/**
 * Created by sciborek on 20.06.2017.
 */
public enum RoleList {
    EMPTY(""),
    MINUS("-"),
    ONE("1 : Role 1"),
    TWO("2"),
    FOUR("4"),
    C("C"),
    X("X"),
    Y("Y"),
    Z("Z");



    private String name;
    RoleList(String name){
        this.name = name;
    }
    public String getRole(){
        return  name;
    }
}
