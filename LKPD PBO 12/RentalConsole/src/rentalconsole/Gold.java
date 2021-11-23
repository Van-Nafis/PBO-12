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
public class Gold extends Silver{
    int biaya = 30000;
    int diskon = 98/100;
    int cashback;
    
    protected void hitungBiaya(int lamaSewa){
        int harga = biaya * lamaSewa * diskon;
        System.out.println("Total Sewa : Rp. "+ harga);
    }
    
    protected void hitungPoin(int lamaSewa){
        poin = 5 * lamaSewa;
        System.out.println("Jumlah Poin : "+ poin);
    }    
    
    protected void cashback(){
        cashback = 5000;
        System.out.println("Jumlah Cashback : Rp. " + cashback);
    }
}
