package com.example.splitwise.demo.factory;

import java.awt.*;

public class Main {


    public static void main(String[] args) {
        Flutter flutter = new AndroidFlutter();

        flutter.setTheme("Dark");
        UiFactory uiFactory = flutter.createUiFactory();
        Button button = uiFactory.createButton();
    }

}
