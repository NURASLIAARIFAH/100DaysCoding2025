package Day23;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      Scanner s = new Scanner (System.in);
        System.out.println("panjang : ");
        float panjang = s.nextFloat();
        System.out.print("lebar : ");
        float lebar = s.nextFloat();
        float luas = panjang * lebar;
        System.out.println("Luas persegi panjang : " + luas);
        
    }
    
}
