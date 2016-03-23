/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MR.SBS
 */
public class Perjalanan {
    PaketWisata paket;
    int jumlahpelanggan;
    Pelanggan[] pelanggan;
    
    Perjalanan(){
        jumlahpelanggan=0;
    }
    void addPelanggan(Pelanggan p){
        pelanggan[jumlahpelanggan] = p;
        jumlahpelanggan++;
    }
    void setPaket(PaketWisata paket){
        this.paket = paket;
    }
    PaketWisata getPaket(){
       return paket;
    }
    void setJumlahPelanggan(int jumlahpelanggan){
        this.jumlahpelanggan = jumlahpelanggan;
    }
    int getjumlahpelanggan(){
        return jumlahpelanggan;
    }
}
