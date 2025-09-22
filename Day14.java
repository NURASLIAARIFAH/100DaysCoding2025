package Day14;

public class Main {
    
    public static void main(String[] args) {
        // Mengubah String menjadi tipe data primitif
            
        String Angka = "29";
        int huruf = Integer.parseInt(Angka);
        System.out.println(huruf);
       
        String Huruf = "19";
        byte kamu = Byte.parseByte(Huruf);
        System.out.println(kamu);
       
        String Cousin = "2";
        long sepupu = Long.parseLong(Cousin);
        System.out.println(sepupu);
        
        String Sister = "31";
        short saudari = Short.parseShort(Sister);
        System.out.println(saudari);
         
        String Woman = "1.2";
        double perempuan = Double.parseDouble(Woman);   
        System.out.println(perempuan);
        
        String Laptops = "2.3f";
        float laptop = Float.parseFloat(Laptops);
        System.out.println(laptop);
        
        String YoungerSister ="P";
        char adikperempuan = YoungerSister.charAt(0);
        System.out.println(adikperempuan);
        
        String Mother = "true";
        boolean ibu = Boolean.parseBoolean(Mother);
        System.out.println(ibu);
        
        /* String dapat dikonversi ke tipe data primitif
         * agar bisa digunakan dalam operasi logika atau perhitungan
         */
           }
    
}
