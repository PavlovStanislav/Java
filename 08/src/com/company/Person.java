package com.company;


public abstract class Person  {
    public String name;
    public String surname;

    public String get_name(){
        return name;
    }

    public String get_surname(){
        return surname;
    }

    public abstract void output();

    public Person(String name, String surname){
        this.name = name;
        this.surname = surname;
    }

}
