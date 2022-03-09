package com.company;

public class Car {
    public int weight;
    public String model;
    public char color;
    public float speed;


    public void outPut () {
        System.out.println( model + " weight" + " is: " + weight + "kg");
        System.out.println("Color is: " + color + " and speed is: " + speed);
    }

    public Car (int w, String m, char c, float s) {
        weight = w;
        model = m;
        color = c;
        speed = s;
    }

    public Car () {}
}
