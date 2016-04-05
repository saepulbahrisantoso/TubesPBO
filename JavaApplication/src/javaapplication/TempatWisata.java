package javaapplication;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author 1301144328_HendrawanIF3008
 */
public class TempatWisata {
    private String nama;
    private String kota;
    private String provinsi;

    public TempatWisata(String nama, String kota, String provinsi) {
        this.nama = nama;
        this.kota = kota;
        this.provinsi = provinsi;
    }

    public String getNama() {
        return nama;
    }

    public String getKota() {
        return kota;
    }

    public String getProvinsi() {
        return provinsi;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setKota(String kota) {
        this.kota = kota;
    }

    public void setProvinsi(String provinsi) {
        this.provinsi = provinsi;
    }

    @Override
    public String toString() {
       return (" Tempat Wisata   : " +this.getNama()+ '\n' +
               " Kota  : "+ this.getKota() + '\n' +
               " Provinsi : " + this.getProvinsi());
    }
}