package Day43;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
    System.out.print("Masukkan Angka: ");
        int angka = s.nextInt();
        String Angka = "";
        String ganjilGenap = "";
        String bisaDibagi = "";
        
        if(Math.abs(angka) <= 9){
            Angka = "satuan";
        }else if(Math.abs(angka) <= 99){
            Angka = "puluhan";
    }else if(Math.abs(angka) <= 999){
        Angka = "ratusan";
    }else{
        bisaDibagi = "angka yang tidak habis dibagi";
    }
        if(angka % 2 == 0){
            ganjilGenap = "genap";
        }else{
            ganjilGenap = "ganjil";
        }
        if(angka % 3 == 0 && angka % 5 == 0){
            bisaDibagi = "yang bisa dibagi 3 dan 5";
        }else if(angka % 3 == 0){
            bisaDibagi = "yang bisa dibagi 3";
    }else if(angka % 5 == 0){
        bisaDibagi = "yang bisa dibagi 5";
    }
        System.out.println(angka + " adalah angka " + Angka + " " + ganjilGenap + " " + bisaDibagi);
}}
