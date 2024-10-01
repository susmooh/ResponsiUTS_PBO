/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.responsiuts_adnandwikurniawan;

/**
 *
 * @author ACER
 */
public class Pegawai {
    private String namaPegawai;
    private int gaji;
    
    public Pegawai(String namaPegawai, int gaji) {
        this.namaPegawai = namaPegawai;
        this.gaji = gaji;
        
    }
    
    public String getNamaPegawai() {
        return namaPegawai;
    }
    
    public void setNamaPegawai(String namaPegawai) {
        this.namaPegawai = namaPegawai;
    }
    
    public int getGaji() {
        return gaji;
    }
    
    public void setGaji(int gaji) {
        this.gaji = gaji;
    }
    
    void tampilkanInfo(){
        System.out.println("Nama Pegawai: "+namaPegawai);
        System.out.println("Gaji: "+gaji);
    }
}

class pegawaiTetap extends Pegawai{
    int tunjangan;
    public pegawaiTetap(String namaPegawai, int gaji, int tunjangan){
        super(namaPegawai,gaji);
        this.tunjangan = tunjangan;
    }
    public int getTunjangan(){
        return tunjangan;
    }
    public void setTunjangan(int tunjangan){
        this.tunjangan = tunjangan;
    }
    
    @Override
    void tampilkanInfo(){
        super.tampilkanInfo();
        System.out.println("Tunjangan: "+tunjangan);
    }
}

class pegawaiKontrak extends Pegawai{
    int lamaKontrak;
    public pegawaiKontrak(String namaPegawai,int gaji,int lamaKontrak){
        super(namaPegawai,gaji);
        this.lamaKontrak = lamaKontrak;
    }
    public int getLamaKontrak() {
        return lamaKontrak;
    }
    public void setLamaKontrak(int lamaKontrak) {
        this.lamaKontrak = lamaKontrak;
    }
    @Override
    void tampilkanInfo(){
        super.tampilkanInfo();
        System.out.println("lamaKontrak: "+lamaKontrak+" Bulan");
    }

}