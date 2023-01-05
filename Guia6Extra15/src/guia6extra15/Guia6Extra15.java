/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6extra15;
import java.util.Scanner;
/**
 *
 * @author Mario
 */
public class Guia6Extra15 {

    /**
     * @param args the command line arguments
     * Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar,
restar, multiplicar y dividir. La aplicación debe tener una función para cada operación
matemática y deben devolver sus resultados para imprimirlos en el main.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int num1, num2;
        float resultado;
        String respuesta;
        
        System.out.println("Indique el primer numero");
        num1 = leer.nextInt();
        System.out.println("Indique el segundo numero");
        num2 = leer.nextInt();
        System.out.println("Indique la operacion que desea reaizar solo con el signo");
        respuesta = leer.next();
        resultado = operacion(num1, num2, respuesta);
        System.out.println(resultado);
    }
    
    public static float operacion (int num1, int num2, String respuesta) {
        float aux = 0;
        switch (respuesta){
            case "+":
                aux = num1 + num2;
                break;
            case "-":
                aux = num1 + num2;
                break;
            case "*":
                aux = num1 * num2;
                break;
            case "/":
                aux = num1 / num2;
                break;
        } return aux;
    }
}
