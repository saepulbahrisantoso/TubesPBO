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
    string idPelanggan;
    
    Pelanggan(string nama, string alamat, string idPetugas){
        super(nama,alamat);
        this.idPelanggan = idPelanggan;
    }
    void setId(string idPetugas){
        this.idPelanggan=idPelanggan;
    }
    string getId(){
        return idPelanggan;
    }
}
