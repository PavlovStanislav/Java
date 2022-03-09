package com.company;

public class Plane {

    public static class wing{
        private int weight;

        public void set_wing_weight(int weight){
            this.weight = weight;
        }

        public int get_wing_weight(){
            return weight;
        }

        public void wing_update(){
            System.out.println("Wing weight was updated. New weight is: " + get_wing_weight());
        }
    }
}
