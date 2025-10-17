package Day40;
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
        if(operator == '+'){
           int hasil = angka1 + angka2;
            System.out.println("hasil dari " + angka1 + "+" + angka2 + " = " + hasil);
        }else if(operator == '*'){
            int hasil = angka1 * angka2;
            System.out.println("hasil dari " + angka1 + "*" + angka2 + " = " + hasil);
        }else if(operator == '-'){
           int hasil = angka1 - angka2;
            System.out.println("hasil dari " + angka1 + "-" + angka2 + " = " + hasil);
        }else if(operator == '/'){
            int hasil = angka1 / angka2;
             System.out.println("hasil dari " + angka1 + "/" + angka2 + " = " + hasil);
        }else if(operator == '%'){
            int hasil = angka1 % angka2;
        System.out.println("hasil dari " + angka1 + "%" + angka2 + " = " + hasil);
    }
    }
    }
