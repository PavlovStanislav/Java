package com.company;

abstract class Human {
    private String name;
    private String surname;

    private Human (String name, String surname){
        this.name = name;
        this.surname = surname;
    }

    public String get_name(){return name;}
    public String get_surname(){return surname;}
    public abstract void output();
}
