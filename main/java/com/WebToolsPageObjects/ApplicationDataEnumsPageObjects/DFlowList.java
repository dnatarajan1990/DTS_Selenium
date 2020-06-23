package com.WebToolsPageObjects.ApplicationDataEnumsPageObjects;

/**
 * Created by sciborek on 13.06.2017.
 */
public enum DFlowList {
    ALL("All"),
    D0001("D0001"),
    D0002("D0002"),
    D0003("D0003"),
    D0004("D0004"),
    D2021("D2021"),
    D0008("D0008"),
    D0011("D0011"),
    D0065("D0065"),
    E0025("E0025");

    private String name;

    DFlowList(String name){
        this.name = name;
    }
    public String getDflow(){
        return  name;
    }
}
