package com.juaracoding;

import java.util.ArrayList;
import java.util.Scanner;

public class CollectionJava {
    public static void main(String[] args) {
       /* ArrayList<String> cars = new ArrayList<String>();
        //create
        cars.add("Toyota");
        cars.add("Honda");
        cars.add("BMW");
        cars.add("Nissan");
        System.out.println(cars);
        System.out.println(cars.size());

        System.out.println("\n");
        //read
        for (String car : cars){
            System.out.println(car);
        }
        /*System.out.println("\n");
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }
        System.out.println(cars.get(0));

        //update
        System.out.println("\n");
        cars.set(2,"Ford");
        System.out.println(cars.get(2));

        //delete
        System.out.println("\n");
        cars.remove(3);
        for (String car : cars){
            System.out.println(car);
        }*/

        //menu crud switch case, loop, collection java

        ArrayList<String> dataProduk = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\nMenu:");
            System.out.println("1. Buat list produk");
            System.out.println("2. Baca list produk");
            System.out.println("3. Ubah list produk");
            System.out.println("4. Hapus list produk");
            System.out.println("5. Keluar program");
            System.out.print("Pilih menu: ");

            int choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Masukkan produk untuk ditambahkan: ");
                    String item = input.nextLine();
                    dataProduk.add(item);
                    System.out.println("Produk berhasil ditambahkan.");
                    break;
                case 2:
                    System.out.println("\nDaftar produk:");
                    for (int i = 0; i < dataProduk.size(); i++) {
                        System.out.println((i + 1) + ". " + dataProduk.get(i));
                    }
                    break;
                case 3:
                    System.out.print("Masukkan nomor produk yang ingin diupdate: ");
                    int index = input.nextInt() - 1;
                    input.nextLine();

                    if (index >= 0 && index < dataProduk.size()) {
                        System.out.print("Masukkan produk baru: ");
                        String newItem = input.nextLine();
                        dataProduk.set(index, newItem);
                        System.out.println("Produk berhasil diupdate.");
                    } else {
                        System.out.println("Nomor produk tidak valid.");
                    }
                    break;
                case 4:
                    System.out.print("Masukkan nomor produk yang ingin dihapus: ");
                    index = input.nextInt() - 1;
                    input.nextLine();

                    if (index >= 0 && index < dataProduk.size()) {
                        dataProduk.remove(index);
                        System.out.println("Produk berhasil dihapus.");
                    } else {
                        System.out.println("Nomor produk tidak valid.");
                    }
                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
        System.out.println("Program selesai.");

    }
}
