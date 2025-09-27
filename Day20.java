package Day20;
public class Main {
    public static void main(String[] args) {
        // Mengubah tipe data primitif menjadi string
           int nilai = 19;
           String str = String.valueOf(nilai);
           System.out.println("hasil = " + str);
        
           int a = 4;
           String str1 = a + "";
           System.out.println("hasil = " + str1);
        
           double angka = 12.3;
           String str2 = Double.toString(angka);
           System.out.println("hasil = " + str2);
        
    }
    
}
