package com.juaracoding.oop;

public class Segitiga extends BidangDatar{

    //polymorph overriding
    @Override
    void draw() {
        int sisi = 10;
        for (int x = 0; x < sisi; x++) {
            for (int y = 0; y <= x; y++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
