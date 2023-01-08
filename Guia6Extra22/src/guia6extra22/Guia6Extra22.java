/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6extra22;
import java.util.Scanner;
/**
 *
 * @author Mario
 */
public class Guia6Extra22 {

    /**
     * @param args the command line arguments
     * Realizar un programa que rellene una matriz de tamaño NxM con valores aleatorios y
muestre la suma de sus elementos.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int columnas, filas;
        
        System.out.println("Indique la cantidad de filas de la matriz");
        filas = leer.nextInt();
        System.out.println("Indique la cantidad de columnas de la matriz");
        columnas = leer.nextInt();
        
        int matriz [][] = new int [filas][columnas];
        llenarAleatorio(matriz);
        sumar(matriz);
    }
    public static void llenarAleatorio(int matriz[][]){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz [i][j] = (int) (Math.random() * 10);
            }
            
        }
    }
    public static void sumar(int matriz [][]){
        int sumar = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                sumar = sumar + matriz [i][j];
                
            }
            
        }System.out.println("La suma de todos los elementos es: "+sumar);
    }
}
