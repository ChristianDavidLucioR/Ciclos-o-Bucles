package Ejercicios;

import javax.swing.*;
/*
Hacer un programa que lea un número e indicar si es positivo o negativo. El proceso se repetira hasta que el usuario introdusca un 0
 */
public class Ejercicio2 {

    public static void main(String[] args) {

        int numero;

        numero = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese un número para validar\n " +
                "Si es positivo o negativo"));

        while (numero != 0){

            if (numero > 0) {
                JOptionPane.showMessageDialog(null,"El número " +numero+ " es positivo");
            }else {
                JOptionPane.showMessageDialog(null,"El número " +numero+ " es negativo");
            }
            numero = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese otro número para validar\n " +
                    "Si es positivo o negativo"));
        }
    }
}
