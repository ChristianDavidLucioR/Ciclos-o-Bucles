package Ejercicios;

import javax.swing.*;

/*
Realizar un programa que lea números hasta que se instrodusca el 0.
Para cada uno indicar si es par o impar
 */
public class Ejercicio3 {

    public static void main(String[] args) {

        int numero;

        numero = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa un número para validar " +
                "\nSi es Par o Impar"));

        while (numero != 0) {

            if (numero %2 == 0) {
                JOptionPane.showMessageDialog(null,"El número " +numero+ " es Par");
            }
            else {
                JOptionPane.showMessageDialog(null,"El número " +numero+ " es Impar");
            }
            numero = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa un número para validar " +
                    "\nSi es Par o Impar"));
        }
    }
}
