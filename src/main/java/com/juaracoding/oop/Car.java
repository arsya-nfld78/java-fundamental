package com.juaracoding.oop;

public class Car {

    String bahanBakar;
    int tahunPembuatan = 2000;

    public Car(String bahanBakar){
        this.bahanBakar = bahanBakar;
    }

    public void warna(){
        System.out.println("warna merah");
    }
    public void mesin(){
        System.out.println("mesin 1800cc");
    }

    public int getTahunPembuatan(){
        return tahunPembuatan;
    }
    public String getBahanBakar(){
        return bahanBakar;
    }
}
