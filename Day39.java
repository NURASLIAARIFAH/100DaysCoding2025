package Day39;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String menu = null;
        int pilihan,harga=0,porsi;
        System.out.println("----Menu Makanan----");
        System.out.println("1.Nasi Uduk\n2.Nasi Kuning\n3.Nasi Goreng");
        System.out.println("Piihan \t: ");
        pilihan= s.nextInt(); 
        if(pilihan == 1){
            menu = "Nasi Uduk";
            harga = 10000;
        }else if(pilihan == 2){
            menu = "Nasi Kuning";
            harga = 12000;
    }else if(pilihan == 3){
            menu = "Nasi Goreng";
            harga = 15000;
    }
        if(menu == null){
            System.out.println("Pilihan Salah");
        }else{
            System.out.print("Jumlah porsi \t: ");
            porsi = s.nextInt();
            harga = harga * porsi;
            System.out.println("====================");
            System.out.println("Menu Dipesan");
            System.out.println(menu);
            System.out.println(menu+" - Rp."+harga+"/porsi");
            harga = harga * porsi;
            System.out.println("Total Bayar \t: Rp. " + harga);
        }
    }
    }
