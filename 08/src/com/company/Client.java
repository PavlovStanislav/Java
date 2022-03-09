package com.company;

public class Client extends Person implements State {
    public String bank_name;


    @Override
    public void output() {
        System.out.printf("Client name is:  %s \t Client surname is: %s \t Bank: %s \n", super.get_name(), super.get_surname(), bank_name);
    }

    Client(String bank, String name, String surname){
        super(name, surname);
        this.bank_name = bank;
    }

    @Override
    public void info(int n){
        if(n==A)
            System.out.println("Active.");
        else if(n==B)
            System.out.println("Not active.");
        else
            System.out.println("Invalid state.");
    }
}
