/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6extra24;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class Guia6Extra24 {

    /**
     * @param args the command line arguments
     * Realizar un programa que complete un vector con los N primeros números de la sucesión
de Fibonacci. Recordar que la sucesión de Fibonacci es la sucesión de los siguientes
números:
1, 1, 2, 3, 5, 8, 13, 21, 34, ...
Donde cada uno de los números se calcula sumando los dos anteriores a él. Por ejemplo:
La sucesión del número 2 se calcula sumando (1+1)
Análogamente, la sucesión del número 3 es (1+2),
Y la del 5 es (2+3),
Y así sucesivamente…
La sucesión de Fibonacci se puede formalizar de acuerdo a la siguiente fórmula:
Fibonaccin = Fibonaccin-1 + Fibonaccin-2 para todo n>1
Fibonaccin = 1 para todo n<=1
Por lo tanto, si queremos calcular el término “n” debemos escribir una función que reciba
como parámetro el valor de “n” y que calcule la serie hasta llegar a ese valor
     */
    public static void main(String[] args) {
        int num, resultado = 0;
        int [] fibo; 
        Scanner leer = new Scanner (System.in);
        
        System.out.println("ingrese el numero de la sucesion de Fibonacci que desea averiguar");
        num = leer.nextInt();
        
        fibo = new int [num];
        
        if (num == 1) {
                System.out.println("La primer sucesion de Fibonacci es: 1");
        }
        if (num == 2) {
            System.out.println("La primer sucesion de Fibonacci es: 2");
        }
        if (num > 2) {
            fibo [0] = 1;
            fibo [1] = 2;
            for (int i = 2; i < num; i++) {
                fibo [i] = ((fibo[i-2]) + (fibo [i-1]));
            resultado = fibo[i];
            } 
        }
        System.out.println("La sucesion de Fibonacci "+num+" es igual a: "+resultado);
        
        
    }
    
}
