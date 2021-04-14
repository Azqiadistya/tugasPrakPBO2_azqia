/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
import java.util.Scanner; 
/**
 *
 * @author USER
 */

public class PersegiPanjang implements MenghitungBidang{
    double panjang,lebar,hitungLs,hitungKl;
    public PersegiPanjang(int panjang, int lebar){
        this.panjang = 1.0*panjang;
        this.lebar = 1.0*lebar;
    }
    
    @Override 
    public double hitungLuas(){
        hitungLs = panjang*lebar ;
        System.out.println("LUAS ALAS = " + hitungLs);
        return hitungLs; 
    }

    @Override 
    public double hitungKeliling(){
        hitungKl = 2*(panjang+lebar);
        System.out.println("KELILING = " + hitungKl);
        return hitungKl; 
    } 
}
