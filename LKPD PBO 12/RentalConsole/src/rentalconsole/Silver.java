/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentalconsole;
import java.time.*;
import java.util.ArrayList;
import rentalconsole.Member;
/**
 *
 * @author Acer
 */
public class Silver {
    int biaya = 25000;
    int diskon = 99/100;
    int poin;
    
    protected void hitungBiaya(int lamaSewa){
        int harga = biaya * lamaSewa * diskon;
        System.out.println("Total Sewa : Rp. "+ harga);
    }
    
    protected void hitungPoin(int lamaSewa){
        poin = 1 * lamaSewa;
        System.out.println("Jumlah Poin : "+ poin);
    }
    
    
}
