package Ejercicios;

import javax.swing.*;

/*
Pedir números al usuario hasta que se intruduzca uno negativo y calcular la media
 */
public class Ejercicio7 {

    public static void main(String[] args) {

        int numero, elementos = 0, suma = 0;
        float media;

        JOptionPane.showMessageDialog(null, """
                Bienvenido!
                Vamos a calcular la media
                de los numeros ingresados""");

        JOptionPane.showMessageDialog(null,"Para terminar ingresa un número negativo");

        numero = Integer.parseInt(JOptionPane.showInputDialog(null,"Por favor ingrese el número"));

        while (numero > 0){
            suma += numero;//SUMAMOS LOS NUMEROS INGRESADOS
            elementos++; //AUMENTA EN 1 LOS NUMEROS INGRESADOS

            numero = Integer.parseInt(JOptionPane.showInputDialog(null,"Por favor ingrese otro número"));
        }
        if (elementos == 0){
            JOptionPane.showMessageDialog(null,"Error!" +
                    "\nLa divición entre 0 no existe");
        }else {
            media = (float) suma / elementos;
            JOptionPane.showMessageDialog(null,"La media es: "+media);
        }
    }
}
