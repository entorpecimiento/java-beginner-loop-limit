package com.mycompany.ejerciciorepetitivas;

import java.util.Scanner;

/**
 *
 * @author entorpecimiento
 */
public class ComMycompanyEjercicioRepetitivas {

    public static void main(String[] args) {
        System.out.println("Ingrese el límite hasta el que quiere contar:");
        Scanner teclado = new Scanner(System.in);
        int limite = teclado.nextInt();
        int cont = 1;

        while (cont <= limite) {
            System.out.println (cont);
            cont = cont + 1;
        }

    }
}
