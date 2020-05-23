
import java.util.Scanner;

public class AdivinaNumero {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int vidas=3,num=-1;
        int numero=1;
        
           numero = (int) (Math.random()*100+1);
           
      while(vidas> 0 && num!=numero)
         {
          System.out.println("Ingrese un numero");   
          num = sc.nextInt();
          
           if(num==numero)
           {
               System.out.println("Si es el valor");
           }
          else if(num!=numero)
          {
               if(num>numero){
                   
                System.out.println("Demasiado alto, intente de nuevo:");
                vidas--;
            }  else
                 {
                    System.out.println("Demasiado bajo, intente de nuevo:");
                     vidas--;  
                    }
            }
                     if(vidas==0)
                     {
                 System.out.println("Perdiste el numero es: "+numero);
                        }
        }
    }
}