
import java.util.Scanner;

public class Pago {
    public static void main (String args[]){
     double N,monto;
      Scanner sc = new Scanner(System.in);
      System.out.println("Ingrese monto de compra");
      N=sc.nextDouble();
      if(N>100){
          monto= N-(N*0.10);
          System.out.println(monto);
      }else{
          if(N <= 100 && N > 50){
              monto = N-(N*0.5);
              System.out.println(monto);
          }else{
              System.out.println(N);
          }
      }
    }   
} 
    

