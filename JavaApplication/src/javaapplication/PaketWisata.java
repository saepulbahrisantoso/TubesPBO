/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication;

/**
 *
 * @author Amalia
 */
public class PaketWisata {
    private TempatWisata[] daftarTujuanWisata;
	private String JenisWisata;
	private int Kapasitas;
	private int nTempat=0;
	private double Biaya;
	
	public void addTempatWisata(TempatWisata w){
		if(nTempat<kapasitas){
			this.w[nTempat]=w;
			nTempat++;
		}
	}
	
	public double getBiaya(){
		return Biaya;
	}
	
	public String getJenisWisata(){
		return JenisWisata;
	}
	
	public int getKapasitas(){
		return Kapasitas;
	}
	
	public void setKapasitas(int Kapasitas){
		this.Kapasitas=Kapasitas;
	}
	
	public void setBiaya(int Biaya){
		this.Biaya=Biaya;
	}
	
	public void setJenisWisata(String JenisWisata){
		this.JenisWisata=JenisWisata;
	}
}
