/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6extra20;
import java.util.Scanner;
/**
 *
 * @author Mario
 */
public class Guia6Extra20 {

    /**
     * @param args the command line arguments
     * Crear una función rellene un vector con números aleatorios, pasándole un arreglo por
parámetro. Después haremos otra función o procedimiento que imprima el vector.
     */
    public static void main(String[] args) {
        int [] vector;
        
        System.out.println("Por favor ingrese la cantidad de numeros del vector");
        Scanner leer = new Scanner (System.in);
        int num = leer.nextInt();
        vector = new int [num];
        rellenar (vector);
        imprimir(vector);
    }
    public static int [] rellenar(int vector[]){
        for (int i = 0; i < vector.length; i++) {
            vector [i] = (int) (Math.random()*10);
            
        } 
        return vector;
    }
    
    public static void imprimir(int vector[]){
        for (int i = 0; i < vector.length; i++) {
            if (i < (vector.length - 1)){
            System.out.print(vector[i] + ", ");
            } else {
                System.out.println(vector[i]);
            }
        }
        
    }
}
