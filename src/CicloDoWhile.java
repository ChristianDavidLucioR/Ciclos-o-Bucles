import java.util.Scanner;

public class CicloDoWhile {
/*
Ciclo do While

    do {
        Instruccion;
    }While (Instruccion);
 */
    public static void main(String[] args) {

        Scanner pantalla2 = new Scanner(System.in);

        int i = 1, contador2;

        System.out.print("Ingrese los numeros que quiere en pantalla: ");
        contador2 = pantalla2.nextInt();

        do {
            System.out.print(i+ " - ");
            i++;
        }while (i <= contador2);
    }
}
