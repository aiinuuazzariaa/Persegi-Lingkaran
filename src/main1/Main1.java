/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main1;
import java.util.Scanner;
/**
 *
 * @author MOKLET-2
 */
        // Class : Main1
        public class Main1 {

    /**
     * @param args the command line arguments
     */
        // Method Void
        public static void main(String[] args) {
        // Identitas 
        Scanner io = new Scanner(System.in);
        
        System.out.println("Nama : ");
        String nama = io.nextLine();
        System.out.println("Kelas : ");
        String kelas = io.nextLine();
        System.out.println("No. Absen : ");
        int absen = io.nextInt();
        System.out.println("Pilihan Perhitungan : ");
        System.out.println("1. Luas Lingkaran");
        System.out.println("2. Luas Persegi");
        System.out.println("Masukkan Pilihan Perhitungan Anda : ");
        int pilihan = io.nextInt();
        System.out.println(" ");
        
        switch (pilihan) {
            case 1 :
                System.out.println("Luas Lingkaran");
                Lingkaran hai = new Lingkaran();
                hai.hitunglingkaran();
                break;
            
            case 2 :
                System.out.println("Luas Persegi");
                Persegi hy = new Persegi();
                hy.hitungpersegi();
                break;
                
        }
        
        
    }
    
}
