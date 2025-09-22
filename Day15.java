package Day15;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Operator aritmatika penjumlahan (+) dan pengurangan (-)
        System.out.println("Masukkan nilai a : ");
        int nilaiA = input.nextInt();
        System.out.println("Masukkan nilai b : ");
        int nilaiB = input.nextInt();
        //Penjumlahan
        int hasilPenjumlahan = nilaiA+nilaiB;
        //Pengurangan
        int hasilPengurangan = nilaiA-nilaiB;
        System.out.println("hasil penjumlahan : " + hasilPenjumlahan);
        System.out.println("hasil pengurangan : " + hasilPengurangan);
        
        
    }
    
}
