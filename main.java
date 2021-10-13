package com.mycompany.programacionlogicayfuncional;

import java.util.Scanner;

/**
 *
 * @author enoce
 */
public class main {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        programa1 p1 = new programa1();
        programa2 p2 = new programa2();
        programa3 p3 = new programa3();
        int selec = 0;

        do {
            System.out.println("Elige una opción:"
                    + "\n1. Operacion logica"
                    + "\n2. Operacion Aritmetica"
                    + "\n3. Separar String, int y char"
                    + "\n4. Salir");
            selec = leer.nextInt();

            switch (selec) {
                case 1:
                    System.out.println("");
                    p1.programa1();
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("");
                    p2.programa2("( 9 + 19 ) * 2 / 66 ^ 4 - 76");
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("");
                    p3.programa3("A Qg K E 17 *a 123 2 13 $ # @ /xD hghghgh");
                    System.out.println("");
                    break;
                default:
                    System.out.println("");
                    System.out.println("Finalizado..");
                    System.out.println("");
                    break;
            }
        } while (selec<=3);
    }
}
