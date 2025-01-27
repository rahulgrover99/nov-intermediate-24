package com.example.splitwise.demo.factory;

import java.awt.*;

public class AndroidUiFactory implements UiFactory{
    @Override
    public Button createButton() {
        return new Button();
    }

    @Override
    public Menu createMenu() {
//        return AndroidMenu();
        return null;
    }

    @Override
    public Scrollbar createScrollBar() {
        return new Scrollbar();
    }
}
