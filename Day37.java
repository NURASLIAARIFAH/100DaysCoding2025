package day37;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("angka:");
        int angka = s.nextInt();
        if(angka <= 9){
        System.out.println("satuan");
        if(angka % 2 == 0){
        System.out.println("genap");
      }else{
        System.out.println("ganjil");
     }
     }else if(angka <= 99){
        System.out.println("puluhan");
        if(angka % 2 == 0){
        System.out.println("genap");
      }else{
        System.out.println("ganjil");
     }
    }else if(angka <= 999){
        System.out.println("ratusan");
        if(angka % 2 == 0){
        System.out.println("genap");
      }else{
        System.out.println("ganjil");
     }                                   
    }else if(angka <= 9999){
        System.out.println("ribuan");
        if(angka % 2 == 0){
        System.out.println("genap");
      }else{
        System.out.println("ganjil");
        }}}}
