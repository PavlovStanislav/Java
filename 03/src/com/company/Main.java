package com.company;

import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println("Exercise 1.");
        Exe1();
        System.out.println("Exercise 2.");
        Exe2();
        System.out.println("Exercise 3.");
        Exe3();
        System.out.println("Exercise 4.");
        Exe4();
        System.out.println("Exercise 5.");
        Exe5();
        System.out.println("Exercise 6.");
        Exe6();

    }


    public static void Exe1() {
        Scanner input = new Scanner(System.in);
        System.out.println("Input array size: ");
        int size = input.nextInt();
        int[] array = new int[size];
        System.out.println("Input array elements: ");
        for(int i = 0; i < array.length; i++){
            array[i] = input.nextInt();
            }
        boolean check = true;
        for(int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                check = false;
                break;
            }
        }

            if(check){
                System.out.println("Ok");
            }
            else{

                System.out.println("Please try again.");
            }


    }

    public static void Exe2() {
        Scanner input = new Scanner(System.in);
        System.out.println("Input array siza: ");
        int size = input.nextInt();
        int[] array = new int[size];
        System.out.println("Input array elements: ");
        for(int i = 0; i < array.length; i++){
            array[i] = input.nextInt();
        }
        System.out.println("Result " + Arrays.toString(array) + "\n");
    }

    public static void  Exe3() {
        int[] array2 = new int[] {25,54,84,52,18,93};
        System.out.println("Array1: " + Arrays.toString(array2));
        int temp = array2[0];
        array2[0] = array2[array2.length - 1];
        array2[array2.length - 1] = temp;
        System.out.println("Array2: " + Arrays.toString(array2) + "\n");
    }

    public static void Exe4(){
        int[] array3 = new int[] {1,7,7,3,3,3,7};
        for(int i = 0; i < array3.length; i++){
            boolean check2 = true;
            for(int j = 0; j < array3.length; j++){
                if(array3[i] == array3[j] && i != j){
                    check2 = false;
                    break;
                }
            }
            if(check2){
                System.out.println("Unique number is: " + array3[i] + "\n");
            }
        }
    }

    public static void Exe5() {
        Scanner input2 = new Scanner(System.in);
        System.out.println("Input value: ");
        int n = input2.nextInt();
        int a = 0;
        int b = 1;
        for(int i = 2; i <= n; ++i){
            int next = a + b;
            a = b;
            b = next;
            }
        System.out.println("n- th number fibonachi value is: " + b + "\n");
    }

    public static void Exe6(){
        Scanner input2 = new Scanner(System.in);
        System.out.println("Input array size: ");
        int size = input2.nextInt();
        int[] array4 = new int[size];
        System.out.println("Input array elements: ");
        for(int i = 0; i < array4.length; i++){
            array4[i] = input2.nextInt();
            }
        var res = sort_array(array4);
        System.out.println("Assorted array: " + Arrays.toString(array4));

    }
    private static int[] sort_array(int[] arr){
        int size2 = arr.length;
        if(size2 < 2) return arr;
        int middle = size2 / 2;
        return merge_array(sort_array(Arrays.copyOfRange(arr,0, middle)),
        sort_array(Arrays.copyOfRange(arr, middle, size2)));
    }

    private static int[] merge_array(int[] arr_1, int[] arr_2){
        int end_1 = arr_1.length, end_2 = arr_2.length;
        int a = 0, b = 0, end = end_1 + end_2;
        int[] output = new int[end];
        for(int i = 0; i < end; i++){
            if(b < end_2 && a < end_1){
                if(arr_1[a] > arr_2[b]) output[i] = arr_2[b++];
                else output[i] = arr_1[a++];
            }else if (b < end_2){
                output[i] = arr_2[b++];
            }else{
                output[i] = arr_1[a++];
            }
        }
        return output;
    }
}
