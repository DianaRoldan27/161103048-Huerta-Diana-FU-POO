public class Tarjeta {
    int noCuenta;
    int NIP;
    int cv;
    String nombre;
    int dia;
    int mes;
    int anio;
    double montoDisponible;
    double montoApartado;

    //constructor vacio
    public Tarjeta() {
    }

    //constructor con parametros
    public Tarjeta(int noCuenta, int NIP, int cv, String nombre, int dia, int mes, int anio, double montoDisponible, double montoApartado) {
        this.noCuenta = noCuenta;
        this.NIP=NIP;
        this.cv = cv;
        this.nombre = nombre;
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
        this.montoDisponible = montoDisponible;
        this.montoApartado = montoApartado;
    }

    
    public Tarjeta verificarCuenta(int noCuenta, int NIP) {
        if (noCuenta == 123123 && NIP == 1133) {

            return new Tarjeta(123123, 1133, 543, "Eduardo Diaz Flores", 31, 12, 2032, 45987.22, 550);

        } else if (noCuenta == 456789 && NIP == 3377) {

            return new Tarjeta(456789, 3377, 544, "Kevin Mesa Gonzalez", 31, 12, 2032, 360, 5322.23);

        } else {
            return new Tarjeta();
        }
    }
   
    //metodo para un deposito
    public void deposito(double deposito){
        this.montoDisponible = this.montoDisponible+deposito;
    }   
    
    //metodo para verificar antes de hacer un retiro
    public void verificarRetiro(double retiro) {
        if (retiro <= this.montoDisponible) {
            retiro(retiro);
            System.out.println("¡Retiro realizado con exito! \n");
        } else {
            System.out.println("Saldo insuficiente \n");
        }
    }

    //metodo para hacer el retiro
    public void retiro(double retiro){
        this.montoDisponible = this.montoDisponible - retiro;
    }
    
    //metodo para eliminar el apartado
    public void apartado() {
        this.montoDisponible=this.montoDisponible + this.montoApartado;
        this.montoApartado = 0;   
    }
    
    //verificar el apartado
    public void verificarApartado(double apartado){
        if(apartado <= this.montoDisponible){
            crearApartado(apartado);
            System.out.println("!Apartado Creado con exito¡");
        }else{
            System.out.println("No cuenta con saldo suficiente");
        }
    }
    
    //metodo para crear un apartado
    public void crearApartado(double apartado){
        this.montoApartado=this.montoApartado+apartado;
        this.montoDisponible=this.montoDisponible-this.montoApartado;
    }
    // metodo para verificar numero de tarjeta
    public void verificarTarjeta(double noTarjeta){
       if (noTarjeta == this.noCuenta){
            System.out.println("El cliente no existe \n");
        }else{
            System.out.println("El cliente si existe \n");
        }
    }
    public double total() {
        return this.montoDisponible + this.montoApartado;
    }

    
    @Override
    public String toString() {
        return "\n No.Cuenta:" + noCuenta + " \n NIP:" + NIP+ "\n CV:" + cv + "\n Nombre: " + nombre + "\n Fecha Vencimiento: " + dia + "/" + mes + "/" + anio + "\n montoDisponible:" + this.montoDisponible + "\n montoApartado: " + montoApartado + "\n Total:" + this.total();
    }
}