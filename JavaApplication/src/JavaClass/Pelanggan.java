package JavaClass;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MR.SBS
 */
public class Pelanggan extends Orang {
    int idPelanggan;
    
    public Pelanggan(String nama, String alamat, String jeniskelamin, int idPelanggan){
        super(nama,alamat,jeniskelamin);
        this.idPelanggan = idPelanggan;
    }
    void setId(int idPetugas){
        this.idPelanggan=idPelanggan;
    }
    int getId(){
        return idPelanggan;
    }
}

