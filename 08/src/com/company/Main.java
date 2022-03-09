package com.company;

public class Main {

    public static void main(String[] args) {
        Client a = new Client("WeRobYou", "Abc", "Def");
        a.output();
        a.info(1);


        BankEnployee b = new BankEnployee("YourMoneyIsGone", "Hij","Klm");
        b.output();
        b.info(0);
    }
}
