package Day54;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int totalNilai = 0;
        int jumlahValid = 0;
        int jumlahTidakValid = 0;
        int nilaiTerkecil = 100;
        int nilaiTerbesar = 0;
        System.out.print("Masukkan Jumlah: ");
        int jumlah = s.nextInt();
        for (int i = 1; i <= jumlah; i++) {
            System.out.print("Masukkan Nilai: ");
            int nilai = s.nextInt();
                       
            if(nilai < 0 || nilai > 100){
                System.out.println("Nilai tidak valid dan tidak diproses");
                jumlahTidakValid++;
                continue;
            }
            totalNilai += nilai;
            jumlahValid++;
                            
            if(nilai < nilaiTerkecil){
                nilaiTerkecil = nilai;
            }
            if(nilai > nilaiTerbesar){
                nilaiTerbesar = nilai;
            }}                          
        System.out.println("Total nilai valid: " + totalNilai);
        System.out.println("Jumlah nilai valid: " + jumlahValid);
        System.out.println("Jumlah nilai tidak valid: " + jumlahTidakValid);
                            
        if(jumlahValid > 0){
            double rataRata = (double)totalNilai / jumlahValid;
                System.out.println("Nilai valid terkecil: " + nilaiTerkecil);
                System.out.println("Nilai valid terbesar: " + nilaiTerbesar);
                System.out.println("Rata-rata valid: " + rataRata);
        }else{
                System.out.println("tidak valid");
    }}}
