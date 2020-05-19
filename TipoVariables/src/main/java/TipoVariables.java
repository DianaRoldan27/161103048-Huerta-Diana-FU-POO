
public class TipoVariables {
    public static void main (String args []){
      //
      /*
      Fuertemente tipado
      Debemos de declarar el tipo de variable que es y esta siempre en el programa mantendra ese tipo
      Una variable no puede pasar facilmente a ser de otro tipo
      Castear (el convertir una variable de un tipo a otro).
      */
      // tipos numericos 
      int a=10, b=2;
      
      //operaciones aritmeticas 
      System.out.println(a+b);
      System.out.println(a-b);
      System.out.println(a*b);
      System.out.println(a/b);
      System.out.println(a%b);
      
      // tipos flotantes 
      float pi=3.14f;
      double pi2=3.14;
      
      // cambios de variables
      boolean bandera = true;
      
      // ingresar caracteres 
      char  letra = 'a';
      String palabra = "Puedes poner un mensaje largo";
      
      System.out.println(palabra);
      
      // concatenar
      System.out.println(palabra+"y esta es una prueba de ello");
      
      System.out.println("Este es el valor de pi"+pi);
      System.out.println("Este es el valor del circulo"+pi*a);
      
      
      
    }        
}
