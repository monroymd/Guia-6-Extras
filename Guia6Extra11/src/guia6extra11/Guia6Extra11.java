/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6extra11;

import java.util.Scanner;

/**
 *
 * @author Mario
 */
public class Guia6Extra11 {

    /**
     * @param args the command line arguments
     * Escribir un programa que lea un número entero y devuelva el número de dígitos que
componen ese número. Por ejemplo, si introducimos el número 12345, el programa
deberá devolver 5. Calcular la cantidad de dígitos matemáticamente utilizando el operador
de división. Nota: recordar que las variables de tipo entero truncan los números o
resultados.
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        int num, cont = 0;
        double aux, aux2;
        
        System.out.println("Por Favor ingrese un numero");
        num = leer.nextInt();
        aux2 = num;
        do {
            aux = aux2 / 10;
            cont = cont + 1;
            aux2 = aux;
        } while (aux >= 1);
        if (cont > 1) {
        System.out.println("Su numero posee "+ cont + " digitos");
        } else {
            System.out.println("Su numero posee "+ cont + " digito");
        }
    }
    
}
