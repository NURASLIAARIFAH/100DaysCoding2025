package Day48;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Angka1 : ");
        int angka1 = s.nextInt();
        System.out.print("Angka2 : ");
        int angka2 = s.nextInt();
        System.out.print("Operator (+ * - / %): ");
        char operator = s.next().charAt(0);
        int hasil = 0;
        switch(operator){
            case '+':
            hasil = angka1 + angka2;
            System.out.println("Hasil = " + hasil);
            break;
            case '-':
            hasil = angka1 - angka2;
            System.out.println("Hasil = " + hasil);
            break;
            case '*':
            hasil = angka1 * angka2;
            System.out.println("Hasil = " + hasil);
            break;
            case '/':
            hasil = angka1 / angka2;
            System.out.println("Hasil = " + hasil);
            break;
            case '%':
            hasil = angka1 % angka2;
            System.out.println("Hasil = " + hasil);
            break;
            default:
            System.out.println("Operator tidak valid");
        }}}
