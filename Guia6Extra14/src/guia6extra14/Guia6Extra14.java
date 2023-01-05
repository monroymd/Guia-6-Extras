/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6extra14;
import java.util.Scanner;
/**
 *
 * @author Mario
 */
public class Guia6Extra14 {

    /**
     * @param args the command line arguments
     * Se dispone de un conjunto de N familias, cada una de las cuales tiene una M cantidad de
hijos. Escriba un programa que pida la cantidad de familias y para cada familia la cantidad
de hijos para averiguar la media de edad de los hijos de todas las familias.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int familias, hijos, cont = 1, contfamily;
        int [][] edades;
        System.out.println("Por favor ingrese la cantidad de familias");
        familias = leer.nextInt();
        edades = new int [familias][];
        
        do {     
        System.out.println("Por favor indique la candidad de hijos de la familia "+cont);
        hijos = leer.nextInt();
        edades [cont-1] = new int [hijos];
        cont = cont + 1;
        }  while (cont <= familias);
        
        for (int i = 0; i < familias; i++) {
            for (int j = 0; j < edades [i].length; j++) {
                System.out.println("Ingrese la edad del hijo "+(j+1)+ " de la familia "+(i+1));
                contfamily = leer.nextInt();
                edades [i][j] = contfamily; 
            }
            
        }
        System.out.println("Indicar la familia de la que desea conocer el promedio de edad"); 
        int aux = leer.nextInt();
        int promedio = 0, suma = 0, cont2 = 0;
        for (int i = aux - 1; i < aux; i++) {
            for (int j = 0; j < edades [i].length; j++) {
                suma = suma + edades [i][j];
                promedio = suma / edades [i].length;
            }
            System.out.println("El promedio de edad de la familia " + aux + " es de: " + promedio + " años");
        }
        
        
    }
    
}
