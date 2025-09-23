package Day16;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Operator aritmatika perkalian (*) dan pembagian (/)
        System.out.println("Masukkan nilai a : ");
        int nilaiA = input.nextInt();
        System.out.println("Masukkan nilai b : ");
        int nilaiB = input.nextInt();
        //Perkalian
        int hasilPerkalian = nilaiA*nilaiB;
        //Pembagian
        int hasilPembagian = nilaiA/nilaiB;
        System.out.println("hasil perkalian : " + hasilPerkalian);
        System.out.println("hasil pembagian : " + hasilPembagian);
        
        
    }
    
}
