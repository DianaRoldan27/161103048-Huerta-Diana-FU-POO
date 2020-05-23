
import java.util.Scanner;
//Un vendedor recibe un sueldo base 3000 mas el 10% de su venta total.
//Un programa que calcule el sueldo de un vendedor dando su venta total
public class VendedorSueldo {
    public static void main (String args[]){
       float sueldoBase, vuno, vdos ,ventas,comision,total;
        
        System.out.print("Ingresa tu sueldo base: ");
        Scanner lee = new Scanner (System.in);
        sueldoBase = lee.nextFloat();
        System.out.print("Ingresa tu 1er venta: ");
        vuno= lee.nextFloat();
        System.out.print("Ingresa tu 2da venta: ");
        vdos= lee.nextFloat();
        
        ventas= vuno+vdos;
        comision=(ventas*10)/100;
        total=sueldoBase+comision;
        
        System.out.println("Obtendrás por concepto de comisiones: $"+comision);
        System.out.println("Obtendrás en total: $"+total);    
            }
}
