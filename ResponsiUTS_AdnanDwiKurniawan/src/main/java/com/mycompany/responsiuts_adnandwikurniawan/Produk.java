/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.responsiuts_adnandwikurniawan;

/**
 *
 * @author ACER
 */
public class Produk {
    private String namaProduk;
    private int harga;
    
    public Produk(String namaProduk, int harga){
        this.namaProduk = namaProduk;
        this.harga = harga;
    }
    
    public String getNamaProduk(){
         return namaProduk;
     }
    
    public void setNamaProduk(String namaProduk){
         this.namaProduk = namaProduk;
     }
     
    public int getHarga(){
        return harga;
    } 
    
    public void setHarga(int harga){
        this.harga = harga;
    }
    
    void tampilkanInfo(){
        System.out.println("Nama Produk: "+namaProduk);
        System.out.println("Harga: Rp."+harga);
    }
}

class Elektronik extends Produk{
    int garansi;
    public Elektronik(String namaProduk, int harga, int garansi){
        super(namaProduk,harga);
        this.garansi = garansi;
    }
    public int getGaransi(){
        return garansi;
    }
    public void setGaransi(int garansi){
        this.garansi = garansi;
    }
    
    @Override
    void tampilkanInfo(){
        super.tampilkanInfo();
        System.out.println("Garansi: "+garansi+" Tahun");
    }
}

class Makanan extends Produk{
    String tanggalKedaluarsa;
    public Makanan(String namaProduk, int harga, String tanggalKedaluarsa){
        super(namaProduk,harga);
        this.tanggalKedaluarsa = tanggalKedaluarsa;
    }
    public String getTanggalKedaluarsa(){
        return tanggalKedaluarsa;
    }
    public void setTanggalKedaluarsa(String tanggalKedaluarsa){
        this.tanggalKedaluarsa = tanggalKedaluarsa;
    }
    @Override
    void tampilkanInfo(){
        super.tampilkanInfo();
        System.out.println("Tanggal Kedaluarsa: "+tanggalKedaluarsa);
    }
}
