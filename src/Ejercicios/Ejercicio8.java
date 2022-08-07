package Ejercicios;

import java.util.Scanner;

/*
Pedir un número N, y mostrar todos los números del 1 al N.
 */
public class Ejercicio8 {

    public static void main(String[] args) {

        Scanner natural = new Scanner(System.in);

        int numero,n;

        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.print("Bienvenido!" +
                "\nPor favor ingresa el número: ");
        numero = natural.nextInt();

        n = 1;
        System.out.println("Vamos a recorrer hasta el número: "+numero);

        while (n <= numero){
            System.out.print(n+ " - ");
            n++;
        }
        System.out.println("\n-----------------------------------------------------------------------------------------");
    }
}
