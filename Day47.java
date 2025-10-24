package Day47;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Masukkan angka 1-7: ");
        int hari = s.nextInt();
        switch (hari) {
            case 1:
                System.out.println("Hari ini adalah Senin");
                break;
            case 2:
                System.out.println("Hari ini adalah Selasa");
                break;
            case 3:
                System.out.println("Hari ini adalah Rabu");
                break;
            case 4:
                System.out.println("Hari ini adalah Kamis");
                break;
            case 5:
                System.out.println("Hari ini adalah Jumat");
                break;
            case 6:
                System.out.println("Hari ini adalah Sabtu");
                break;
            case 7:
                System.out.println("Hari ini adalah Minggu");
                break;
            default:
                System.out.println("Angka yang dimasukkan tidak valid");
        }}}
