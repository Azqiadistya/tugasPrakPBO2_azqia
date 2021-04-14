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

public class Kerucut implements MenghitungRuang {
    double hitungLuasPermukaan,hitungVolume;

    public Kerucut(double Jarijari, double tinggiKerucut, double hitungLuas, double hitungKeliling){
        this.hitungLuasPermukaan = (3.14*Jarijari*Jarijari)+(3.14*Jarijari*hitungKeliling);
        this.hitungVolume = (1.0/3)*hitungLuas*tinggiKerucut; 
        
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
