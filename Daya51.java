package Day51;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("=====MENU MINUMAN=====");
        for(int i = 1; i <= 3; i++){
            switch(i){
                case 1:
                System.out.println(i + ".Kopi Hitam");
                break;
                case 2:
                System.out.println(i + ".Kopi Latte");
                break;
                case 3:
                System.out.println(i + ".Kopi Cappucino");
                break;
            }}
               System.out.println("-------------------");
               System.out.print("Masukkan angka 1-3: ");
               int pilih = s.nextInt();
               switch(pilih){
                   case 1:
                   System.out.println("Kamu memilih Kopi Hitam");
                   break;
                   case 2:
                   System.out.println("Kamu memilih Kopi Latte");
                   break;
                   case 3:
                   System.out.println("Kamu memilih Kopi Cappucino");
                   break;
                   default:
                   System.out.println("Pilihan tidak ada");
               }}}
