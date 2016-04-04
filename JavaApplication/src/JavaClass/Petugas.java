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
public class Petugas extends Orang {
    private int idPetugas;
    
    public Petugas(String nama, String alamat, String jeniskelamin, int idPetugas){
        super(nama,alamat,jeniskelamin);
        this.idPetugas = idPetugas;
    }
    public void setId(int idPetugas){
        this.idPetugas=idPetugas;
    }
    public int getId(){
        return idPetugas;
    }
    @Override
    public String toString() {
        return (" Id Petugas   : " +this.getId()+
                " Nama  : "+ this.getNama() +
                " Alamat : "+ this.getAlamat() +
                " Jenis Kelamin : " + this.getJenisKelamin());
    }
}
