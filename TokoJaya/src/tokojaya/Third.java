/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TokoJaya;

/**
 *
 * @author ZOELF
 */
public class Third extends JayaBaru
{
    private int jumlahbarang;
    public Third(int harga,int diskon, int total,int jumlahbarang){
        super(harga,diskon,total);
        this.jumlahbarang = jumlahbarang;
    }
    public void info(){
        System.out.println("JumlahBarang yang di beli = " + this.jumlahbarang);
        super.info();
    }
    
}
