package day37;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Angka:");
        int angka = s.nextInt();
        int hasil = angka% 2;
        String kondisi = hasil == 0? "Genap" : "Ganjil";
        System.out.println(kondisi);
        }
        }
