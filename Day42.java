package Day42;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Nama Pegawai: ");
        String nama = s.nextLine();
        System.out.print("======= Pekerjaan =======");
        System.out.print("\n1.PNS\n2.Freelancer");
        System.out.println("\n===========================");
        System.out.print("Pilih Pekerjaan: ");
        int pilih = s.nextInt();
        System.out.print("Penghasilan: ");
        int hasil = s.nextInt();
        String JenisPekerjaan = "";
        int pajak = 0;
        if(pilih == 1){
            JenisPekerjaan = "PNS";
            if(hasil >= 5000000){
                pajak = 15;
            }else if(hasil >= 3000000){
                pajak = 10;
          }else{
              pajak = 0;  
            }
        }else if(pilih == 2){
            JenisPekerjaan = "Frelancer";
        if(hasil >= 5000000){
            pajak = 8;
        }else if(hasil >= 3000000){
            pajak = 3;
    }else{
        pajak = 0;
    }
    }else{
        System.out.println("Pilihan pekerjaan tidak ada");
    }
        double potongan = hasil*pajak;
        double penghasilanBersih = hasil-potongan;
        System.out.println("===============================");
        System.out.println("Nama Pegawai\t\t: " + nama);
        System.out.println("JenisPekerjaan\t\t: " + JenisPekerjaan);
        System.out.println("PenghasilanKotor\t: Rp " + hasil);
        System.out.println("Pajak Dikenakan\t\t: " + pajak + "%");
        System.out.println("Potongan\t\t: Rp " + potongan);
        System.out.println("PenghasilanBersih\t: Rp " + penghasilanBersih);
            }
    }

