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
    String idPelanggan;
    
    public Pelanggan(String nama, String alamat, char jeniskelamin, String idPelanggan){
        super(nama,alamat,jeniskelamin);
        this.idPelanggan = idPelanggan;
    }
    void setId(String idPetugas){
        this.idPelanggan=idPelanggan;
    }
    String getId(){
        return idPelanggan;
    }
}
