
import java.util.Scanner;

public class CalcularEdad {
    
    public static void main (String args []){
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingresa tu año de nacimiento");
        int a_ac = scan.nextInt();
        System.out.println("Ingresa el año actual");
        int date  = scan.nextInt();

        int edad_user = date - a_ac;
        System.out.println("Tu edad es:"+edad_user);
        
    } 
}