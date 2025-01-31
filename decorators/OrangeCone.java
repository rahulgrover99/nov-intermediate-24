package com.example.splitwise.demo.decorators;

public class OrangeCone implements IceCream{

    IceCream iceCream;

    // Base object
    public OrangeCone() {
        iceCream = null;
    }

    // Decorator
    public OrangeCone(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public int getCost() {
        if (iceCream == null) {
            return 10;
        }
        return iceCream.getCost() + 10;
    }

    @Override
    public String getDescription() {
        if (iceCream == null) {
            return "Starting with Orange cone.";
        }
        return iceCream.getDescription() + " + Orange cone";
    }
}
