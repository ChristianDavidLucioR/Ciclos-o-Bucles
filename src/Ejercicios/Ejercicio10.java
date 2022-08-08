package Ejercicios;

import java.util.Scanner;

/*
Pedir 5 números y escribir la suma total
 */
public class Ejercicio10 {

    public static void main(String[] args) {

        Scanner pantalla = new Scanner(System.in);

        int numero, suma = 0;

        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println("""
                Bienvenido!\s
                Escribe tus numeros para sumarlos
                Te recuerdo son 5 números!""");
        for (int s = 1; s <= 5; s++){
            System.out.print("Ingrese un número: ");
            numero = pantalla.nextInt();

            suma += numero;
        }
        System.out.println("El resultado de los números ingresados son: "+suma);
        System.out.println("------------------------------------------------------------------------------------------");
    }
}
