package Day44;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Masukkan nilai: ");
        int nilai = s.nextInt();
        String predikat = "";
        if (nilai >= 90) {
            predikat = "A (Sangat Baik)";
        } else if (nilai >= 80) {
            predikat = "B (Baik)";
        } else if (nilai >= 70) {
            predikat = "C (Cukup)";
        } else if (nilai >= 60) {
            predikat = "D (Kurang)";
        } else {
            predikat = "E (Sangat Kurang)";
        } 
        System.out.println("nilai: " + nilai);
        System.out.println("Predikat: " + predikat);
    }}
