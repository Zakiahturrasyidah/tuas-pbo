/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas250325;

/**
 *
 * @author buyal
 */
public class tabungan {
    private int saldo;
    
    public tabungan(int saldo){
        this.saldo = saldo;
    }
    
    public int getSaldo() {
        return saldo;
    }
    
    public void simpanUang(int jumlah){
        saldo += jumlah;
    }
    
    public boolean ambilUang(int jumlah){
        if (jumlah <= saldo){
        saldo-= jumlah;
        return true;
        }
        return false;
    }
    
    public boolean transfer(tabungan t, int jumlah){
        if (ambilUang(jumlah)) {
        t.simpanUang(jumlah);
        return true;
        }
        return false;
    }
    
    @Override
    public String toString() {
        return "Saldo: " + saldo;
    }
    
}
