package com.WebToolsPageObjects.ApplicationDataEnumsPageObjects;

public enum UserPageTableButtons {
    Remove("#removeLink"),
    Edit("#editLink"),
    AccessLevels("Access levels"),
    CopyUser("#copyLink");

    private String name;

    UserPageTableButtons(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
