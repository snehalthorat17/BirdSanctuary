package com.bridgelabz;

public class Parrot extends Bird implements Flyable {

    public Parrot(){
        name = "Parrot";
        color = Color.GREEN;
    }

    @Override
    public void fly() {
        System.out.println(name +"can fly");
    }
}
