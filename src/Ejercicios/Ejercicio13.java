package Ejercicios;

import java.util.Scanner;

/*
Pedir 10 números. Mostrar la media de los números positivos, la media de los numeros negativos y la cantidad de ceros.
 */
public class Ejercicio13 {

    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);

        int numeros, sum_pos = 0, sum_neg = 0, total_pos = 0, total_neg = 0, total_ceros = 0;
        float mediaPos, mediaNeg;

        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println("                            ¡Bienvenido!" +
                "\nCalculemos la media de los números");

        for (int i = 1; i <= 5; i++){
            System.out.print("Ingresa el número: ");
            numeros = a.nextInt();

            if (numeros == 0){
                total_ceros++;

            } else if (numeros > 0) {
                sum_pos += numeros;
                total_pos++;

            } else {
                sum_neg += numeros;
                total_neg++;
            }
        }
        if (total_pos == 0){
            System.out.println("No hay media para los números positivos");
        }else {
            mediaPos = (float) sum_pos /total_pos;
            System.out.println("La media de los números positivos es: "+mediaPos);
        }
        if (total_neg == 0){
            System.out.println("No hay media para los números negativos");
        }else {
            mediaNeg = (float) sum_neg / total_neg;
            System.out.println("La media de los números negativos es: "+mediaNeg);
        }
        System.out.println("La cantidad de ceros es: "+total_ceros);
        System.out.println("------------------------------------------------------------------------------------------");
    }
}
