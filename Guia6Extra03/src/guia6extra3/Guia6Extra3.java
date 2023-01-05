/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6extra3;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Guia6Extra3 {

    /**
     * @param args the command line arguments
     * Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal.
Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase String.
     */
    public static void main(String[] args) {
        String letra;
        Scanner leer = new Scanner (System.in);
        do {
            System.out.println("Ingrese una letra");
            letra = leer.nextLine();
            } while(letra.length() != 1);
        letra = letra.toLowerCase();
        if (letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u") ) {
            System.out.println("La letra es una vocal");
        } else {
                System.out.println("La letra NO es una vocal");
        }
    }
    
}
