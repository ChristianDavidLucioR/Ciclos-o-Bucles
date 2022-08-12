package Ejercicios;
/*
UNA EMPRESA QUE SE DEDICA A LA VENTA DE DESINFECTANTES NECESITA UN PROGRAMA PARA GESTIONAR LAS FACTURAS.
EN CADA FACTURA FIGURA: EL CODIGO DEL ARTICULO, LA CANTIDAD VENDIDA EN LITROS Y EL PRECIO POR LITRO.
SE PIDE DE 5 FACTURAS INTRODUCIDAS: FACTURACION TOTAL, CANTIDAD DE LITROS VENDIDOS Y CUANTAS FACTURAS SE EMITIERON DE MAS DE $600
 */
import java.util.Scanner;

public class Ejercicio17 {

    public static void main(String[] args) {

        Scanner facturacion = new Scanner(System.in);

        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("Benvenido! Axion Desinfectantes S.A\n");

        int codigoArticulo, litros, conteoMas600 = 0, totalLitros = 0,totalFactura = 0;
        float precioLitro, sumaFactura;

        for (int i = 1; i <= 2; i++) {

            System.out.print("Factura N°" +i+ ": Digite el codigo del articulo: ");
            codigoArticulo = facturacion.nextInt();
            System.out.print("Digite la cantidad de litros: ");
            litros = facturacion.nextInt();
            System.out.print("Digite el precio: ");
            precioLitro = facturacion.nextFloat();

            sumaFactura = litros * precioLitro;
            totalFactura += sumaFactura;
            
            totalLitros +=litros;

            if (sumaFactura > 600){
                conteoMas600++;
            }
        }
        System.out.println("\nTu factura en Axion Desinfectates\n");
        System.out.println("Total de la factura: "+totalFactura+" USD");
        System.out.println("Cantidad en litros vendidos: "+totalLitros+"L");
        System.out.println("Cantidad de facturas mayores a 600 USD: ("+conteoMas600+ ")");
        System.out.println("-----------------------------------------------------------------------------------------");
    }
}
