package javaapplication;
import java.util.ArrayList;

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
    private ArrayList<Pelanggan> turis = new ArrayList<Pelanggan>();
    
    public Perjalanan(Pelanggan p, PaketWisata paket){
        //addPelanggan(p);
        
    }
    public void addPelanggan(Pelanggan p){
        turis.add(p);
    }
    public void removePelanggan(String nama) {
        for(int i=0; i<turis.size();i++){
            if(turis.get(i).getNama().equals(nama)){
                turis.remove(i);
            }
        }
    }
    
    public void setPaket(PaketWisata paket){
        this.paket = paket;
    }
    
    public PaketWisata getPaket(){
       return paket;
    }
    
    public ArrayList<Pelanggan> getAllPelanggan(){
        return turis;
    }
    
    public int getJumlahPelanggan(){
        return turis.size();
    }
    
}
