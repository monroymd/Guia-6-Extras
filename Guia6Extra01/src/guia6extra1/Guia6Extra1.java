/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6extra1;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Guia6Extra1 {

    /**
     * @param args the command line arguments
     * 
     * Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el
usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.
     */
    public static void main(String[] args) {
        Scanner leer= new Scanner (System.in);
        int minutos, dias, resto, horas;
        System.out.println("Ingrese la cantidad de Minutos a determinar");
        minutos = leer.nextInt();
        dias = minutos / (24*60);
        resto = minutos % (24*60);
        horas = resto / 60;
        System.out.println("Equivale a "+dias+" y "+ horas +" horas");
    }
    
}
