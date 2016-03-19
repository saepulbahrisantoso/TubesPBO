/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MR.SBS
 */
public class Petugas {
    string idPetugas;
    
    Petugas(string nama, string alamat, string idPetugas){
        super(nama,alamat);
        this.idPetugas = idPetugas;
    }
    void setId(string idPetugas){
        this.idPetugas=idPetugas;
    }
    string getId(){
        return idPetugas;
    }
}
