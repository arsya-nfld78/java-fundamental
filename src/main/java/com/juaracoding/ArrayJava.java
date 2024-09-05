package com.juaracoding;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayJava {
    public static void main(String[] args) {

        //cara 1
        int[] nilai = {1,2,3,4,5,20,21};
        // for i
        for (int x = 0; x < nilai.length; x++){
            System.out.println(nilai[x]);
        }

        //cara 2
        int[] grades = new int[5];
        grades [0] = 75;
        grades [1] = 20;
        grades[2] = 10;
        grades[3] = 100;
        grades[4] = 80;
        grades[2] = 45;

        //foreach
        for (double grade : grades) {
            System.out.printf("%.2f\n", grade);
        }

        //multidimensi [baris] & [kolom]
        int [][] numbers = {{1,2,3,4},{5,6,7}};
        int rowIndex = 0;
        int coloumnIndex = 3;
        System.out.println("\n");
        System.out.println(numbers[1][2]);
        System.out.println(numbers[rowIndex][coloumnIndex]);

        System.out.println("\n");
        for (int i = 0; i < numbers.length; i++) { //row
            for (int j = 0; j < numbers[i].length; j++) { //coloumn
                System.out.println(numbers[i][j]);
            }
        }

        Scanner input = new Scanner(System.in);
        /*System.out.println("\nInput data : ");
        int dataLength = input.nextInt();
        int[] prices = new int[dataLength];
        int totalPrice = 0;

        for (int y = 0; y < prices.length; y++){
            System.out.println("Input harga "+(y+1)+":");
            prices[y] = input.nextInt();
        }
        for (int price : prices){
            totalPrice += price;
        }

        System.out.println("Total price = " +totalPrice);*/

        //search
        System.out.println("\n");
        boolean isFound = false;
        String[] cars = {"Toyota", "BMW", "Mercedes Benz", "Nissan", "Honda"};
        System.out.println("Cari mobil : ");
        String search = input.next();

        for (int z=0; z<cars.length; z++){
            if (search.equalsIgnoreCase(cars[z])){
                isFound = true;
                break;
            }
        }
        if (isFound){
            System.out.println("Data ditemukan");
        } else {
            System.out.println("Data tidak ditemukan");
        }
        //ternary
        /*String pesan = isFound ? "Data ditemukan" : "Data tidak ditemukan";
        System.out.println(pesan);*/

        //search longest text
        String longText = cars[0];
        for (int a = 0; a < cars.length; a++) {
            if (longText.length() < cars[a].length()){
                longText = cars[a]; // index 2 mercy
            }
        }
        System.out.println("Teks terpanjang : " +longText);

        //sort
        // Cara sorting 2
        // Mengurutkan array
        Arrays.sort(cars);

        // Menampilkan hasil pengurutan
        for (String car : cars) {
            System.out.println(car);
        }

    }
}
