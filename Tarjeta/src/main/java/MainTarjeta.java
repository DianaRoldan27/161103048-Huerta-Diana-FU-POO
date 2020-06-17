import java.util.Scanner;
public class MainTarjeta {
    
     public static void main(String args[]){
         
        Scanner leer = new Scanner(System.in);
        //Declarando al programa que usare un objeto de tipo Tarjetas
        Tarjeta tarjeta;

        int noCuenta, NIP;
        System.out.println("Numero de cuenta:");
        noCuenta = leer.nextInt();
        System.out.println("Ingresa tu NIP");
        NIP = leer.nextInt();
        
        tarjeta = new Tarjeta().verificarCuenta(noCuenta, NIP);
       
        System.out.println("BIENVENIDO \n" + tarjeta.nombre);
        
        int opc;
        do {
            System.out.println("1.Hacer un deposito");
            System.out.println("2.Hacer un retiro");
            if(tarjeta.montoApartado>0){
                System.out.println("3.Eliminar apartado");
            }else{
                System.out.println("3.Crear apartado");
            }
            System.out.println("4.Pagar tarjeta");
            System.out.println("5.Imprimir datos de la cuenta");
            System.out.println("6.Salir");
            System.out.println("Elige una opcion:");
            opc = leer.nextInt();
            
            switch (opc) {
                case 1:
                    System.out.println("Introduzca la cantidad a depositar:");
                    double deposito = leer.nextDouble();
                    tarjeta.deposito(deposito);
                   
                    break;
                case 2:
                    System.out.println("Introduzca la cantidad a retirar:");
                    double retiro = leer.nextDouble();
                    tarjeta.verificarRetiro(retiro);
                    break;
                case 3:
                    if(tarjeta.montoApartado!=0){
                        tarjeta.apartado();
                        System.out.println("Apartado eliminado\n");
                    }else{
                        System.out.println("Introduzca la cantidad de apartado: \n");
                        double apartado = leer.nextDouble();
                        tarjeta.verificarApartado(apartado);
                    }
                    break;       
                case 4:
                    System.out.println("Introduzca el numero de tarjeta");
                    double noTarjeta = leer.nextDouble();
                    tarjeta.verificarTarjeta(noTarjeta);
                    break;
                case 5:
                    System.out.println(tarjeta.toString());
                    System.out.println("\n");
                    break;
            }
        } while (opc !=6);
        System.out.println("¡Hasta luego!");
    }
}
       
     
        
    
