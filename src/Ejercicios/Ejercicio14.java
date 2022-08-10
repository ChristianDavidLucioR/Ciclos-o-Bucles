package Ejercicios;

import java.util.Scanner;

/*
Realizar un programa que pida 10 sueldos. Mostrar la suma y cuantos hay mayores de $1000US
 */
public class Ejercicio14 {

    public static void main(String[] args) {

        Scanner texto = new Scanner(System.in);

        float sueldos, totalS = 0, sumaS = 0;

        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("Bienvenido!");

        for (int i = 1; i <= 2; i++){

            System.out.print("Ingresa el sueldo de los empleados: ");
            sueldos = texto.nextInt();

            if (sueldos >= 1000) {
                totalS++;
            }
            sumaS += sueldos;
        }
        System.out.println("El total de los sueldos es: "+sumaS+ " Dolares");
        System.out.println("Cantidad de sueldos mayores a $1000 US: "+totalS);
        System.out.println("-----------------------------------------------------------------------------------------");
    }
}
