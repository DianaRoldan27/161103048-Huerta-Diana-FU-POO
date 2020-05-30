
public class Avisos {
    int numero=0;
    String titulo="";
    String texto="";
    String resumen="";
    String fecha="";
    String alta="";
    String baja="";
    String tipo="";
    String status="";
    String nombre="";
    
    // Constructor con un parametro
    
    public Avisos (int numero,String titulo,String texto,String resumen,String fecha,String alta,String baja,String tipo,String status,String nombre){
        this.numero=numero;
        this.titulo=titulo;
        this.texto=texto;
        this.resumen=resumen;
        this.fecha=fecha;
        this.alta=alta;
        this.baja=baja;
        this.tipo=tipo;
        this.status=status;
        this.nombre=nombre;
    }

    @Override
    public String toString() {
        return "Avisos{" + "numero=" + numero + ", titulo=" + titulo + ", texto=" + texto + ", resumen=" + resumen + ", fecha=" + fecha + ", alta=" + alta + ", baja=" + baja + ", tipo=" + tipo + ", status=" + status + ", nombre=" + nombre + '}';
    }

    
    
}
    
