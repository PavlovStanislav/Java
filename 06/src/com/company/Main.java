package com.company;

import java.util.Calendar;

public class Main {

    public static void main(String[] args) {
        System.out.println("Exe 1.");
        Study course = new Study("Изучение Java - это просто.");
        System.out.println(course.printCourse());
        System.out.println(" ");

        System.out.println("Exe 2.");
        Car A = new Car("audi", "black", 1200);
        Car B = new Car("bmw","1300",1300);
        System.out.println(A);
        System.out.println(B);
        System.out.println(" ");

        System.out.println("Exe 3.");
        House H1 = new House(9,1986, "Туристская 10");
        House H2 = new House(11, 1975, "Солнечная 35");
        System.out.println(H1);
        System.out.println("Эксплуатируется: " + H1.House_age() + " лет");
        System.out.println(H2);
        System.out.println("Эксплуатируется: " + H2.House_age() + " лет");
        System.out.println(" ");

        System.out.println("Exe 4.");
        Tree T1 = new Tree();
        Tree T2 = new Tree(99, "fir tree");
        Tree T3 = new Tree(15,true,"birch");
        System.out.println(T1);
        System.out.println(T2);
        System.out.println(T3);
    }
}
class Study {

    private String course;

    public Study(String course) {
        this.course = course;
    }

        public String printCourse () {
            return this.course;
        }
    }

class Car{
    String color;
    String name;
    int weight;

    public Car(){

    }
    public Car(String color){
        this.color = color;
    }
    public Car(String color, int weight){
        this.color = color;
        this.weight = weight;
    }
    public Car(String name, String color, int weight){
        this.name = name;
        this.color = color;
        this.weight = weight;
    }
    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", weight='" + weight + '\'' + "}";
    }
}

class House{
    int floor;
    int year;
    String name;

    public House(int floor, int year, String name){
        this.floor = floor;
        this.year = year;
        this.name = name;
    }

    public int House_age(){
        return (Calendar.getInstance().get(Calendar.YEAR) - year);
    }
    @Override
    public String toString() {
        return "House{" +
                "floor='" + floor + '\'' +
                ", year='" + year + '\'' +
                ", name='" + name + '\'' + "}";
    }
}

class Tree{
    int year;
    boolean alive;
    String name;

    public Tree () {
        System.out.println("Empty construction.");
    }

    public Tree(int year, String name){
        this.year = year;
        this.alive = true;
        this.name = name;
    }

    public Tree(int year, boolean alive, String name){
        this.year = year;
        this.alive = alive;
        this.name = name;
    }
    @Override
    public String toString() {
        return "Tree{" +
                "year='" + year + '\'' +
                ", is alive='" + alive + '\'' +
                ", name='" + name + '\'' + "}";
    }
}


