package Ejercicios;

import java.util.Scanner;

public class Ejercicio16 {

    public static void main(String[] args) {

        Scanner tabla = new Scanner(System.in);

        int numero;

        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println("Bienvenido! A las tablas de Multiplicar ;)");
       do {
           System.out.print("Ingrese el número para conocer la tabla: ");
           numero = tabla.nextInt();

       }while (numero < 0 || numero > 10);
        System.out.println("Tabla de multiplicar del número ("+numero+ ") es: \n");

        for (int i = 1; i <= 12; i++){
            System.out.println(numero+ " * "+i+ " = "+numero*i);
        }
        System.out.println("------------------------------------------------------------------------------------------");
    }
}
