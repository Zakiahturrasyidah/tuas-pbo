/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas250325;

/**
 *
 * @author zakiah
 */
public class PersegiPanjangTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          System.out.println("Jumlah objek saat ini: "+PersegiPanjangEnkapsulasi.getJumlahObjek());
        
        // Membuat objek pertama dengan konstruktor default
        PersegiPanjangEnkapsulasi pp1 = new PersegiPanjangEnkapsulasi();
        // Menetapkan nilai panjang dan lebar
        pp1.setPanjang(19);
        pp1.setLebar(8);
        
        // Menampilkan informasi objek pertama
        System.out.println("Objek : "+PersegiPanjangEnkapsulasi.getJumlahObjek());
        System.out.println("Panjang: " + pp1.getPanjang());
        System.out.println("Lebar: " + pp1.getLebar());
        System.out.println("Luas: " + pp1.getLuas());
        System.out.println("Keliling: " + pp1.getKeliling());
        System.out.println("Jumlah objek yang telah dibuat: " + PersegiPanjangEnkapsulasi.getJumlahObjek());
        System.out.println();
        
        // Membuat objek kedua dengan konstruktor berparameter
        PersegiPanjangEnkapsulasi pp2 = new PersegiPanjangEnkapsulasi(8, 5);
        
        // Menampilkan informasi objek kedua
        System.out.println("Objek : "+PersegiPanjangEnkapsulasi.getJumlahObjek());
        System.out.println("Panjang: " + pp2.getPanjang());
        System.out.println("Lebar: " + pp2.getLebar());
        System.out.println("Luas: " + pp2.getLuas());
        System.out.println("Keliling: " + pp2.getKeliling());
        System.out.println("Jumlah objek yang telah dibuat: " + PersegiPanjangEnkapsulasi.getJumlahObjek());
        System.out.println();
    }
    
    
}
