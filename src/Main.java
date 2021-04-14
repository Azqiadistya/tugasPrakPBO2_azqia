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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        System.out.println("INPUT");
        System.out.println("1. BALOK");
        System.out.println("2. KERUCUT");
        System.out.println("3. EXIT");
        System.out.println("PILIH = ");
        int pilih = input.nextInt();
        
        switch(pilih){
            case 1 :
                    Scanner inputBalok = new Scanner(System.in);
                    System.out.println("PANJANG = ");
                    int panjang = inputBalok.nextInt();
                    System.out.println("LEBAR = ");
                    int lebar = inputBalok.nextInt();
                    System.out.println("TINGGI = ");
                    int tinggi = inputBalok.nextInt();

                    PersegiPanjang PersegiPanjang = new PersegiPanjang(panjang,lebar);
                    PersegiPanjang.hitungLuas();
                    PersegiPanjang.hitungKeliling();
                    Balok Balok = new Balok(PersegiPanjang.panjang,PersegiPanjang.lebar,tinggi,PersegiPanjang.hitungLs,PersegiPanjang.hitungKl);
                    Balok.hitungVolume();
                    Balok.hitungLuasPermukaan();
                    break;
            case 2 : 
                    Scanner inputKerucut = new Scanner(System.in);
                    System.out.println("JARI JARI = ");
                    int Jarijari = inputKerucut.nextInt();
                    System.out.println("TINGGI = ");
                    int tinggiKerucut = inputKerucut.nextInt();

                    Lingkaran Lingkaran = new Lingkaran(Jarijari,tinggiKerucut);
                    Lingkaran.hitungLuas();
                    Lingkaran.hitungKeliling();
                    Kerucut Kerucut = new Kerucut(Lingkaran.Jarijari,Lingkaran.tinggiKerucut,Lingkaran.hitungLs,Lingkaran.hitungKl);
                    Kerucut.hitungVolume();
                    Kerucut.hitungLuasPermukaan();
                    break;
            case 3 :System.exit(0);
        }
    }

}
