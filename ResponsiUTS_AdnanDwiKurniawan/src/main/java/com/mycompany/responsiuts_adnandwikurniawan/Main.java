/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.responsiuts_adnandwikurniawan;

/**
 *
 * @author ACER
 */
public class Main {
    public static void main(String[] args) {
        Produk elektronik = new Elektronik("Magiccom",300000,1);
        System.out.println("Harga sebelum inflasi: "+elektronik.getHarga());
        elektronik.setHarga(400000);
        elektronik.tampilkanInfo();
        
        System.out.println();
        Produk makanan = new Makanan("Nasgor",15000,"1/10/2024");
        System.out.println("Harga sebelum inflasi: "+makanan.getHarga());
        makanan.setHarga(20000);
        makanan.tampilkanInfo();
        
        System.out.println();
        Pegawai pegawaitetap = new pegawaiTetap("Adnan Dwi Kurniawan",5000000,1000000);
        System.out.println("Gaji sebelum naik pangkat: "+pegawaitetap.getGaji());
        pegawaitetap.setGaji(7000000);
        pegawaitetap.tampilkanInfo();
        
        System.out.println();
        Pegawai pegawaimagang = new pegawaiKontrak("Adnan Dwi Kurniawan",3000000,12);
        System.out.println("Gaji sebelumnya: "+pegawaimagang.getGaji());
        pegawaimagang.setGaji(3500000);
        pegawaimagang.tampilkanInfo();
    }
}
