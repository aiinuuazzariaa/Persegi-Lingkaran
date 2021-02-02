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
    // Class : Lingkaran
    public class Lingkaran {
    // Mendeklarasikan Atribut
    double phi = 3.14;
    double r;
    
    // Method Hitung Luas Lingkaran (Method Void)
    void hitunglingkaran() {
    Scanner io = new Scanner(System.in);
    System.out.println("Masukkan nilai r (jari-jari) : ");
    double r = io.nextInt();
    double hasil = phi * r * r;
    System.out.println("Luas Perseginya adalah : "+hasil);
    }
}
