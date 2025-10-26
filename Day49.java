package Day49;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // Operator Ternary
        System.out.print("Masukkan nilai: ");
        int nilai = s.nextInt();
        int kkm = 75;
        String hasil = nilai >= kkm? "Tuntas":"Tidak Tuntas";
        System.out.println("Lia dinyatakan " + hasil);
    }}
