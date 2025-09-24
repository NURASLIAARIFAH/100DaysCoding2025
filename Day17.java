package Day17;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Operator Aritmatika Modulus/Sisa bagi (%)
        System.out.println("Masukkan nilai a : ");
        int nilaiA = input.nextInt();
        System.out.println("Masukkan nilai b : ");
        int nilaiB = input.nextInt();
        // Modulus/Sisa bagi
        int hasilModulus = nilaiA%nilaiB;
        System.out.println("hasil Modulus : " + hasilModulus);
        
    }
    
}
