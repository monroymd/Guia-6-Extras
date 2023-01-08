/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6extra17;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class Guia6Extra17 {

    /**
     * @param args the command line arguments
     * Crea una aplicación que nos pida un número por teclado y con una función se lo pasamos
por parámetro para que nos indique si es o no un número primo, debe devolver true si es
primo, sino false.
Un número primo es aquel solo puede dividirse entre 1 y si mismo. Por ejemplo: 25 no es
primo, ya que 25 es divisible entre 5, sin embargo, 17 si es primo.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int num;
        boolean verificar = true;
        
        System.out.println("Ingrese un numero para averiguar si es primo");
        num = leer.nextInt();
        
        verificar = primo(num);
        if (verificar) {
            System.out.println("El numero NO es primo");
        } else {
            System.out.println("El numero es primo");
        }
        
    }
    public static boolean primo(int num){
        
        boolean aux = false;
        aux = num % 2 == 0 || num % 3 == 0 || num % 4 == 0 || num % 5 == 0;
        return aux;
    } 
}
