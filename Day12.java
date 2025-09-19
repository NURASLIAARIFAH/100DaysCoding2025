package Day12;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        // Biodata saya
        String nama;
        System.out.print("nama:") ;
        nama = input.nextLine();
        System.out.println(nama); // yang akan mencetak di output
        String nim;
        System.out.print("nim:");
        nim = input.nextLine();
        System.out.println(nim);
        String alamat;
        System.out.print("alamat:");
        alamat = input.nextLine();
        System.out.println(alamat);
        int umur;
        System.out.print("umur:");
        umur = input.nextInt();
        System.out.println(umur);
        char kelas;
        System.out.print("kelas:");
        kelas = input.next().charAt(0);
        System.out.println(kelas);
        Float berat;
        System.out.print("berat:");
        berat = input.nextFloat();
        System.out.println(berat);
        Double tinggi;
        System.out.print("tinggi:");
        tinggi = input.nextDouble();
        System.out.println(tinggi);
        /*jadi commit hari ini yaitu membuat biodata dengan menggunakan tipe data
            string,int,char,float,double*/
        
    }
    
}
