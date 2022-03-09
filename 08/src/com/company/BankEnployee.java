package com.company;

public class BankEnployee extends Person implements State{
   public String bank;


    @Override
    public void output(){
        System.out.printf("Employee name: %s \t Employee surname: %s \t Bank: %s \n", super.get_name(), super.get_surname(), bank);
        }

    BankEnployee(String bank, String name, String surname){
    super(name, surname);
    this.bank = bank;}


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

