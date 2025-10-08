package Day31;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Nilai Teori: ");
        int teori = s.nextInt();
        System.out.print("Nilai Praktik: ");
        int praktik = s.nextInt();
 
        boolean lulus = (teori >= 85) && (praktik >= 70);
        System.out.println("Apakah anda lulus? " + lulus); 
    }
}
