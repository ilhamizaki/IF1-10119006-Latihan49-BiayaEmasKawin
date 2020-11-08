/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ilham;

/**
 *
 * @author
 * NAMA     : Ilham zaki
 * Kelas    : IF 1
 * NIM      : 10119006
 * Deskripsi Program : program untuk menghitung biaya emas kawin
 */
public class BiayaEmas {
    private int emas;
    private double berat;

    public int getEmas() {
        return emas;
    }

    public void setEmas(int emas) {
        this.emas = emas;
    }

    public double getBerat() {
        return berat;
    }

    public void setBerat(double berat) {
        this.berat = berat;
    }
    
    public double bayar(double emas, double berat) {
        return emas * berat;
    }
}
