package Day28;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
         // Operator Perbandingan == dan !=
        System.out.print("Angka1: ");
        int Angka1 = s.nextInt();
        System.out.print("Angka2: ");
        int Angka2 = s.nextInt();
        System.out.println(Angka1 == Angka2);
        System.out.println(Angka1 != Angka2);
    }
    
}
