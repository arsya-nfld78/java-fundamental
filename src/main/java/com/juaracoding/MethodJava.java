package com.juaracoding;

public class MethodJava {
    public static void main(String[] args) {

        //reusable
        kotak(5); //5x5
        System.out.println("\n");
        kotak(8); //8x8

        System.out.println("\n");
        System.out.println(luasKotak(20));
        System.out.println(luasKotak(12));
        volumeKotak(20);

        System.out.println("\n");
        System.out.println(setName("Arsya","Naufaldi")); //print fungsi setName

        System.out.println("\n");
        System.out.println(login("admin","w4pSS")); //print fungsi login

        System.out.println("\n");
        detailProduct("Minuman","Es Teh Manis",10000);

        System.out.println("\n");
        double gaji = 10000;
        System.out.println("PPH per bulan: "+calculateTax(gaji));
        totalGajiPerTahun(gaji);
    }

    static void kotak(int sisi){
        for (int x = 0; x < sisi; x++) {
            for (int y = 0; y < sisi; y++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //luas kotak
    static double luasKotak (int sisi){
        return sisi*sisi;
    }

    //volumeKotak = luasKotak()*sisi
    static void volumeKotak(int sisi){
        //System.out.println(luasKotak(sisi)*sisi);
        System.out.println(sisi*sisi*sisi);
    }

    static String setName (String firstName, String lastName) {
        return firstName+" "+lastName;
    }

    //login, return value boolean
    static boolean login(String username, String password){
        if (username.equalsIgnoreCase("admin") && password.equals("w4pSS")) {
            return true;
    } else {
            return false;
        }
    }

    static void detailProduct(String category,String productName,int price){
        System.out.println("Kategori: " + category);
        System.out.println("Nama Produk " + productName);
        System.out.println("Harga: " + price);
    }

    //calculateTax(). if salary > 7000, tax 10%. if salary < 7000, tax 0%
    //total salary per year ()
    static double calculateTax(double gaji){
        if (gaji >= 7000){
            return gaji*0.1;
        }else{
            return gaji*0;
        }
    }
    static void totalGajiPerTahun (double gaji){
        double total;
        total = (gaji-calculateTax(gaji))*12;
        System.out.println("Gaji bersih per tahun: Rp"+total);
    }
}
