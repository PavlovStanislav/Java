package com.company;

import java.util.Vector;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Vector v1 = new Vector(1,2,3);
        Vector v2 = new Vector(4,5,6);

        System.out.println("Vector 1: " + v1);
        System.out.println("Vector 2: " + v2);
        System.out.println(" ");
        System.out.println("Fist vector in array length: " + Math.ceil(v1.Length() * 10000)/ 10000);
        System.out.println(" ");
        System.out.println("Scalar product: " + v1.Scalar(v2);
        System.out.println(" ");
        System.out.println("Vector multiplication: " + v1.V_mult(v2);
        System.out.println(" ");
        System.out.println("Cos between vectors: " + Math.ceil(v1.Cos_a(v2) * 10000)/ 10000);
        System.out.println(" ");
        System.out.println("Coordinate sum of two vectors: " + v1.Sum(v2));
        System.out.println(" ");
        System.out.println("Coordinate difference between vectors: " + v1.Diff(v2));
        System.out.println(" ");

        Scanner input = new Scanner(System.in);
        System.out.println("Input array size: ");
        int size = input.nextInt();
        Vector[] v = Vector.random(size);
        System.out.println("Vector array: " + Arrays.deepToString(v));

    }


}
 class Vector {
    private double x, y, z;

    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }


    public double Length() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    public double Scalar(Vector v) {
        return x * v.x + y * v.y + z * v.z;
    }

    public Vector V_mult(Vector v) {
        return new Vector(y * v.z - z * v.y, z * v.x - x * v.z, x * v.y - y * v.x);
    }

    public double Cos_a(Vector v) {
        return (Scalar(v) / Length() * v.Length());
    }

    public Vector Sum(Vector v) {
        return new Vector(x * v.x, y * v.y, z * v.z);
    }

    public Vector Diff(Vector v) {
        return new Vector(x - v.x, y - v.y, z - v.z);
    }

    public static Vector[] random(int n) {
        Vector[] v3 = new Vector[n];
        for (int i = 0; i < n; i++) {
            v3[i] = new Vector(Math.ceil((Math.random() + 5) * 10000) / 10000, Math.ceil((Math.random() + 5) * 10000) / 10000, Math.ceil((Math.random() + 5) * 10000) / 10000);
        }
        return v3;
    }
    @Override
    public String toString() {
        return "{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                "}";
    }
}