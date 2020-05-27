
import java.util.Scanner;

public class Pares {
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
        int num1;
        System.out.println("Dame un numero: ");
        num1 = scan.nextInt();
        
        System.out.println(" \n");
        for (int i = 2; i <=num1; i+=2) {
            System.out.println(i);
        }
    }
}
