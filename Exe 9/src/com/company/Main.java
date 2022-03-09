package com.company;

import org.w3c.dom.ls.LSOutput;

public class Main {

    public static void main(String[] args) {

        Exe1(new int[][] {{1,2,3,4},{5,6,7,8,9}});
        Exe2(new int[][] {{1,2,3}, {4,5,6}, {7,8,9}});
        Exe3(new int[][] {{10,11,12}, {1,2,3}, {4,5,6}, {7,8,9}});
        Exe4(11, 11);
    }


    public static void Exe1(int[][] array)

    {
        if (array.length == 0) {
            throw new IllegalArgumentException();
        }
        int max_val = 0;
        for (int [] i : array){
            for(int j : i){
                max_val = Math.max(max_val, j);
            }
        }
        System.out.println("Max element in array is: " + max_val);
        System.out.println(' ');
    }


    public static void Exe2(int[][] array2){
        boolean square = true;
        try{
            for(int[] i : array2){
                if(i.length != array2.length){
                    square = false;
                    break;
                }
            }
        } catch (Exception e){
            e.getMessage();
        }
        if(square){
            System.out.println("This array is square sized\n");
        }
        else{
            System.out.println("This array is not square sized\n");
            }
        System.out.println(" ");
        }


    public static void Exe3(int[][] array3){
        int row_count = 0, max_count = 0, index_max= 0;
        try {
            for (int i = 0; i < array3.length; i++) {
                for (int j = 0; j < array3[i].length; j++) {
                    row_count = row_count + array3[i][j];
                }
                if (max_count < row_count) {
                    max_count = row_count;
                    index_max = i;
                }
                row_count = 0;
            }
        }catch(Exception e){
                e.getMessage();
            }
        System.out.println("Row number " + index_max + " contains largest sum, equals to: " + max_count);
        System.out.println(" ");
        }

    public static void Exe4(int a, int b){
        char[][] array4 = new char[a][b];
        try{
            for(int i = 0; i < array4.length; i++){
                for(int j = 0; j< array4[i].length; j++){
                    int fill = (int)(99 + Math.random()*22);
                    array4[i][j] = (char)fill;
                    System.out.print(array4[i][j] + " ");
                }
                System.out.println();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}


