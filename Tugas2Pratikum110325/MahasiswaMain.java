/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tugas2Pratikum110325;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class MahasiswaMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);

        int uts, uas, tugas, quiz;
        String nama;
        long nim;

        System.out.print("MASUKKAN NIM ANDA : ");
        nim = in.nextLong();
        in.nextLine();

        System.out.print("MASUKKAN NAMA ANDA : ");
        nama = in.nextLine();

        System.out.print("NILAI UTS : ");
        uts = in.nextInt();

        System.out.print("NILAI UAS : ");
        uas = in.nextInt();

        System.out.print("NILAI TUGAS : ");
        tugas = in.nextInt();

        System.out.print("NILAI QUIZ : ");
        quiz = in.nextInt();  
        
        Mahasiswa mah = new Mahasiswa(nim, nama, uts, uas, tugas, quiz);
        mah.tampildata();
        mah.konversi();

        in.close();
    }
}
