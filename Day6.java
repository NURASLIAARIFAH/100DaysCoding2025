package Day6;

public class Main {
    
    public static void main(String[] args) {
        // Tipe Data Pecahan
        float berat = 53.0f;
        double tinggi = 150.1;
        // float -> Menggunakan 32-bit (4 byte) 
        // double -> Menggunakan 64-bit (8 byte) , dua kali lebih banyak dari float
        System.out.println("berat : " + berat + " kg " );
        System.out.println("tinggi : " + tinggi + " cm ");
        /* Perbedaan antara tipe data desimal float dan double 
        adalah ukuran penyimpanan, presisi, dan rentang nilai.
        Float menggunakan 32-bit untuk penyimpanan, 
        yang memberikan presisi hingga sekitar 7 digit desimal dan rentang nilai yang lebih kecil.
        Sebaliknya, double menggunakan 64-bit, menawarkan presisi hingga sekitar 15 digit desimal dan rentang nilai yang jauh lebih besar */
    }
    
    
}
