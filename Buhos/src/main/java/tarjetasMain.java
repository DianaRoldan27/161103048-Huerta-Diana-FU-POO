
public class tarjetasMain {
   public static void main (String args[]){
       
      tarjetas morada = new tarjetas();
      System.out.println("Morada");
      morada.tarjeta = "Morada";
      morada.puntos=9;
      System.out.println(morada.toString());
      
      tarjetas estudiante = new tarjetas();
      System.out.println("Estudiante");
      estudiante.tarjeta = "Estudiante";
      estudiante.puntos = 3;
      System.out.println(estudiante.toString());
      
      tarjetas especial = new tarjetas ();
      System.out.println("Especial");
      especial.tarjeta = "Especial";
      especial.puntos = 12;
      System.out.println(especial.toString());
      
      tarjetas docente = new tarjetas();
      System.out.println("docente");
      docente.tarjeta = "Docente";
      docente.puntos = 2;
      System.out.println(docente.toString());
      
      tarjetas oro = new tarjetas();
      System.out.println("Oro");
      oro.tarjeta = "Oro";
      oro.puntos = 2;
      System.out.println(oro.toString());
       
   }
}
