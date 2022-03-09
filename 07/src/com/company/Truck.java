package com.company;


public class Truck extends Car{
    private int wheels_numb;
    private int max_weight;
    public void add_wheels(int wheels_update){
        wheels_numb = wheels_update;
        System.out.println("Wheels number updated. Now, there are " + wheels_numb + " wheels.");
    }

    public Truck(int w, String m, char c, float s, int truck_wheels, int truck_weight){
        super(w,m,c,s);
        wheels_numb = truck_wheels;
        max_weight = truck_weight;

    }

}