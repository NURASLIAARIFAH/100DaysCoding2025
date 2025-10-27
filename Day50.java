package Day50;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // Membuat program genap ganjil menggunakan ternary 
           System.out.print("Masukkan angka: ");
           int angka = s.nextInt();
           int hasil = angka % 2 ;
           String kondisi = hasil == 0? "Genap":"Ganjil";
        System.out.println(kondisi);
    }}
