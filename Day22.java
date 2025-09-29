package Day22;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
        System.out.print("Masukkan panjang sisi persegi : ");
        float sisi = s.nextFloat();
        float luas = sisi * sisi;
        System.out.println("Luas persegi : " + luas);
       
    } 
    
}
