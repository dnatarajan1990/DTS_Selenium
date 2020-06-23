package com.WebToolsPageObjects.ApplicationDataEnumsPageObjects;

/**
 * Created by sciborek on 13.06.2017.
 */
public enum TestFlagList {
    ALL("All"),
    EMPTY(""),
    OPER("OPER"),
    TR01("TR01"),
    TR02("TR02"),
    TR03("TR03"),
    TR04("TR04");

    private String name;

    TestFlagList(String name) {
        this.name = name;
    }

    public String getTestFlag() {
        return name;
    }
}
