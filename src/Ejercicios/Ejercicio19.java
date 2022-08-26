package Ejercicios;
/*
Pedir al usuario un número de sueldos N, introducir N sueldos, mostrar el sueldo maximo y la suma de los
sueldos.
 */
import java.util.Scanner;

public class Ejercicio19 {

    public static void main(String[] args) {

        Scanner usuario = new Scanner(System.in);

        int numSueldos;

        float sueldos, sueldoMax = 0, sum_sueldos= 0;

        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("Bienvenido! a la Calculadora de Sueldos\n");
        System.out.print("Ingrese el número de cantidad de sueldos: ");
        numSueldos = usuario.nextInt();

        for (int i = 0; i <numSueldos; i++){
            System.out.print("Ingrese el sueldo #"+i+": ");
            sueldos = usuario.nextInt();

            if (sueldos > sueldoMax){
                sueldoMax = sueldos;
            }
            sum_sueldos += sueldos;
        }
        System.out.println("\nEl sueldo maximo es: "+sueldoMax+" US");
        System.out.println("La suma de todos los sueldos son: "+sum_sueldos+" US");
        System.out.println("-----------------------------------------------------------------------------------------");
    }
}
