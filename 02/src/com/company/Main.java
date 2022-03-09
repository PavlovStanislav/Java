package com.company;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("Упаржнение 1");
	    System.out.println("Я");
        System.out.println("Хорошо");
        System.out.println("Знаю");
        System.out.println("Джава");
        System.out.println(" ");

        System.out.println("Упаржнение 2");
        int res1 = (46 + 10) * (10 / 3);
        int res2 = (29) * (4) * (-15);
        System.out.println(res1);
        System.out.println(res2);
        System.out.println(" ");

        System.out.println("Упаржнение 3");
        int number = 10500;
        int result =  ((number / 10) / 10);
        System.out.println(result);
        System.out.println(" ");

        System.out.println("Упаржнение 4");
        float numb_1 = 3.6f;
        float numb_2 = 4.1f;
        float numb_3 = 5.9f;
        float result2 = numb_1*numb_2*numb_3;
        System.out.println(result2);
        System.out.println(" ");

        System.out.println("Упаржнение 5");
        System.out.println("Введите числа: ");
        Scanner scan = new Scanner(System.in);
        int numb1 = scan.nextInt();
        int numb2 = scan.nextInt();
        int numb3 = scan.nextInt();
        System.out.println(numb1);
        System.out.println(numb2);
        System.out.println(numb3);
        System.out.println(" ");

        System.out.println("Упаржнение 6");
        System.out.println("Введите число: ");
        int b = scan.nextInt();
        if(b%2 != 0){
            System.out.println("Нечетное");
        } else if(b>100){
            System.out.println("Выход за пределы диапазона");
        }
        else{
            System.out.println("Четное");
        }
    }
}

