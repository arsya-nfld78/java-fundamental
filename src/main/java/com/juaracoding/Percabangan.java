package com.juaracoding;

public class Percabangan {
    public static void main(String[] args) {

        int num1 = 15;
        int num2 = 25;
        if (num1 == num2) {
            System.out.println("YA");
        }
        System.out.println("LANJUT");

        //program ganjil genap
        int a = 224;
        if (a % 2 == 0) {
            System.out.println("\nGenap");
        } else {
            System.out.println("\nGanjil");
        }

        //if majemuk
        // size dan harga
        String size = "XL";
        int price;
        if (size == "S") {
            price = 25000;
        } else if (size == "M") {
            price = 30000;
        } else if (size == "L") {
            price = 35000;
        } else {
            price = 40000;
        }
        System.out.println("\nukuran : " + size + " harga : " + price);

        //login username pass, string object
        String username = "Admin";
        String password = "w4pSS";
        if (username.equalsIgnoreCase("admin") && password.equals("w4pSS")) { // TRUE AND TRUE
            System.out.println("login berhasil");
        } else {
            System.out.println("login gagal");
        }

        //nested if
       /* int totalAmount = 1000000;
        int amount;
        boolean isMember = true;
        boolean isFirstTimeBuyer = false;
        boolean hasCoupon = true;
        if (totalAmount > 500000) {
            if (isMember == true) {
                amount = totalAmount - (totalAmount * 10/100);

            } else if (isFirstTimeBuyer == true){

            } else if (hasCoupon == true){

            }

        } else {
            amount = totalAmount;
        }*/

        //Scanner nested if
        /*Scanner input = new Scanner(System.in);
        System.out.println("\nTotal Amount : ");
        int totalAmount = input.nextInt();
        System.out.println("Total Amount : " + totalAmount);

        float discount = 0.0f;
        boolean isMember = false;
        boolean isFirstTimeBuyer = true;
        boolean hasCoupon = false;

        if (totalAmount > 500000) {
            if (isMember == true) {
                discount = 0.1f;
                System.out.println("Diskon : " + discount);
                System.out.println("Harga :" + (totalAmount - totalAmount * discount));
            } else if (isFirstTimeBuyer == true) {
                discount = 0.05f;
                System.out.println("Diskon : " + discount);
                System.out.println("Harga :" + (totalAmount - totalAmount * discount));
            } else if (hasCoupon == true) {
                discount = 0.02f;
                System.out.println("Diskon : " + discount);
                System.out.println("Harga :" + (totalAmount - totalAmount * discount));
            }
        } else {
            System.out.println("Belum dapat diskon");
            System.out.println("Harga :" + totalAmount);
        }

        // switch case
        System.out.println("Masukkan Menu 1-5 : ");
        int menu = input.nextInt();
        switch (menu) {
            case 1:
                System.out.println("View Data");
                break;
            case 2:
                System.out.println("Input data");
                break;
            case 3:
                System.out.println("Modify data");
                break;
            case 4:
                System.out.println("Delete data");
                break;
            default:
                System.out.println("Invalid menu");

        }*/

        // ternary
        int stock = 0;
        String keterangan = (stock > 0) ? "stock tersedia" : "stock habis";
        System.out.println("\nKeterangan : " +keterangan);

    }
}

