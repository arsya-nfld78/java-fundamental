package com.juaracoding.oop;

public class MainConcept {
    public static void main(String[] args) {

        System.out.println("\n");
        //encapsule
        User admin = new User();
        admin.setUsername("admin");
        admin.setPassword("W4p@ss");
        System.out.println(admin.getUsername());
        System.out.println(admin.getPassword());

        System.out.println("\n");
        User staff = new User();
        staff.setUsername("staff");
        staff.setPassword("W4p@ss");
        System.out.println(staff.getUsername());
        System.out.println(staff.getPassword());

        //change pass
        staff.setCurrentPassword("W4p@ss");
        staff.setNewPassword("Ab12C");
        staff.setConfirmPassword("Ab12C");
        staff.changePassword(staff.getCurrentPassword(), staff.getNewPassword(), staff.getConfirmPassword());

        //polymorph overloading
        System.out.println("\n");
        Calculator kalkulator = new Calculator();
        kalkulator.sum(20,10);
        kalkulator.sum(25,22,12);

        //polymorph overriding
        System.out.println("\n");
        BidangDatar bd = new BidangDatar();
        BidangDatar segitiga = new Segitiga();
        bd.draw();
        segitiga.draw();

        //inheritance
        System.out.println("\n");
        Manager manager1 = new Manager();
        manager1.nama = "Budi";
        manager1.departemen = "QA";
        System.out.println(manager1.nama);
        System.out.println(manager1.departemen);

    }
}
