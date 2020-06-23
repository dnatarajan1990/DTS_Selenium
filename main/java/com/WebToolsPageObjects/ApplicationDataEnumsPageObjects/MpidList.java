package com.WebToolsPageObjects.ApplicationDataEnumsPageObjects;

/**
 * Created by sciborek on 20.06.2017.
 */
public enum MpidList {
    EMPTY(""),
    ALL("All"),
    OI("--01"),
    OII("--02"),
    TEST_AUTOMATION("--02"),
    TEST_AUTOMATION02("--01");



    private String name;

    MpidList(String name){
        this.name = name;
    }
    public String getMpid(){
        return  name;
    }
}
