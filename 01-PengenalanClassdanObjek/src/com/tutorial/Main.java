package com.tutorial;

class mahasiswa {
  String nama;
  String NIM;
  String prodi;
}


public class Main {
  public static void main(String[] args) {
    // instansiansi pembuatan objek
    mahasiswa mhs1 = new mahasiswa();

    // objek mhs1 diberi atribut
    mhs1.nama = "uciha bayu";
    mhs1.NIM = "22241999";
    mhs1.prodi = "komputasi";
    
    System.out.println("nama mahasisa : " + mhs1.nama);
    System.out.println("NIM : " + mhs1.NIM);
    System.out.println("program studi : " + mhs1.prodi);

    mahasiswa mhs2 = new mahasiswa();
    mhs2.nama = "uciha eri";
    mhs2.NIM = "22241998";
    mhs2.prodi = "pertanian"; 
    
    System.out.println("nama mahasisa : " + mhs2.nama);
    System.out.println("NIM : " + mhs2.NIM);
    System.out.println("program studi : " + mhs2.prodi);
    
  }  
}
