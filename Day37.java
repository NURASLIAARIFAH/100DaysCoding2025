package day37;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Angka:");
        int angka = s.nextInt();
        if(angka % 2 == 0){
            System.out.println("Genap:");
        }else{
            System.out.println("Ganjil:");
        }
        }
