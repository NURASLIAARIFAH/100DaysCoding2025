package Day36;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("====== List Barang ======");
        System.out.println("1. Buku");
        System.out.println("2. Pulpen");
        System.out.print("Masukkan pilihan: ");
        int barang = s.nextInt();
        // (pilih barang)
        if (barang == 1) { // Buku
            System.out.println("\n1. Buku Tulis SIDU");
            System.out.println("2. Buku Catatan lia");
            System.out.print("Masukkan pilihan: ");
            int buku = s.nextInt();
            //(pilih jenis buku)
            if (buku == 1) {
                System.out.println("\n==== Spesifikasi ====");
                System.out.println("Nama Barang: Buku Tulis SIDU");
                System.out.println("Jumlah Halaman: 58 lembar");
                System.out.println("Ukuran: A5");
            } else if (buku == 2) {
                System.out.println("\n==== Spesifikasi ====");
                System.out.println("Nama Barang: Buku Catatan lia");
                System.out.println("Jumlah Halaman: 100 lembar");
                System.out.println("Ukuran: B5");
            } else {
                System.out.println("Pilihan buku tidak valid.");
            }
        } else if (barang == 2) { // Pulpen
            System.out.println("\n1. Pulpen Pilot");
            System.out.println("2. Pulpen Standard AE7");
            System.out.print("Masukkan pilihan: ");
            int pulpen = s.nextInt();
       // (pilih jenis pulpen)
            if (pulpen == 1) {
                System.out.println("\n==== Spesifikasi ====");
                System.out.println("Nama Barang: Pulpen Pilot");
                System.out.println("Warna Tinta: Biru");
                System.out.println("Tipe: Gel Ink Pen 0.5mm");
            } else if (pulpen == 2) {
                System.out.println("\n==== Spesifikasi ====");
                System.out.println("Nama Barang: Pulpen Standard AE7");
                System.out.println("Warna Tinta: Hitam");
                System.out.println("Tipe: Ballpoint 0.7mm");
            } else {
                System.out.println("Pilihan pulpen tidak valid.");
            }
        } else {
            System.out.println("Pilihan barang tidak valid.");
        }
        }
    }
