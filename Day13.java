package Day13;

public class Main {
    
    public static void main(String[] args) {
      // Evaluasi
    
      // Nomor 1
          //file 1
          // package soal;
          //file 2
          // public class file2{}
          //file 3
          // public static void main(String[] args){}
        
        // Nomor 2
        // Deklarasi adalah proses mendefinisikan variabel dengan menentukan tipe data dan nama variabel
        String nama;  
        int umur;
        byte hp;
        short bestie;
        long saudara;
        float tinggi;
        double berat;
        char gender;
        boolean sehat;
        // Inisialisasi adalah proses memberikan nilai awal kepada variabel yang telah dideklarasikan
        nama = "nuriy";
        umur = 5;
        hp = 1;
        bestie = 2;
        saudara = 3;
        tinggi = 50;
        berat = 20;
        gender = 'p';
        sehat = true;
        // Update
        nama = "nisa";
        umur = 4;
        hp = 1;
        bestie = 2;
        saudara = 3;
        tinggi = 20;
        berat = 13;
        gender = 'p';
        sehat = true;
        
        // Nomor 3
        Scanner sc =  new Scanner(System.in);
        String nama,alamat,nim;
        int umur;
        boolean status;
        double tinggibadan;
        float beratbadan;
        char kelas;
       
       System.out.print("nama:");
       nama = sc.nextLine();
       System.out.print("umur:");
       umur = sc.nextInt();
       System.out.print("nim:");
       sc.nextLine();
       nim = sc.nextLine();       
       System.out.print("status:");
       status = sc.nextBoolean();
       System.out.print("Tinggi Badan:");
       tinggibadan = sc.nextDouble();
       System.out.print("Berat Badan:");
       beratbadan = sc.nextInt();
       System.out.print("kelas:");
       kelas = sc.next().charAt(0);
      // sc.next().charAt(0);
       //sc.nextLine();
       System.out.print("alamat:");
       alamat = sc.next();
       
       System.out.print("===== Biodata Mahasiswa =====");
       System.out.print("\nNama\t\t : \t" + nama);
       System.out.print("\nUmur\t\t : \t" + umur + " Tahun");
       System.out.print("\nNim\t\t : \t" + nim);
       System.out.print("\nStatus\t\t : \t" + status);
       System.out.print("\nTinggi Badan\t : \t" + tinggibadan + " cm");             
       System.out.print("\nBerat Badan\t : \t"+ beratbadan + " kg");      
       System.out.print("\nKelas\t\t : \t" + kelas);       
       System.out.print("\nAlamat\t\t : \t" + alamat);
           
         
          
        
        
        
        
        
    }
    
}
