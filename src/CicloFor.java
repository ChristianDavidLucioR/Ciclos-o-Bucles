import java.util.Scanner;

public class CicloFor {
/*
Ciclo for

    for (inicializacion; condicion; aumento o decremento){
        Instruccion;
}
 */
    public static void main(String[] args) {

        Scanner para = new Scanner(System.in);

        int contador3;

        System.out.print("Ingrese la cantidad de números para imprimir: ");
        contador3 = para.nextInt();

        for (int i = 0; i <= contador3; i += 2){
            System.out.print(i+" - ");
        }

    }
}
