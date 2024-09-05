package com.juaracoding.oop;

import java.util.Date;

public class MainOOP {

    public static void main(String[] args) {

        Date date = new Date(1722774451000L); //convert date to timestamp, long
        System.out.println("\n");
        System.out.println(date);
        System.out.println(date.getDay());

        System.out.println("\n");
        Fruit apple = new Fruit();
        apple.grams = 60;
        apple.calsPerGrams = 15;
        System.out.println("Kalori apel: " + apple.totalCalories());

        Fruit avocado = new Fruit();
        avocado.grams = 120;
        avocado.calsPerGrams = 22;
        System.out.println("Kalori avocado: " + avocado.totalCalories());

        System.out.println("\n");
        Kotak cube = new Kotak(5);
        cube.drawKotak();
        System.out.println(cube.luasKotak());

        Kotak cubeNext = new Kotak(10);
        cubeNext.drawKotak();
        System.out.println(cubeNext.luasKotak());

        System.out.println("\n");
        Produk baju = new Produk(1,"www.jayaFO.com","Baju Zara","Baju polo shirt warna merah",500000);
        baju.detailProduct();
        baju.addToCart();

        System.out.println("\n");
        Produk sepatu = new Produk(2,"www.shoesmania.com","Sepatu Nike","Sepatu running Nike warna hitam",2000000);
        sepatu.detailProduct();
        sepatu.addToCart();
    }
}
