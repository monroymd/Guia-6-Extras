/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6extra6;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Guia6Extra6 {

    /**
     * @param args the command line arguments
     * 
     * Leer la altura de N personas y determinar el promedio de estaturas que se encuentran por
debajo de 1.60 mts. y el promedio de estaturas en general.
     */
    public static void main(String[] args) {
        double estatura, promedio = 0;
        int personas, menores = 0;
        //boolean validar;
        Scanner leer = new Scanner (System.in);
        
        System.out.println("Ingrese la cantidad de personas que desea calcular");
        personas = leer.nextInt();
        int personasTotal = personas;
        while (personas >= 1) {
            System.out.println("ingrese la estatura");
            estatura = leer.nextDouble();
            personas--;
            promedio = promedio + estatura;
            if (1.60 >= estatura) {
                menores++;
                
            } 
            
    }
        promedio = promedio / personasTotal;
        System.out.println("la cantidad de personas menores a 1,60 es de: "+menores+" con un promedio total de totas ellas de : "+promedio);
    }
    
}
