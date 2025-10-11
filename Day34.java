package Day34;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("nilai a = ");
        int a = s.nextInt();
        System.out.print("nilai b = ");
        int b  = s.nextInt();
        System.out.print("nilai c = ");
        int c  = s.nextInt();
        //Update nilai a
        a = a + (b*c);
        boolean hasil = ((a % 2 == 0)&&(a/b>c))||((a-b)<=10);
        System.out.println("Nilai akhir = " + a);
        System.out.println("Hasil logika = " + hasil);
    }
    }
