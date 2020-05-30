
public class JuegoMain {
    public static void main(String args[]){
        //CONSTRUCTOR VACIO.
        
        Ak bronce = new Ak("bronce",5,65,5,1000,10,20);
        bronce.tipo="bronce";
        bronce.cargador=5;
        bronce.precision=65;
        bronce.velocidadCarga=5;
        bronce.precio=1000;
        bronce.danio=10;
        System.out.println(bronce.toString());
        
        Ak plata = new Ak();
        plata.tipo = "Plata";
        plata.cargador=8;
        plata.precision=70;
        plata.velocidadCarga=4.5;
        plata.precio=2300;
        plata.danio=11;
        System.out.println(plata.toString());
        
        Ak oro = new Ak();
        oro.tipo="Oro";
        oro.cargador=10;
        oro.precision=85;
        oro.velocidadCarga=4.3;
        oro.precio=2500;
        oro.danio=13;
        System.out.println(oro.toString());
        
        Ak diamante = new Ak();
        diamante.tipo = "Diamante";
        diamante.cargador = 20;
        diamante.precision = 95;
        diamante.velocidadCarga=3;
        diamante.precio = 4000;
        diamante.danio = 20;
        System.out.println(diamante.toString());
        
        Ak adamantium = new Ak();
        adamantium.tipo = "Adamantium";
        adamantium.cargador = 30;
        adamantium.precision = 100;
        adamantium.velocidadCarga=1;
        adamantium.precio = 1000;
        adamantium.danio = 27;
        System.out.println(adamantium.toString());
    }
}
