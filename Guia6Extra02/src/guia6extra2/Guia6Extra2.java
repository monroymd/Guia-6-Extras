/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6extra2;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Guia6Extra2 {

    /**
     * @param args the command line arguments
     * Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada
una. A continuación, realizar las instrucciones necesarias para que: B tome el valor de C, C
tome el valor de A, A tome el valor de D y D tome el valor de B. Mostrar los valores
iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar.
     */
    public static void main(String[] args) {
        int a, b, c, d, auxa, auxb, auxc, auxd;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el valor de la variable A");
        auxa = leer.nextInt();
        System.out.println("Ingrese el valor de la variable B");
        auxb = leer.nextInt();
        System.out.println("Ingrese el valor de la variable C");
        auxc = leer.nextInt();
        System.out.println("Ingrese el valor de la variable D");
        auxd = leer.nextInt();
        a = auxd;
        b = auxc;
        c = auxa;
        d = auxb;
        System.out.println("Ahora los valores son A: "+a+", B: "+b+", C: "+c+" y D: "+d);
        
    }
    
}
