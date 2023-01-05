/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6extra4;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Guia6Extra4 {

    /**
     * @param args the command line arguments
     * Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su
equivalente en romano.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int numero;
        do {
            System.out.println("Ingrese un numero entre 1 y 10");
            numero = leer.nextInt();
        } while (numero <= 0 || numero > 10);
        
    switch (numero){
        case 1:
            System.out.println("En numero Romanos se expresa como I");
            break;
        case 2:
            System.out.println("En numero Romanos se expresa como II");
            break;
        case 3:
            System.out.println("En numero Romanos se expresa como III");
            break;
        case 4:
            System.out.println("En numero Romanos se expresa como IV");
            break;
        case 5:
            System.out.println("En numero Romanos se expresa como V");
            break;
        case 6:
            System.out.println("En numero Romanos se expresa como VI");
            break;
        case 7:
            System.out.println("En numero Romanos se expresa como VII");
            break;
        case 8:
            System.out.println("En numero Romanos se expresa como VIII");
            break;
        case 9:
            System.out.println("En numero Romanos se expresa como IX");
            break;
        case 10:
            System.out.println("En numero Romanos se expresa como X");
            break;
    }
    }    
}
