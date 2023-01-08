/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6extra23;
import java.util.Scanner;
/**
 *
 * @author Mario
 */
public class Guia6Extra23 {

    /**
     * @param args the command line arguments
     * Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, a medida
que el usuario las va ingresando, construya una “sopa de letras para niños” de tamaño de
20 x 20 caracteres. Las palabras se ubicarán todas en orden horizontal en una fila que
será seleccionada de manera aleatoria. Una vez concluida la ubicación de las palabras,
rellene los espacios no utilizados con un número aleatorio del 0 al 9. Finalmente imprima
por pantalla la sopa de letras creada.
Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones
de Java substring(), Length() y Math.random().
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        String aux;
        int cont2 = 0, fila, columna;
        String [][] sopa = new String [20][20];
        llenarMatriz(sopa);
        
        do {
        System.out.println("Ingrese una palabra");
        aux = leer.nextLine();
        aux = aux.toUpperCase();

        int cont = 0;
        if (aux.length()>=3 && aux.length()<=5) {
            fila = (int) (Math.random()*20);
            columna = (int) (Math.random()*15);
            cont2++;
            for (int i = fila; i <= fila; i++) {
            for (int j = columna; j < (columna + aux.length()); j++) {
                sopa [i][j] = aux.substring(cont, cont+1);
                cont++;
                }
                
            }
        }
        } while(cont2 <= 4);
        
        impMatriz(sopa);
    }
    public static void llenarMatriz(String matriz [][]){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                int aux = (int) (Math.random()*10);
                matriz [i][j] = String.valueOf(aux);
            }
            
        }
    }
    public static void impMatriz(String matriz [][]){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz [i][j] + " ");
                
            }System.out.println("");
            
        }
    }
}