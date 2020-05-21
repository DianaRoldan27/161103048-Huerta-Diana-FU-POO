
import java.util.Scanner;


public class AreaCuadrado {
    public static void main (String args[]){
        double area;
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese el lado de cuadrado");
        double a=sc.nextDouble();         
        area=a*a;
        System.out.println(area);  
    }
}
