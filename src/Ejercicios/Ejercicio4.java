package Ejercicios;

import javax.swing.*;

/*
Hacer un programa que pida números hasta que se teclee uno negativo, y mostrar cuantos números se han introducido.
 */
public class Ejercicio4 {

    public static void main(String[] args) {

        int numeros, contador = 0;

        JOptionPane.showMessageDialog(null, """
                Bienvenido!\s
                Ingrese solo números positivos
                Cualquier número negativo termina el programa""");

        numeros = Integer.parseInt(JOptionPane.showInputDialog(null,"Por favor ingrese el número"));

        while (numeros >= 0) {
            contador++;
            numeros = Integer.parseInt(JOptionPane.showInputDialog(null, "Por favor ingrese otro número"));
        }
        JOptionPane.showMessageDialog(null,"Números ingresados en total: "+contador);
    }
}
