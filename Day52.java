package Day52;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("batas angka: ");
        int batas = s.nextInt();
        int a = 1;
        while(a <= batas){
            if(a % 2 == 0){
                System.out.println(a + " bilangan genap ");
            }else{
                System.out.println(a + " bilangan ganjil ");
            }
            a++;
        }}}
