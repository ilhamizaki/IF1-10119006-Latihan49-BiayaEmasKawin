/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ilham;

import java.util.Scanner;

/**
 *
 * @author
 * NAMA     : Ilham zaki
 * Kelas    : IF 1
 * NIM      : 10119006
 * Deskripsi Program : class main biaya emas
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BiayaEmas biayaEmas = new BiayaEmas();

        System.out.println("======Biaya Emas Kawin======");
        biayaEmas.setEmas(570000);
        System.out.println("Harga emas per bulan oktober : " + biayaEmas.getEmas());
         
        System.out.print("Berat emas / gram : ");
        double berat = scanner.nextDouble();
        biayaEmas.setBerat(berat);
        
        System.out.println("\nTotal bayar : Rp." + (int) biayaEmas.bayar(biayaEmas.getEmas(), biayaEmas.getBerat()));
    }
    
}
