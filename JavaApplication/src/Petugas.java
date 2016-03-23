/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MR.SBS
 */
public class Petugas extends Orang {
    String idPetugas;
    
    public Petugas(String nama, String alamat, char jeniskelamin, String idPetugas){
        super(nama,alamat,jeniskelamin);
        this.idPetugas = idPetugas;
    }
    void setId(String idPetugas){
        this.idPetugas=idPetugas;
    }
    String getId(){
        return idPetugas;
    }
}
