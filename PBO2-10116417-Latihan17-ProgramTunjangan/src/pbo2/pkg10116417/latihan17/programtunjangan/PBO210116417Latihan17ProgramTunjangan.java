/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10116417.latihan17.programtunjangan;
import java.util.Scanner;

/**
 *
 * @author Akmal
 *  NAMA        : GILANG PANJI WANENG PATI
 *  KELAS       : PBO2
 *  NIM         : 10116417
 *  DESKRIPSI   : BERISI TENTANG PROGRAM MENGHITUNG TUNJUNGAN KARYAWAN
 */
public class PBO210116417Latihan17ProgramTunjangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double gajiPokok;
        double tunjangan;
        double totalAkhir;
        String status = null ;

        Scanner scanner = new Scanner(System.in);
        System.out.println("=========Program Tunjangan=========");
        System.out.print("Berapa Gaji Pokok anda perbulan? Rp. ");
        gajiPokok = scanner.nextDouble();
        System.out.print("Status anda (Menikah/Belum)? ");
        status = scanner.next();

        if ("Menikah".equals(status)) {
            tunjangan = gajiPokok * 0.35;
        } else {
            tunjangan = 0;
        }

        totalAkhir = tunjangan + gajiPokok;

        System.out.println("========Hasil Perhitungan Gaji Anda=========");
        System.out.println("Gaji Pokok\t\t : Rp. " + gajiPokok);
        System.out.println("Tunjangan\t\t : Rp. " + tunjangan);
        System.out.println("Total Gaji\t\t : Rp. " + totalAkhir);
        System.out.println("(Developed by : Gilang Panji Waneng Pati)");
    }
    
}
