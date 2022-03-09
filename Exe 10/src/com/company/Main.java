package com.company;


import static com.company.File_read.*;
import java.io.File;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println(" ");
        System.out.println("Exe 1");
        List<String> arr_list = ReadFiles("file1.txt");
        System.out.println(arr_list);

        System.out.println(" ");
        System.out.println("Exe 2");
        System.out.println("Contents before write.");
        System.out.println(ReadFiles("file2.txt"));
        WriteToFile("file2.txt","\n 5678");
        System.out.println(ReadFiles("file2.txt"));

        System.out.println(" ");
        System.out.println("Exe 3");
        System.out.println("Merge files.");
        MergeFiles("file1.txt", "file2.txt", "empty.txt");
        System.out.println(ReadFiles("empty.txt"));

        System.out.println(" ");
        System.out.println("Exe 4");
        CopyFile("file1.txt");
        System.out.println(ReadFiles("Copy of file1.txt"));

        System.out.println(" ");
        System.out.println("Exe 5");
        List<String> empty = FindFile("file1.txt", new File( "C:\\Users\\325\\IdeaProjects\\Exe 10"));
        System.out.println(empty);

        System.out.println(" ");
        System.out.println("Exe 6");
        List<String> qq = TextSearch("789", new File("C:\\Users\\325\\IdeaProjects\\Exe 10\\src\\com\\company\\"));
        System.out.println(qq);
    }
}
