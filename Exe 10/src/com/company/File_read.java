package com.company;

import java.util.*;
import java.io.*;
import java.io.File;
import java.io.IOException;

public class File_read {


    public static List<String> ReadFiles(String fileName) {
        List<String> arr_list = null;

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String text = null;
            arr_list = new ArrayList<>();
            while ((text = reader.readLine()) != null) {
                arr_list.add(text);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return arr_list;
    }

    public static void WriteToFile(String fileName, String text){
        File file = new File(fileName);
        if(!file.exists()){
            System.out.printf("File %s was not found.", fileName);
        }
        try(FileWriter write = new FileWriter(file, true)){
            write.write(text);
        } catch (IOException e){
            System.out.println("Error " + e.getMessage());
        }
    }

    public static File MergeFiles(String name_one, String name_two, String file_third){
        File empty = null;
        File f1 = new File(name_one);
        File f2 = new File(name_two);

        if(!f1.exists() && !f2.exists()){
            System.out.printf("Files: %s, %s \nwere not found", name_one, name_two);
        }
        try{
            empty = new File(file_third);
            boolean write = empty.createNewFile();
            if(write){
                System.out.println("File was created.");
            } else{
                System.out.println("File already exists.");
            }
            for(String i : ReadFiles(f1.getName())){
                WriteToFile(file_third, i + "\n");
            }
            for(String j : ReadFiles(f2.getName())){
                WriteToFile(file_third, j + "\n");
            }
        } catch (IOException e){
          e.printStackTrace();
        }
        return empty;
    }

    public static void CopyFile(String fileName){
        try(FileInputStream input = new FileInputStream(fileName);
            FileOutputStream output = new FileOutputStream("Copy of " + fileName)){
            byte[] list = new byte[input.available()];
            while(input.read(list, 0, list.length) > 0)
                output.write(list, 0, list.length);
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public static List<String> FindFile(String fileName, File dir){
        List<String> file_list = new ArrayList<>();
        File[] list = dir.listFiles();
        if(list != null){
            for(File file : list){
                if(file.getName().toLowerCase().contains(fileName.toLowerCase())){
                    file_list.add(file.getName());
                }
            }
        } else{
            file_list.add("Directory is empty.");
        }
        return file_list;
    }

    public static List<String> TextSearch(String text, File dir){
        File[] list2 = dir.listFiles();
        List<String> file_list = new ArrayList<>();
        if(list2 != null){
            for(File file : list2){
                for(String i : ReadFiles(file.getParent() + File.separator + file.getName())){
                    if(i.toLowerCase().contains(text.toLowerCase())){
                        file_list.add(file.getName());
                    }
                }
            }
        } else {
            file_list.add("Directory is empty.");
        }
        return file_list;
    }
}


