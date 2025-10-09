package Day32;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Nilai Inggris: ");
        int inggris = s.nextInt();
        System.out.print("Nilai Bindo: ");
        int bindo  = s.nextInt();
 
        boolean lulus = (inggris >= 70) || (bindo >= 85);
        System.out.println("Apakah adik saya akan mendapatkan nilai yang tinggi dari kedua matkul tersebut? " + lulus); 
    }
    }
