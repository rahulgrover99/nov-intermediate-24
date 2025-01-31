package com.example.splitwise.demo.decorators;

public class VanillaIceCream implements IceCream{


    IceCream iceCream;

    public VanillaIceCream(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public int getCost() {
        return iceCream.getCost() + 15;
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription() + " Vanilla";
    }
}
