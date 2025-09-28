package Day21;
public class Main {
    public static void main(String[] args) {
        // Program untuk menukar nilai dua variabel
        int a = 5;
        int b = 10;
        System.out.println("sebelum ditukar :");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        
        a = a + b;
        b = a - b;
        a = a - b;
        
        System.out.println("setelah ditukar : ");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        
        System.out.println("sebelum ditukar : ");
        System.out.println(" a = " + a);
        System.out.println(" b = " + b);
        
        int temp = a;
        a = b;
        b = temp;
        
        System.out.println("\nsetelah ditukar : ");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        
    }
    
}
