/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6extra16;
import java.util.Scanner;
/**
 *
 * @author Mario
 */
public class Guia6Extra16 {

    /**
     * @param args the command line arguments
     * Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de
las personas ingresadas por teclado e indique si son mayores o menores de edad.
Después de cada persona, el programa debe preguntarle al usuario si quiere seguir
mostrando personas y frenar cuando el usuario ingrese la palabra “No”.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        String nombre, respuesta;
        int edad;
        
        do {
            System.out.println("Escriba el nombre de la persona");
            nombre = leer.next();
            System.out.println("Escriba por favor la edad de " + nombre);
            edad = leer.nextInt();
            
            if (edad < 18) {
                System.out.println(nombre + " es menor de edad");
            } else {
                System.out.println(nombre + " es mayor de edad");
            }
            System.out.println("Desea continuar consultando? Si/No");
            respuesta = leer.next();
            respuesta = respuesta.toLowerCase();
                        
        } while (!respuesta.equals("no"));
        System.out.println("Gracias!");
    }
    
}
