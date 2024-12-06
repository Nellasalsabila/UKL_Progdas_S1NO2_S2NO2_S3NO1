package vscode;

import java.util.Scanner;

public class permukaanbola {
    // Fungsi untuk menghitung luas permukaan bola
    public static double hitungLuasPermukaanBola(double radius) {
        final double PI = Math.PI;
        return 4 * PI * radius * radius;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan luas permukaan bola (L): ");
        double L = scanner.nextDouble();

        System.out.print("Masukkan PI : ");
        double PI = scanner.nextDouble();

        System.out.print("Masukkan jari-jari bola (r): ");
        double radius = scanner.nextDouble();

        double luasPermukaan = hitungLuasPermukaanBola(radius);{
        }
        System.out.printf("Luas permukaan bola + jari-jari %.2f adalah %.2f%n", radius, luasPermukaan);
    }
}