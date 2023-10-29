/*
Nama : Evan Eka Laksana
 * Kelas : PBO1
 * NIM : 222050008
 * Deskripsi Program : Program ini berisi program untuk menampilkan Perhitungan Lingkaran
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihan22;
import java.util.Scanner;

public class Latihan22 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta user untuk memasukkan diameter lingkaran
        System.out.println("------Perhitungan Lingkaran-----");
        System.out.println("Masukkan nilai diameter lingkaran : ");
        double diameter = scanner.nextDouble();

        // Validasi input user
        if (diameter <= 0) {
            System.out.println("Nilai Diameter Tidak Sesuai");
            System.exit(1);
        }

        // Menghitung jari-jari lingkaran
        double jariJari = diameter / 2;

        // Menghitung luas lingkaran
        double luasLingkaran = Math.PI * jariJari * jariJari;

        // Menghitung keliling lingkaran
        double kelilingLingkaran = 2 * Math.PI * jariJari;

        // Menampilkan hasil perhitungan
        System.out.println("======Hasil Perhitungan Lingkaran=====");
        System.out.println("Jari-jari Lingkaran = " + jariJari + " cm");
        System.out.println("Luas Lingkaran = " + luasLingkaran + " cm\u00b2");
        System.out.println("Keliling Lingkaran = " + kelilingLingkaran + " cm");
    }
    
}
