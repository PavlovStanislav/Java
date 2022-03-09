package com.company;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Main {

    public static void main(String[] args) {
        System.out.println("Exe 1.");
        Truck truck = new Truck(11000, "Scania", 'b', 120.F, 4, 100000);
        truck.outPut();
        truck.add_wheels(8);
        System.out.println(" ");


        System.out.println("Exe 2.");
        System.out.println("Input age. For ChildClass output: ");
        Scanner scan = new Scanner(System.in);
        String input = scan.next();
        int numb = parseInt(input);
        ChildClass qq = new ChildClass();
        qq.set_age(numb);
        System.out.println("Age output, from ChildClass: " + numb);
        System.out.println(" ");

        System.out.println("Exe 3.");
        ChildClass au = new ChildClass();
        System.out.println("Input name, for ChildClass set_name: ");
        au.set_name(scan.next());
        String output = au.get_age();
        System.out.println("Name is: " + output);
        System.out.println(" ");

        System.out.println("Exe 5.");
        Plane.wing left_wing = new Plane.wing();
        left_wing.set_wing_weight(333);
        left_wing.wing_update();

        Plane.wing right_wing = new Plane.wing();
        right_wing.set_wing_weight(555);
        right_wing.wing_update();


    }


}