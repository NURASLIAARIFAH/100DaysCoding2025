package Day46;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("======== MENU MINUMAN KOPI ========");
        System.out.println("\n1.Kopi Hitam Rp 10.000\n2.Kopi Latte Rp 12.000\n3.Kopi Cappucino Rp 15.000");
        System.out.print("Pilih jenis kopi(1-3):");
        int pilihan = s.nextInt();
        String kopi = "";
        int harga = 0;
        switch(pilihan){
            case 1:
            kopi = "Kopi Hitam";
            harga = 10000;
            break;
            case 2:
            kopi = "Kopi Latte";
            harga = 12000;
            break;
            case 3:
            kopi = "Kopi Cappucino";
            harga = 15000;
            break;
            default:
            kopi = "pilihan tidak ada";
        }
        System.out.println("------------------------------------");
        System.out.println("Kopi yang anda pilih: " + kopi);
        }}
