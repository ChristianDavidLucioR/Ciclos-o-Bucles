package Ejercicios;

import javax.swing.*;

/*
Leer un número y mostrar su cuadrado, repetir el proceso hasta que se intruduzca un número negativo
 */
public class Ejercicio1 {

    public static void main(String[] args) {

        int numero, cuadrado;

        numero = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese un número: "));

        while (numero >= 0){
            cuadrado = (int) Math.pow(numero,2);

            JOptionPane.showMessageDialog(null,"El número es: "+numero+ " elevado al cuadrado es: "+cuadrado);

            numero = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese otro número: "));

        }
    }
}
