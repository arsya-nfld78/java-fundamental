package com.juaracoding;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {

        // Try & catch
        try {
            int result = 100/0;
            System.out.println(result);
        }catch (Exception e){
            e.printStackTrace(); //debug true (dev)
            //System.err.println("Error 404"); //debug false (prod)
        }
        System.out.println("next statement");

        try {
            File myObj = new File("filename.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }
}
