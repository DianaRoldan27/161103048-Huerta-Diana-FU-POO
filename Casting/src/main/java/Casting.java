
public class Casting {
    public static void main (String args[]){
        
       //Casting Explicito
        short a=1;
        int b=15;
        a=(short)b;
        
        //Casting implicito
        float c=4.5f;
        double d=5.6;
        d=c;
        
        //Que pasa con los decimales cuando casteo de flotante a double a entero.
        double pi=3.5f;
        int duda =(int)pi;
        System.out.println("Imprime el valor de duda:"+duda);
        
        //Casting String
        
        String valor = "15";
        int n = Integer.parseInt(valor);
        
        n=n+duda;
        System.out.println(n);
        
        //CICLO FOR
        ;
        for(int i=0;i<10;i++){
        System.out.println(i + "-");
        }
        System.out.println();
        
        //Ciclo while
        
        
        
        
        
    }
    
}
