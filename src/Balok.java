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

public class Balok implements MenghitungRuang{
    double hitungLuasPermukaan,hitungVolume;

    public Balok(double panjang,double lebar,double tinggi,double hitungLuas,double hitungKeliling){
        this.hitungVolume = panjang*lebar*tinggi;
        this.hitungLuasPermukaan = (2*panjang*lebar)+(2*lebar*tinggi*1.0)+(2*tinggi*panjang*1.0);
    }

    @Override 
    public double hitungVolume(){
        System.out.println("VOLUME = " + hitungVolume);
        return hitungVolume; 
    }

    @Override 
    public double hitungLuasPermukaan(){
        System.out.println("LUAS PERMUKAAN = " + hitungLuasPermukaan);
        return hitungLuasPermukaan;
    }  

}
