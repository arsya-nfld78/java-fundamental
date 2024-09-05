package com.juaracoding;

import java.util.Scanner;

public class Perulangan {
    public static void main(String[] args) {

        //for loop
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        System.out.println("Lanjut");


        for (int x = 1; x < 10; x++){
            x++;
            System.out.println(x);
        }

        //nested loop
        //segitiga siku
        int sisi = 5;
        for (int x = 0; x < sisi; x++) {
            for (int y = 0; y < x; y++) {
                System.out.print("*");
            }
            System.out.println();
        }

        int lebar = 5;
        for (int x = 0; x < lebar; x++) {
            for (int y = lebar; y > x; y--) {
                System.out.print("*");
            }
            System.out.println();
        }

        //while
        int z = 0;
        while (z < 0) {
            System.out.println("z = " + z);
            z++;
        }

        //do while
        int a = 0;
        do {
            System.out.println("a = " + a);
            a++;
        } while (a < 0);

        Scanner input = new Scanner(System.in);
        System.out.println("\nangka : ");

        while (true) {
            System.out.println("*");
            int angka = input.nextInt();
            if (angka == 0) break;

            }

    }
}