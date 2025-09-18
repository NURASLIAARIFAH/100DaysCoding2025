package Day11;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String nama;
        int umur;
        Long saudara;
        byte bestie;
        short no_sepatu;
        float tinggi;
        double bb;
        char gender;
        Boolean sehat;
        System.out.print("nama : ");
        nama = input.nextLine();
        System.out.println(nama);
        
        System.out.print("umur : ");
        umur = input.nextInt();
        System.out.println(umur);
        
        System.out.print("saudara : ");
        saudara = input.nextLong();
        System.out.println(saudara);
        
        System.out.print("bestie : ");
        bestie = input.nextByte();
        System.out.println(bestie);
        
        System.out.print("no_sepatu : ");
        no_sepatu = input.nextShort();
        System.out.println(no_sepatu);
        
        System.out.print("tinggi : ");
        tinggi = input.nextFloat();
        System.out.println(tinggi);
        
        System.out.print("bb : ");
        bb = input.nextDouble();
        System.out.println(bb);
        
        System.out.print("gender : ");
        gender = input.next().charAt(0);
        System.out.println(gender);
        
        System.out.print("sehat : ");
        sehat = input.nextBoolean();
        System.out.println(sehat);
        /* Scanner adalah alat atau kelas dalam pemrograman 
         * yang digunakan untuk membaca input dari pengguna, 
         * seperti keyboard atau file, dan mengkonversi data 
         * menjadi format yang dapat diproses oleh komputer.
         */
        
        
    }
    
}
