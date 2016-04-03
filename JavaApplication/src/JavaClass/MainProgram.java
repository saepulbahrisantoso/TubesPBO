/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaClass;

/**
 *
 * @author Asus
 */

import java.util.*;
import java.io.*;
import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args) {
        MenuUtama();
    }

public final static void ClearScreen() {
    try {
        final String os = System.getProperty("os.name");

        if (os.contains("Windows")){
            Runtime.getRuntime().exec("cls");
        }
        else {
            Runtime.getRuntime().exec("clear");
        }
    }
    catch (final Exception e) {
        for(int i = 0; i < 1000; i++) {
            System.out.println();
        }
    }
} 
/////////////////////////////////// MENU UTAMA //////////////////////////////////    
    
    public static void MenuUtama(){
        ClearScreen();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu Utama Sistem biro perjalanan");
        System.out.println("1. Menu admin");
        System.out.println("2. Menu non admin");
        System.out.print("Pilihan : "); 
        int pilih = scanner.nextInt();
        switch (pilih) {
            case 1 : MenuAdmin();
                     break;
            case 2 : MenuNonAdmin();
                     break;
            default : System.out.println("Salah input");
                     break;
        }
    }
    
/////////////////////////////////// MENU ADMIN //////////////////////////////////
    
    public static void MenuAdmin() {
        ClearScreen();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu Admin");
        System.out.println("1. Menu Petugas");
        System.out.println("2. Menu Pelanggan");
        System.out.println("3. Menu Tempat wisata");
        System.out.println("4. Menu Paket wisata");
        System.out.println("5. Menu perjalanan");
        System.out.println("6. Exit");
        System.out.print("Pilihan : ");
        int pilih = scanner.nextInt();
        switch (pilih) {
            case 1 : MenuPetugas();
                     break;
            case 2 : MenuPelanggan();
                     break;
            case 3 : MenuTempatWisata();
                     break;
            case 4 : MenuPaketWisata();
                     break;
            case 5 : MenuPerjalanan();
                     break;
            case 6 : MenuUtama();
                     break;
            default : System.out.println("Salah input");
                     break;
        }
    }
     public static void MenuPetugas(){
        ClearScreen();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu Kelola Petugas");
        System.out.println("1. Tambah Petugas");
        System.out.println("2. Edit Petugas");
        System.out.println("3. Hapus Petugas");
        System.out.println("4. Lihat petugas");
        System.out.println("5. Kembali");
        System.out.print("Pilihan : ");
        int pilih = scanner.nextInt();
        List<Petugas> listpetugas = new ArrayList<Petugas>();
        switch (pilih) {
            case 1 :
                    int jumlah = listpetugas.size();
                    System.out.println("Nama : "); String nama = scanner.next();
                    System.out.println("Alamat : ");  String alamat = scanner.next();
                    System.out.println("Jenis Kelamin : "); String jk = scanner.next();
                    jumlah++;
                    AddPetugas(nama,alamat,jk,jumlah,listpetugas);
                    System.out.println("Petugas berhasi ditambahkan ! ");
                    MenuPetugas();
                    break;
            case 2 : 
                    System.out.println("Masukkan id petugas yang akan diedit : "); String id = scanner.next();
                    
                    break;
            case 3 : MenuTempatWisata();
                     break;
            case 4 : MenuPaketWisata();
                     break;
            case 5 : MenuAdmin();
                     break;
            default : System.out.println("Salah input");
            
                     break;
        }
     }
     public static void AddPetugas(String nama, String alamat, String jk, int jumlah, List list) {
         Petugas petugas = new Petugas(nama,alamat,jk,jumlah);
         list.add(petugas);
     }
     

     public static void MenuPelanggan(){
        ClearScreen();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu Kelola Pelanggan");
        System.out.println("1. Tambah Pelanggan");
        System.out.println("2. Edit Pelanggan");
        System.out.println("3. Hapus Pelanggan");
        System.out.println("4. Lihat Pelanggan");
        System.out.println("5. Kembali");
        System.out.print("Pilihan : ");
        int pilih = scanner.nextInt();
        List<Pelanggan> listpelanggan = new ArrayList<Pelanggan>();
        switch (pilih) {
            case 1 : 
                    int jumlah = listpelanggan.size();
                    System.out.println("Nama : "); String nama = scanner.next();
                    System.out.println("Alamat : ");  String alamat = scanner.next();
                    System.out.println("Jenis Kelamin : "); String jk = scanner.next();
                    jumlah++;
                    AddPelanggan(nama,alamat,jk,jumlah,listpelanggan);
                    System.out.println("Pelanggan berhasil ditambahkan ! ");
            case 2 : MenuPelanggan();
                     break;
            case 3 : MenuTempatWisata();
                     break;
            case 4 : MenuPaketWisata();
                     break;
            case 5 : MenuAdmin();
                     break;
            default : System.out.println("Salah input");
                     break;
        }
     }
     
     public static void AddPelanggan(String nama, String alamat, String jk, int jumlah, List list) {
         Pelanggan pelanggan = new Pelanggan(nama,alamat,jk,jumlah);
         list.add(pelanggan);
     }
     public static void MenuTempatWisata(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu Kelola Tempat Wisata");
        System.out.println("1. Tambah Tempat Wisata");
        System.out.println("2. Edit Tempat Wisata");
        System.out.println("3. Hapus Tempat Wisata");
        System.out.println("4. Lihat Tempat Wisata");
        System.out.println("5. Kembali");
        System.out.print("Pilihan : ");
        int pilih = scanner.nextInt();
        switch (pilih) {
            case 1 : MenuPetugas();
                     break;
            case 2 : MenuPelanggan();
                     break;
            case 3 : MenuTempatWisata();
                     break;
            case 4 : MenuPaketWisata();
                     break;
            case 5 : MenuAdmin();
                     break;
            default : System.out.println("Salah input");
                     break;
        }
     }
     public static void MenuPaketWisata(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu Kelola Paket Wisata");
        System.out.println("1. Tambah Paket Wisata");
        System.out.println("2. Edit Paket Wisata");
        System.out.println("3. Hapus Paket Wisata");
        System.out.println("4. Lihat PaketWisata");
        System.out.println("5. Kembali");
        System.out.print("Pilihan : ");
        int pilih = scanner.nextInt();
        switch (pilih) {
            case 1 : MenuPetugas();
                     break;
            case 2 : MenuPelanggan();
                     break;
            case 3 : MenuTempatWisata();
                     break;
            case 4 : MenuPaketWisata();
                     break;
            case 5 : MenuAdmin();
                     break;
            default : System.out.println("Salah input");
                     break;
        }
     }
     public static void MenuPerjalanan(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu Kelola Petugas");
        System.out.println("1. Edit Perjalanan");
        System.out.println("2. Hapus Perjalanan");
        System.out.println("3. Lihat Data Perjalanan");
        System.out.println("4. Kembali");
        System.out.print("Pilihan : ");
        int pilih = scanner.nextInt();
        switch (pilih) {
            case 1 : MenuPetugas();
                     break;
            case 2 : MenuPelanggan();
                     break;
            case 3 : MenuTempatWisata();
                     break;
            case 4 : MenuAdmin();
                     break;
            default : System.out.println("Salah input");
                     break;
        }
     }
     
/////////////////////////////////// MENU NON ADMIN //////////////////////////////////
    
    public static void MenuNonAdmin() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu pelanggan");
        System.out.println("1. Lihat data pelanggan");
        System.out.println("2. Menu Pelanggan");
        System.out.println("3. Menu Tempat wisata");
        System.out.println("4. Menu Paket wisata");
        System.out.println("5. Menu perjalanan");
        System.out.println("6. Exit");
        System.out.print("Pilihan : ");
        int pilih = scanner.nextInt();
        switch (pilih) {
            case 1 : MenuPetugas();
                     break;
            case 2 : MenuPelanggan();
                     break;
            case 3 : MenuTempatWisata();
                     break;
            case 4 : MenuPaketWisata();
                     break;
            case 5 : MenuPerjalanan();
                     break;
            case 6 : MenuUtama();
                     break;
            default : System.out.println("Salah input");
                     break;
        }
    }
    
}
