package Ejercicios;

import java.util.Scanner;

public class Ejercicio18 {

    public static void main(String[] args) {

        Scanner Notas = new Scanner(System.in);

        float nota;
        int aprobados = 0, reprobados = 0, habilitacion= 0;

        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println("""
                Bienvendio!\s
                Al momento de ingresar la nota, Debe de estar entre los rangos '0 - 10' Gracias
                """);

        for (int i= 1 ; i <= 5; i++) {

            do {
                System.out.print("Digite la nota del alumno "+i+ ": ");
                nota = Notas.nextFloat();

            }while (nota<0 || nota > 10);

            if (nota >= 3.9 && nota <=6){
                habilitacion++;
            }
            else if (nota >= 7){
                aprobados++;
            }
            else {
                reprobados++;
            }
        }
        System.out.println("La Cantidad de estudiantes aprobados son: "+aprobados);
        System.out.println("La Cantidad de estudiantes en habilitación son: "+habilitacion);
        System.out.println("La Cantida de estudiantes reprobados son: "+reprobados);
        System.out.println("------------------------------------------------------------------------------------------");
    }
}
