/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6extra8;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class Guia6Extra8 {

    /**
     * @param args the command line arguments
     * Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe
detener la lectura y mostrar la cantidad de números leídos, la cantidad de números pares y
la cantidad de números impares. Al igual que en el ejercicio anterior los números
negativos no deben sumarse. Nota: recordar el uso de la sentencia break.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int numeros, suma = 0, pares = 0, impares = 0;
        boolean verificar = true;
        
        while (verificar) {
        
        System.out.println("Por favor ingresar los valores a sumar");
        numeros = leer.nextInt();
        if (numeros % 5 == 0) {
            break;
        }
        if (numeros >= 0) {
            suma = suma + 1;
            if ((numeros % 2) == 0){
            pares = pares + 1;
        } else {
            impares = impares+ 1;
        }
        }
        
        
        }
        System.out.println("La cantidad de numeros impares ingresados fue: "+impares);
        System.out.println("La cantidad de numeros pares ingresada fue: "+pares);
        System.out.println("se obtuvo un total de: "+suma+" numeros leidos");
    }   
    
}
