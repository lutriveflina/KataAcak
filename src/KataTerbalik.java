package com.ol.binus;

import java.util.Scanner;

public class KataTerbalik {

    private static boolean pembalikKata(String str){
        String reverse = "";

        // Loop dari karakter kata terakhir  yang pertama
        for (int i = str.length() - 1; i >= 0; i--)
            reverse = String.format("%s%s", reverse, str.charAt(i));

        // return str
        return str.equals(reverse);

    }
    public static void main(String[] args){
//        menggunakan Do - While
//        proses pengecekan dilakukan pada akhir perulangan
//        setelah statement – statement dijalankan.
//        selama kondisi memenuhi (bernilai true)
        do {
            Scanner s = new Scanner (System.in); //Deklarasi scanner
            try {
                System.out.print("Masukkan kalimat : "); // input kalimat oleh user
                if (pembalikKata(s.nextLine())) {
                    System.out.print("COOL"); // print result
                } else System.out.print("BAD"); // print result

                // menampilkan pertanyaan ingin input kalimat lagi?
                System.out.println("\nApakah kamu ingin memasukkan kalimat lain? [Y/N] ");
                String jawab = s.next();

                //cek apakah user menjawab iya lalu break;
                if (!jawab.equalsIgnoreCase("Y")){
                    break;
                }
                System.out.println();

            }catch (Exception e){
                System.out.println("Terjadi kesalahan saat memasukkan kalimat, silahkan coba lagi");
                break;
            }

        }while (true);
    }

}
