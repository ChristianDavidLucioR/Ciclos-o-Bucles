package Ejercicios;

import javax.swing.*;

/*
Realizar un juego para adivinar un número. Para ello generar un número aleatorio entre 0-100,
y luego ir pidiendo números indicando "es mayor" o "es menor" segun sea mayor o menor con respecto a N.
El proceso termina cuando el usuario acierta y mostrar el número de intentos.
 */
public class Ejercicio5 {

    public static void main(String[] args) {

        int numero, aleatorio, contador = 0;

        aleatorio = (int) (Math.random()*100);

        JOptionPane.showMessageDialog(null,"Bienvenido!" +
                "\nAdivina el número");
        do {
            numero = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese un número: "));

            if (aleatorio > numero){
                System.out.println("Ingresa un número mayor");

            }else if (aleatorio < numero){
                System.out.println("Ingresa un número menor");
            }
            contador++;

        }while (numero != aleatorio);
            JOptionPane.showMessageDialog(null,"Felicitaciones!!! Adivinaste el número\n" +
                    "Número de intentos: "+contador);
    }
}
