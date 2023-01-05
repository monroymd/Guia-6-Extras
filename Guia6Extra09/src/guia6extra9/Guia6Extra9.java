/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6extra9;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Guia6Extra9 {
    /**
     * @param args the command line arguments
     * Simular la división usando solamente restas. Dados dos números enteros mayores que
uno, realizar un algoritmo que calcule el cociente y el residuo usando sólo restas. Método:
Restar el dividendo del divisor hasta obtener un resultado menor que el divisor, este
resultado es el residuo, y el número de restas realizadas es el cociente.
     */
    public static void main(String[] args) {
        int num1, num2, aux, cociente = 0, resto = 0, aumentar = 0;
        Scanner leer = new Scanner (System.in);
        boolean verificar = true;
        do {
        System.out.println("Indique el valor a dividir");
        num1 = leer.nextInt();
        
        System.out.println("Indique por favor el numero por el que lo quiere dividir");
        num2 = leer.nextInt();
            if (num1 < num2) {
                System.out.println("El numero a dividir debe ser mayor");
                }
        } while (num1 < num2);
        
        do {
            aux = num1 - num2;
            cociente = cociente + 1;
            aumentar = aumentar + 1;
            num1 = aux;
            if (num1 < num2) {
                resto = aux;
                verificar = false;
            } else if (num1 > num2) {
                verificar = true;
            }
        } while (verificar);   
        
        if (resto == 0) {
            System.out.println("El resultado de la division es: "+aumentar);
        } else {
            System.out.println("El resultado de la division es: "+aumentar+" con un resto de "+resto);
        }
            
        
        
        
    }
    
}
