/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication;

/**
 *
 * @author 1301144328_HendrawanIF3008
 */
public class TempatWisata {
    private String nama;
    private String kota;
    private String provinsi;
    private double harga;
    private String jenisWisata;

    public TempatWisata(String nama, String kota, String provinsi, double harga, String jenisWisata) {
        this.nama = nama;
        this.kota = kota;
        this.provinsi = provinsi;
        this.harga = harga;
        this.jenisWisata = jenisWisata;
    }

    public TempatWisata(String nama, double harga, String jenisWisata) {
        this.nama = nama;
        this.harga = harga;
        this.jenisWisata = jenisWisata;
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

    public double getHarga() {
        return harga;
    }

    public String getJenisWisata() {
        return jenisWisata;
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

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public void setJenisWisata(String jenisWisata) {
        this.jenisWisata = jenisWisata;
    }
}