
import java.util.Scanner;


public class JuegoMain {
    public static void main(String args[]){
        //CONSTRUCTOR VACIO.
        
        /*Ak bronce = new Ak("bronce",5,65,5,1000,10,20);
        System.out.println(bronce);*/
        Scanner leer = new Scanner(System.in);
        Ak ak = new Ak();
        
        int valor,i=1;
        while (i < 3) {
            if (i == 1) {
                System.out.println("MENU");
                System.out.println("Jugador " +i+ " elija la categoria del arma");
                System.out.println("1. Bronce");
                System.out.println("2. Plata");
                System.out.println("3. Oro");
                System.out.println("4. Diamante");
                System.out.println("5. Adamantium");
                System.out.println("\n");
                valor = leer.nextInt();

                Personaje p1 = new Personaje("Diana");  
                p1.equiparArma(valor);
                System.out.println(p1);
                System.out.println(p1.disparar());

                i++;
            } else {
                System.out.println("MENU");
                System.out.println("Jugador " + i + " elija la categoria del arma");
                System.out.println("1. Bronce");
                System.out.println("2. Plata");
                System.out.println("3. Oro");
                System.out.println("4. Diamante");
                System.out.println("5. Adamantium");
                valor = leer.nextInt();

                Personaje p2 = new Personaje("Norma");
                p2.equiparArma(valor);
                System.out.println(p2);
                System.out.println(p2.disparar());

                i++;
            }
            if(i == 3){
                System.out.println("MENU");
                System.out.println("Jugador " + i + " elija la categoria del arma");
                System.out.println("1. Bronce");
                System.out.println("2. Plata");
                System.out.println("3. Oro");
                System.out.println("4. Diamante");
                System.out.println("5. Adamantium");
                valor = leer.nextInt();

                Personaje p3 = new Personaje("Ayme"); 
                p3.equiparArma(valor);
                System.out.println(p3);
                System.out.println(p3.disparar());    
                    
            }
        }
    }
}
