import java.util.Scanner;

public class CicloWhile {
    /*
    Ciclo While

    While (condicion) {
        Instruccion;
    }
     */
    public static void main(String[] args) {

        Scanner pantalla = new Scanner(System.in);

        int i = 1, contador;

        System.out.print("Ingrese los números que quiere en pantalla: ");
        contador = pantalla.nextInt();

        while (i <= contador){
            System.out.print( i+ " - ");
            i++; // Si queremos que vayan en 2 en 2 o mas Solo se coloca i+=2 y asi sucesivamente

        }
    }
}
