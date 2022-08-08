package Ejercicios;

import java.util.Scanner;
/*
Escribir todos los números del 100 al 0 de 7 en 7.
 */
public class Ejercicio9 {

    public static void main(String[] args) {

        Scanner usuario = new Scanner(System.in);

        int numero;

        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println("Bienvenido!");
        System.out.print("Por favor ingrese el número para imprimir en pantalla: ");
        numero = usuario.nextInt();

        for (int i = numero; i >= 0; i -= 7){
            System.out.print(i+ " - ");
        }
        System.out.println("\nEl numero ingresado fue el: " +numero+ " y se disminuyo de 7 en 7");
        System.out.println("------------------------------------------------------------------------------------------");
    }
}
