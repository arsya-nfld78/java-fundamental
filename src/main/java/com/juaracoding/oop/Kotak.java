package com.juaracoding.oop;

public class Kotak {

   private int sisi;

    Kotak(int sisi){
        this.sisi = sisi;
    }

    void drawKotak() {
        for (int x = 0; x < sisi; x++) {
            for (int y = 0; y < sisi; y++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    int luasKotak() {
        return sisi*sisi;
    }
}
