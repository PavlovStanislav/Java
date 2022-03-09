package com.company;

public class Vector {
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
