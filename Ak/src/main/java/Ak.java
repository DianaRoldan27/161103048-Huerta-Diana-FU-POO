//CLASE DE LA PLANTILLA PARA CREAR OBJETOS.
public class Ak {
    //ATRIBUTOS DATOS O CARACTERISTICAS DEL OBJETO DE MANERA GENERAL.
    
    String tipo;
    int cargador;
    int precision;
    double velocidadCarga;
    double precio;
    int danio;
    
    //METODOS:SON ACCIONES O INTERACCIONES DEL OBJETO.
    public void disparar(){
        System.out.println("Te estoy disparando con un daño de"+danio);
    }
    public void apuntar(){}
    public void cargar(){}

    @Override
    public String toString() {
        return "Ak{" + "tipo=" + tipo + ", cargador=" + cargador + ", precision=" + precision + ", velocidadCarga=" + velocidadCarga + ", precio=" + precio + ", danio=" + danio + '}';
    }
    
    
    
    
    
}

