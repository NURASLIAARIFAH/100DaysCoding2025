package Day45;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Masukkan angka 1-200: ");
        int temp = s.nextInt();
        byte angka = (byte) temp;
        switch(angka){
            case 1:
            System.out.println("ini adalah angka satu");
            break;
            case 2:
            System.out.println("ini adalah angka dua");
            break;
            case 3:
            System.out.println("ini adalah angka tig");
            break;
            case 4:
            System.out.println("ini adalah angka empat");
            break;
            case -50:
            System.out.println("kamu mengetik 200 (tapi dalam byte jadi -50)");
            break;
            default:
            System.out.println("angka tidak dikenal");
        }}}
