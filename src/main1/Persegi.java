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
    // Class : Persegi
    public class Persegi {
    // Mendefinisikan Atribut
    double s;
    
    // Method Hitung Luas Persegi(Method Void)
    void hitungpersegi() {
    Scanner yo = new Scanner (System.in);
    System.out.println("Masukkan nilai s (sisi persegi) : ");
    double s = yo.nextInt();
    double total = s * s;
    System.out.println("Luas Perseginya adalah : "+total);
    }


}
