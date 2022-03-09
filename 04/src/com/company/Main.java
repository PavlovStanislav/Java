package com.company;



public class Main {

    public static void main(String[] args) {

        System.out.println("Exe 1.");

        String[] longword = {"abcdefg", "hijk", "mnlopqrst"};
        String_max(longword);
        System.out.println(" ");

        System.out.println("Exe 2.");
        String str = "abba";
        Palindrom(str);
        System.out.println(" ");

        System.out.println("Exe 3.");
        String str4 = "text byaka byaka byaka text";
        System.out.println(Byaka(str4));
        System.out.println(" ");

        System.out.println("Exe 4.");
        String str6 = "one two three four one ";
        String str7 = "one";
        System.out.println(Include(str6, str7));
        System.out.println(" ");

        System.out.println("Exe 5.");
        String str8 = "This is a test string" + "\n" +
                "The string reversed word by word is:" + "\n" +
                "sihT si a tset gnirts";
        String str9 = Rev(str8);
        System.out.println(str9);


    }

    static void String_max(String[] str) {
        int size = str[0].length();
        String temp = str[0];
        for (String s : str) {
            if (s.length() > size) {
                temp = s;
            }

        }
        System.out.println("Longest word is: " + temp);
    }

    static void Palindrom(String str) {
        StringBuilder str2 = new StringBuilder(str);
        str2.reverse();
        String str3 = str2.toString();
        if (str.equals(str3)) {
            System.out.println("Word is a palindrome.");
        } else {
            System.out.println("Word is not a palindrome.");
        }
    }

    static String Byaka(String str4) {
        String[] array = str4.split(" ");
        String byaka = "byaka";
        String cens = "*Censored*";
        String str5 = " ";
        for (int i = 0; i < array.length; i++) {
            if (array[i].contains(byaka)) {
                array[i] =cens;
            }
            str5 = str5 + " " + array[i];
        }
        return str5;
    }

    static int Include(String str6, String str7) {
        String[] array2 = str6.split(" ");
        int count = 0;
        for (int i = 0; i < array2.length; i++) {
            if (array2[i].contains(str7)) {
                count++;
            }

        }
        return count;
    }

    static String Rev (String str8){
        String input = "";
        String array3[] = str8.split(" ");
        for(int i = 0; i < array3.length; i++){
            String s = array3[i];
            StringBuilder sb = new StringBuilder(s);
            sb.reverse();
            array3[i] = sb.toString();
            input = input + array3[i] + " ";
        }
        return input;
    }

}



