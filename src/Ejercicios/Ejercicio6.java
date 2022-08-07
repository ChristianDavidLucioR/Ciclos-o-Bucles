package Ejercicios;

import javax.swing.*;

/*
Hacer un programa donde le pida al usuario números hasta que se teclee el 0, mostrar la suma de todos los
números introducidos.
 */
public class Ejercicio6 {

    public static void main(String[] args) {

        int numeros,suma = 0;

        JOptionPane.showMessageDialog(null, """
                Bienvenido!
                Vamos a comenzar con la suma de los números
                Cuando quieras terminar preciona el numero 0""");
        do {
            numeros = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa el numero"));

            suma += numeros;
        }while (numeros != 0);
        JOptionPane.showMessageDialog(null,"La suma de los números es: "+suma);
    }
}