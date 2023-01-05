/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6extra7;

import java.util.Scanner;
        
/**
 *
 * @author user
 */
public class Guia6Extra7 {

    /**
     * @param args the command line arguments
     * Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el promedio
de n números (n>0). El valor de n se solicitará al principio del programa y los números
serán introducidos por el usuario. Realice dos versiones del programa, una usando el
bucle “while” y otra con el bucle “do - while”.
     */
    public static void main(String[] args) {
        
        
        //ciclo con While
/*
        Scanner leer = new Scanner (System.in);
        int numero, num2, mayor = 0, menor = 0, suma = 0;
        double promedio;
        
        
        System.out.println("Por favor ingrese la cantidad de numeros a ingresar");
        numero = leer.nextInt();
        int aux = numero;
        System.out.println("Ingrese un valor, le quedan "+numero+ " por ingresar");
            num2 = leer.nextInt();
            menor = num2;
            mayor = num2;
            suma = suma + num2;
        while (numero > 1){
            numero = numero - 1;
            if (numero != 1) {
                System.out.println("Ingrese un valor, le quedan "+numero+ " por ingresar");
            } else if (numero == 1) {
                System.out.println("Ingrese un valor, es el ultimo numero por ingresar");
            }
            
            num2 = leer.nextInt();
            suma = suma + num2;
            if (num2 < menor) {
               menor = num2; 
            } 
            if (num2 > mayor) {
                mayor = num2;
            }
        }
            promedio = suma / aux;
            System.out.println("El numero mayor es: "+mayor+" el numero menor ingresado es : "+menor);
            System.out.println("El numero promedio obtenido es: "+promedio+" de un total de "+aux+" ingresados");
            */
            
// metodo con Do-while 

        Scanner leer = new Scanner (System.in);
        int numero, num2, mayor = 0, menor, suma = 0;
        double promedio;
        
            System.out.println("Por favor ingrese la cantidad de numeros a ingresar");
            numero = leer.nextInt();
            int aux = numero;
        do {
            if (numero != 1) {
                System.out.println("Ingrese un valor, le quedan "+numero+ " por ingresar");
            } else if (numero == 1) {
                System.out.println("Ingrese un valor, es el ultimo numero por ingresar");
            }
            num2 = leer.nextInt();
            menor = num2;
            suma = suma + num2;
            numero = numero -1;
            if (num2 < menor) {
               menor = num2; 
            } 
            if (num2 > mayor) {
                mayor = num2;
            }
        } while (numero > 0);
        promedio = suma / aux;
            System.out.println("El numero mayor es: "+mayor+" el numero menor ingresado es : "+menor);
            System.out.println("El numero promedio obtenido es: "+promedio+" de un total de "+aux+" ingresados");
            
            
            
            }
        

                
}
