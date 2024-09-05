package com.juaracoding.oop;

public class Produk {

    int productId;
    String imageUrl;
    String productName;
    String description;
    double price;

    protected Produk(int productId, String imageUrl, String productName, String description, double price){
        this.productId = productId;
        this.imageUrl = imageUrl;
        this.productName = productName;
        this.description = description;
        this.price = price;
    }

    protected void addToCart(){
        System.out.println("Berhasil dimasukkan ke keranjang");
    }

    protected void detailProduct(){
        System.out.println("ID: " +productId);
        System.out.println("Nama Produk: "+productName);
        System.out.println("Deskripsi Produk: "+description);
        System.out.println("Harga: Rp"+price);
        System.out.println("URL: " +imageUrl);

    }

}
