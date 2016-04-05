package JavaApplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MR.SBS
 */
public class Aplikasi {
    /////////////////////////////////// MENU UTAMA //////////////////////////////////    
    
    public static void MenuUtama(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu Utama Sistem biro perjalanan");
        System.out.println("1. Menu admin");
        System.out.println("2. Menu non admin [MASIH BETA, PROGRESS SELANJUTNYA KARENA TIDAK ADA DI PROPOSAL]" );
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
        Scanner scanner = new Scanner(System.in);
        List<Petugas> listpetugas = new ArrayList<Petugas>();
        System.out.println("Menu Admin");
        System.out.println("1. Menu Petugas");
        System.out.println("2. Menu Pelanggan");
        System.out.println("3. Menu Tempat wisata");
        System.out.println("4. Menu Paket wisata");
        System.out.println("5. Menu Perjalanan");
        System.out.println("6. Exit"); 
        System.out.print("Pilihan : "); 
        int pilih = scanner.nextInt();
        switch (pilih) {
            case 1 : MenuPetugas(listpetugas);
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
     public static void MenuPetugas(List<Petugas> listpetugas){
        //ClearScreen();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu Kelola Petugas");
        System.out.println("1. Tambah Petugas");
        System.out.println("2. Cari Petugas");
        System.out.println("3. Hapus Petugas");
        System.out.println("4. Lihat petugas");
        System.out.println("5. Kembali");
        System.out.print("Pilihan : ");
        int pilih = scanner.nextInt();
        int id;
        Petugas x;
        switch (pilih) {
            case 1 :
                    int jumlah = listpetugas.size();
                    System.out.println("Nama : "); String nama = scanner.next();
                    System.out.println("Alamat : ");  String alamat = scanner.next();
                    System.out.println("Jenis Kelamin : "); String jk = scanner.next();
                    jumlah++;
                    AddPetugas(nama,alamat,jk,jumlah,listpetugas);
                    System.out.println("Petugas berhasi ditambahkan ! ");
                    MenuPetugas(listpetugas);
                    break;
            case 2 : 
                    System.out.println("Masukkan id petugas yang akan dicari : "); id = scanner.nextInt();
                    x = Search(listpetugas,id);
                    if(x == null){
                        System.out.println("Petugas tersebut tidak ada");
                    } else {
                        System.out.println("Data Petugas");
                        System.out.println("ID : " + x.getId());
                        System.out.println("Nama : " + x.getNama());
                        System.out.println("Alamat : " + x.getAlamat());
                        System.out.println("Jenis Kelamin : " + x.getJenisKelamin());
                    }
                    MenuPetugas(listpetugas);
                    break;
            case 3 :
                    System.out.println("Masukkan id petugas yang akan dihapus : "); id = scanner.nextInt();
                    MenuPetugas(listpetugas);
                    break;
            case 4 :
                    for(Petugas petugas: listpetugas) {
                        System.out.println(petugas); 
                    }
                    System.out.println("asasas1");
                    MenuPetugas(listpetugas);
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
     public static Petugas Search(List<Petugas> list, int id) {
        Petugas x = null;
        for(int i=0;i<list.size();i++){
            if (list.get(i).getId() == id) {
                x = list.get(i);
                break;
            }
        }
        return x;
     }


     public static void MenuPelanggan(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu Kelola Pelanggan");
        System.out.println("1. Tambah Pelanggan");
        System.out.println("2. Cari Pelanggan");
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
            case 1 : //MenuPetugas(listpetugas);
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
            case 1 : //MenuPetugas();
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
            case 1 : //MenuPetugas(listpetugas);
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
            case 1 : //MenuPetugas(listpetugas);
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

