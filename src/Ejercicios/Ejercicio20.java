package Ejercicios;

import java.util.Scanner;

/*
Pedir 10 números y mostrar al final si se ha introducido un negativo, mostrar la suma de todos los números
 */
public class Ejercicio20 {

    public static void main(String[] args) {

        Scanner T = new Scanner(System.in);

        int numero, sumPositivos = 0;
        boolean negativos = false;

        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("Bienvenido! vamos a confirmar si ingresas números negativos");
        System.out.println("Comenzemos!!!");

        for (int i = 1; i <= 5; i++){
            System.out.print("Digite el número "+i+": ");
            numero = T.nextInt();

            if (numero <0){
                negativos = true;
            }
            sumPositivos += numero;
        }
        if (negativos == true){
            System.out.println("El usuario digito números negativos");
        }else {
            System.out.println("El usuario no digito números negativos");
        }
        System.out.println("La suma de los números son: "+sumPositivos);
        System.out.println("-----------------------------------------------------------------------------------------");
    }
}
