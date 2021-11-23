/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentalconsole;

/**
 *
 * @author Acer
 */
public class Platinum extends Gold{
    int biaya = 45000;
    int diskon = 97/100;
    int pulsa;
    
    protected void hitungBiaya(int lamaSewa){
        int harga = biaya * lamaSewa * diskon;
        System.out.println("Total Sewa : Rp. "+ harga);
    }
    
    protected void hitungPoin(int lamaSewa){
        poin = 10 * lamaSewa;
        System.out.println("Jumlah Poin : "+ poin);
    }    
    
    protected void cashback(){
        cashback = 10000;
        System.out.println("Jumlah Cashback : Rp. " + cashback);
    }
    
    protected void bonusPulsa(int lamaSewa){
        pulsa = 5000 * lamaSewa;
        System.out.println("Bonus Pulsa : Rp. "+ pulsa);
    }
}
