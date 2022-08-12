package Ejercicios;

import java.util.Scanner;

/*
Dadas las edades y alturas de 5 alumnos, mostrar la edad y la estatura media, la cantidad de alumnos mayores de 18 años,
y la cantidad de alumnos que miden mas de 1.75
 */
public class Ejercicio15 {

    public static void main(String[] args) {

        Scanner E = new Scanner(System.in);

        int edad, sumEdad = 0, cantidadMayores = 0, cantidadAlunEsta = 0;
        float altura, sumaAlt = 0, mediaEdad, mediaAltura;

        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("Bienvenido! A la encuesta del Salón\n");
        for (int i = 1; i <= 2; i++){
            System.out.print("Ingrese la edad del alumno "+i+": ");
            edad = E.nextInt();

            System.out.print("Ingrese la estatura: ");
            altura = E.nextFloat();

            sumEdad += edad;
            sumaAlt += altura;

            if (edad > 18){
                cantidadMayores++;

            } if (altura > 1.75){
                cantidadAlunEsta++;
            }
        }
        mediaEdad = (float) sumEdad/5;
        mediaAltura = sumaAlt/5;

        System.out.println("\nLa encuesta realizada da como resultado:\n");
        System.out.print("La edad del promedio es: "+mediaEdad + "\n");
        System.out.print("La estatura promedio es: "+mediaAltura+ "\n");
        System.out.print("Total de alumnos mayores a 18 años: "+cantidadMayores+ "\n");
        System.out.print("Total de alumnos con estatura mayor de 1.75: "+cantidadAlunEsta+ "\n");
        System.out.println("-----------------------------------------------------------------------------------------");
    }
}
