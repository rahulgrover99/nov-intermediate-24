package com.example.splitwise.demo.decorators;

public class Client {

    public static void main(String[] args) {

        IceCream iceCream =
                new VanillaIceCream(
                        new OrangeCone(
                                new VanillaIceCream(
                                        new OrangeCone(new OrangeCone())
                                )
                        )
                );

        System.out.println(iceCream.getCost());
        System.out.println(iceCream.getDescription());

    }
}
