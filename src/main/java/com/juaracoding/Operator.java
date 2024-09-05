package com.juaracoding;

public class Operator {
    public static void main(String[] args) {

        int modulus = 5 % 2;
        System.out.println(modulus);

        //Suffix
        int x = 3;
        int num1 = 20 * x++;
        System.out.println("\n" +num1);

        //Prefix
        int y = 3;
        int num2 = 20 * ++y;
        System.out.println("\n" +num2);

        int hasil = (10+5) * 7 + (2*2);
        System.out.println("\n" +hasil);

        //assignment
        int a = 20;
        a += 7; // a = a+7
        System.out.println("\n" +a);

        //relational
        int b = a;
        System.out.println(a == b);
        System.out.println(a > b);
        System.out.println(a >= b);

        //bitwise
        a = 30;
        b = 12;
        int c = 1;
        System.out.println(a & b);
        System.out.println(a >> c);
        System.out.println(a << c);

    }
}
