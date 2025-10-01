package Day24;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Masukkan jari-jari lingkaran : ");
        double r = s.nextDouble();
        double luas = Math.PI * r * r;
        System.out.println("Luas lingkaran = " + luas);
        
    }
    
}
