/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6extra18;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class Guia6Extra18 {

    /**
     * @param args the command line arguments
     * Realizar un algoritmo que calcule la suma de todos los elementos de un vector de tamaño
N, con los valores ingresados por el usuario.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int [] vector;
        int num, cont = 0, suma;
        
        System.out.println("cuantos numeros desea ingresar?");
        num = leer.nextInt();
        vector = new int [num];
        do {
            System.out.println("Ingrese un numero");
            int aux = leer.nextInt();
            vector [cont] = aux;
            cont = cont + 1;
        } while (cont<num);
        
        System.out.println("La suma de los numeros ingresados es: " + sumarvector(vector));
    }
    public static int sumarvector( int vector[]){
        int suma = 0;
        for (int i = 0; i < vector.length ; i++) {
            suma = suma + vector[i];
        }
         return suma;
    }
}
