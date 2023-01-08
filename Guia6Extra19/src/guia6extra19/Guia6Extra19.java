/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6extra19;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class Guia6Extra19 {

    /**
     * @param args the command line arguments
     * Escriba un programa que averigüe si dos vectores de N enteros son iguales (la
comparación deberá detenerse en cuanto se detecte alguna diferencia entre los
elementos).
     */
    public static void main(String[] args) {
        int aux;
        int [] vector1 = {1,2,3,4,5};
        int [] vector2 = {1,2,3,4,5};
        aux = (int) (Math.random()*2);
        boolean validar;
        
        if (aux == 1){
            vector1[0] = (int) (Math.random()*10);
        }
        
        validar = validaVector(vector1, vector2);
        if (validar) {
            System.out.println("Los vectores son iguales");    
        } else {
            System.out.println("Los vectores NO son iguales");
        }
                
        
    }
    public static boolean validaVector( int vector1[], int vector2[]){
        boolean validar = true;
        if (vector1.length == vector2.length) {
            for (int i = 0; i < vector2.length && validar; i++) {
                validar = vector1 [i] == vector2 [i];
            }
            
        }return validar;
    }
    
}
