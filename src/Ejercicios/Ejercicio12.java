package Ejercicios;

import java.util.Scanner;

/*
Realizar un programa que pida un número y calcular su factorial
 */
public class Ejercicio12 {

    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);

        int numero;
        long factorial = 1;

        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println("Bienvenido! Vamos a calcular el Factorial");
        System.out.print("Por favor ingrese el número: ");
        numero = num.nextInt();

        for (int i = 1; i <= numero; i++){
            factorial *= i;
        }
        System.out.println("El factorial del "+numero+" es: "+factorial);
        System.out.println("------------------------------------------------------------------------------------------");
    }
}
