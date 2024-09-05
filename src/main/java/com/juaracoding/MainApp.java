package com.juaracoding;

import com.juaracoding.oop.Car;

public class MainApp {
    public static void main(String[] args) {
        /*System.out.println("Hello champ!");

        int number = 10;
        if (true) {
            System.out.println(number);
            System.out.println("YA");
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(number);
            System.out.println(i);
        }*/

        //string objek
        String country = "Indonesia";
        System.out.println(country.toUpperCase());
        System.out.println(country.toLowerCase());
        System.out.println("Jumlah kata : " +country.length());

        String errorMessage = "Invalid input";
        System.out.println(errorMessage.contains("Invalid"));

        String price1 = "50.000";
        String price2 = "30.000";
        String replacePrice1 = price1.replace(".","");
        String replacePrice2 = price2.replace(".","");
        int numPrice1 = Integer.parseInt(replacePrice1);
        int numPrice2 = Integer.parseInt(replacePrice2);
        System.out.println(numPrice1+numPrice2);
        System.out.println(price1.substring(0,2));

        Car mobil = new Car("Pertalite");
        System.out.println("\n");
        mobil.warna();
        mobil.mesin();
        System.out.println("Bahan: "+mobil.getBahanBakar());
        System.out.println("Tahun pembuatan: "+mobil.getTahunPembuatan());

    }
}