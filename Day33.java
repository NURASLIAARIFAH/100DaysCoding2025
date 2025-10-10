package Day33;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Nilai PAI: ");
        int pai = s.nextInt();
        System.out.print("Nilai PKN: ");
        int pkn  = s.nextInt();
        
        System.out.println("Apakah nilai pai lebih tinggi dari nilai pkn? " + !(pai > pkn)); 
    }
    }
