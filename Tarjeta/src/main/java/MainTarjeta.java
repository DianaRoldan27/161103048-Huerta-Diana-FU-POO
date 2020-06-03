
import java.util.Scanner;
public class MainTarjeta {
    
     public static void main(String args[]){
         
         //DECLARANDO AL PROGRAMA QUE USARE UN OBJETO DE TIPO TARJETA 
        Tarjeta tarjeta;
        Scanner scan = new Scanner(System.in);
        int noCuenta, NIP,opcion;
    
        
        System.out.print("Número de cuenta: ");
        noCuenta = scan.nextInt();
        
        System.out.print("NIP: ");
        NIP = scan.nextInt();
        
        //AL MISMO TIEMPO QUE ESTOY INSTANCIANDO LLAMO AL METODO verificarCuenta 
        tarjeta = new Tarjeta().verificarCuenta(noCuenta, NIP);
        System.out.println("Bienvenido\n" + tarjeta.nombre);
        System.out.println("Informacion de la cuenta\n"+tarjeta.toString());
        
         //MENU
       do{
            System.out.println("¿Que desea realizar?");
            System.out.println("1-Hacer un deposito\n");
            System.out.println("2-Hacer un retiro\n");
            System.out.println("3-Eliminar apartado\n");
            System.out.println("4-Imprimir datos de la cuenta \n");
            System.out.println("5-Salir");
            System.out.println("Opcion:");
            opcion=scan.nextInt();
        
        switch(opcion){
                case 1 : 
                    System.out.println("Monto a depositar: ");
                    tarjeta.Deposito(scan.nextDouble());
                    break;

                case 2:
                    System.out.println("Monto a retirar : ");
                    tarjeta.Retiro(scan.nextDouble());
                    break;

                 case 3 : 
                    tarjeta.EliminarApartado();
                    System.out.println("Apartado eliminado");
                    break;   

                 case 4 :
                     System.out.println(tarjeta.toString());
                     break;
            }
        }while(opcion!=5);
            System.out.println ("¡Hasta luego!");
        }  
}               
       
     
        
    
