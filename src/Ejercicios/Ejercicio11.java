package Ejercicios;

import java.util.Scanner;

/*
Realizar un programa que muestre el producto de los 10 primeros números impares
 */
public class Ejercicio11 {

    public static void main(String[] args) {

        Scanner texto = new Scanner(System.in);

        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("Bienvenido!" +
                "\nVamos a comenzar a calcular el producto");
        System.out.print("Ingresa el número para calcular el producto: ");
        long producto2 = texto.nextInt();

        long producto = 1;
        for (int p = 1; p <= 2; p *=2){ //Los 10 primeros números impares van del 1 hasta el 19
                                         //Y se empieza inicializando el int p = 1 por ser impar
            producto *= producto2;
        }
        System.out.println("El resultado del producto es: " +producto+ "\nSolución: " +producto2+"² = " +producto2+ "*"+""+producto2+" = "+producto);
        System.out.println("-----------------------------------------------------------------------------------------");
    }
}
