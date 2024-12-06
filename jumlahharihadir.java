package vscode;

import java.util.Scanner;

public class jumlahharihadir {
    private static Scanner s;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah siswa: ");
        int jumlahSiswa = scanner.nextInt();

        int[] hariHadir = new int[jumlahSiswa];

        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.print("Masukkan jumlah hari hadir siswa ke-" + (i + 1) + ": ");
            hariHadir[i] = scanner.nextInt();
        }

        // Menghitung kehadiran dan rata-rata
        int totalHadir = 0;
        for (int i = 0; i < jumlahSiswa; i++) {
            totalHadir += hariHadir[i];
        }
        double rataRataHadir = (double) totalHadir / jumlahSiswa;

        // Mencetak hasil
        System.out.println("Laporan Kehadiran Siswa Selama Sebulan:");
        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.println("Siswa ke-" + (i + 1) + ": " + hariHadir[i] + " hari hadir");
        }
        System.out.println("Total hari hadir: " + totalHadir);
        System.out.println("Rata-rata kehadiran: " + rataRataHadir);

    }
}