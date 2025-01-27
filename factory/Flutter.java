package com.example.splitwise.demo.factory;

public abstract class Flutter {

    int refreshRate;

    public void setTheme(String theme) {
        System.out.println("Theme has been set to:" + theme);
    }

    public void setRefreshRate(int refreshRate) {
        this.refreshRate = refreshRate;
    }


    public abstract UiFactory createUiFactory();
}
