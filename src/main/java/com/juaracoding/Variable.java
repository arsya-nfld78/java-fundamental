package com.juaracoding;

public class Variable {
    public static void main(String[] args) {

        //Program profil
        byte umur = 23;
        int tabunganDompet = 1000000;
        String name = "Arsya Naufaldi";
        String email = "arsya.clk2000@gmail.com";
        char gender = 'L';
        boolean hadir = true;


        System.out.println("Nama : " +name);
        System.out.println("\nUmur : " +umur);
        System.out.println("\nJenis Kelamin : " +gender);
        System.out.println("\nEmail : " +email);
        System.out.println("\nKehadiran? " +hadir);
        System.out.println("\nTabungan : Rp" +tabunganDompet);

        String pathImage = "C:\\Users\\user\\Pictures\\unnamed.jpg";
        System.out.println(pathImage);

        //IMPLICIT CAST
        int data1 = 1050;
        double switchDouble = data1;
        System.out.println("\n" +switchDouble);

        char data2 = 'Y';
        long switchLong = data2;
        System.out.println(switchLong);

        //EXPLICIT CAST
        char dataText = 'm';
        byte switchByte = (byte) dataText;
        System.out.println(switchByte);

        int stock = 5000; // user hp
        short backEnd = (short) stock; // backend tech
        System.out.println(backEnd);

        //passing by value
        int jarak = 12;
        int tambahJarak = jarak;
        tambahJarak = 24;
        System.out.println(tambahJarak);

        //passing by reference
        


    }
}
