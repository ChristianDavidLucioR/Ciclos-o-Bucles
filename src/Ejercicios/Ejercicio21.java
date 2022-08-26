package Ejercicios;

import java.util.Scanner;

/*
Pedir 5 calificaciones de alumnos y decir al final si hay algun reprobado
 */
public class Ejercicio21 {

    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);

        float calificaciones;
        boolean reprobado = false;

        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("Bienvenido! Recuerda que debe de estar en el rago de 0 - 10");
        for (int i = 1; i <= 5; i++) {
            do {
                System.out.print("Ingrese la calificacion del alumno "+i+ ": ");
                calificaciones = a.nextInt();
            }while (calificaciones <0 || calificaciones >10);

            if (calificaciones < 7) {
                reprobado = true;
            }
        }
        if (reprobado == true){
            System.out.println("Ahí reprobados en el curso");
        }else {
            System.out.println("No ahí reprobados en el curso");
        }
    }
}
