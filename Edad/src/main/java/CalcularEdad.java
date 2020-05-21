
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class CalcularEdad {
    public static void main (String args []) throws IOException{
        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Año de nacimiento\n");
        int an =Integer.parseInt(teclado.readLine());
        System.out.println("Año actual\n");
        int ac =Integer.parseInt(teclado.readLine());
        
        System.out.println("Años recorridos");
        System.out.println(an);
        
        int c=an; while (c<an){ c=c+1; 
    }
        System.out.println("ya quedo");
}
}