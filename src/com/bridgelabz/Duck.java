package com.bridgelabz;

public class Duck extends Bird implements Swimmable , Flyable {

    public Duck(){
        name = "Duck";
        color = Color.WHITE;
    }

    @Override
    public void swim() {
        System.out.println(name +"can swim");
    }

    @Override
    public void fly() {
        System.out.println(name +"can fly");
    }
}
