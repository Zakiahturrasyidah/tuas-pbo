/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tugas2Pratikum110325;

/**
 *
 * @author USER
 */
public class KendaraanMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                Scanner in = new Scanner(System.in);
        String jenis;
        String merk;
        String warna;
        int tahun;
        int harga;
        int kec;
        
        System.out.print("masukkan jenis kendaraan = ");
        jenis=in.nextLine();
        System.out.print("masukkan merk kendaraan = ");
        merk=in.nextLine();
        System.out.print("tahun keluaran = ");
        tahun=in.nextInt();
        System.out.print("warna kendaraan = ");
        warna=in.nextLine();
        System.out.print("harga sewa kendaraan = ");
        harga=in.nextInt();
        System.out.print("kecepatan kendaraan / jam = ");
        kec=in.nextInt();
        
        Kendaraan kend = new Kendaraan(jenis, merk, tahun, warna);
        kend.InfoKendaraan();
        kend.CekHarga(harga);
        kend.Kecepatan(kec);
        
        in.close();
        
    }
}
