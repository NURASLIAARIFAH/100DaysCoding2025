package EvaluasiMentor2;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //Soal 1
        System.out.print("Masukkan suhu dalam celcius: ");
        double celcius = s.nextInt();
        System.out.println("1.Fahrenheit");
        System.out.println("2.Kelvin");
        System.out.print("Masukkan pilihan anda: ");
        int pilih = s.nextInt();
        if(pilih == 1){
            double celcius1 = celcius * 9/5 + 32;
            System.out.println("Hasil Konversi: " + celcius + "C = " + celcius +"F");
        }else if(pilih == 2){
            final double celcius2 = celcius + 273.15;
            System.out.println("Hasil Konversi: " + celcius + "C = " + celcius2 +" K");
        }
        //Soal 2
        System.out.print("Username: ");
        String user = s.nextLine();
        System.out.print("Password: ");
        String pass = s.nextLine();
        if(user.equals("Aslia")&&pass.equals("3")){
          System.out.println("Anda login sebagai pengguna");
    }else if(user.equals("admin")&&pass.equals("admin")){
          System.out.println("Anda login sebagai admin");
}else{
    System.out.println("Akun tidak ditemukan");
    }
    }
    } 
