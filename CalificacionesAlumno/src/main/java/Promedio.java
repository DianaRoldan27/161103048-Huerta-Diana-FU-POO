
import java.util.Scanner;

public class Promedio {
    public static void main (String args[]){
        
    double cal1,cal2,cal3,cal_Final;
    Scanner leer = new Scanner(System.in);
    
    System.out.println("Introduzca su primer calificacion:");
    cal1=leer.nextInt();
    
    System.out.println("Introduzca su segunda calificacion:");
    cal2=leer.nextInt();
    
    System.out.println("Introduzca su tercera calificacion:");
    cal3=leer.nextInt();
    
    cal_Final=cal1*0.40+cal2*0.40+cal3*0.20;
    System.out.println("Su promedio es:"+cal_Final);
    }   
    }