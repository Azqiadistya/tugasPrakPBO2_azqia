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

public class Lingkaran implements MenghitungBidang {
    double tinggiKerucut, Jarijari,hitungLs, hitungKl;
    public Lingkaran(int Jarijari,int tinggiKerucut){
        this.Jarijari = 1.0*Jarijari;
        this.tinggiKerucut = 1.0*tinggiKerucut;
    }
    
    @Override 
    public double hitungLuas(){
        hitungLs = 3.14*Jarijari*Jarijari ;
        System.out.println("LUAS ALAS = " + hitungLs);
        return hitungLs; 
    }

    @Override 
    public double hitungKeliling(){
        hitungKl = 2*3.14*Jarijari;
        System.out.println("KELILING = " + hitungKl);
        return hitungKl; 
    }  

}
