package com.bridgelabz;

public class Crow extends Bird implements Flyable{

    public Crow(){
        name = "Crow";
        color = Color.BLACK;
    }

    @Override
    public void fly() {
        System.out.println(name +"can fly");
    }
}
