/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6extra10;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class Guia6Extra10 {

    /**
     * @param args the command line arguments
     * 
     * Realice un programa para que el usuario adivine el resultado de una multiplicación entre
dos números generados aleatoriamente entre 0 y 10. El programa debe indicar al usuario
si su respuesta es o no correcta. En caso que la respuesta sea incorrecta se debe permitir
al usuario ingresar su respuesta nuevamente. Para realizar este ejercicio investigue como
utilizar la función Math.random() de Java
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        int num1, num2, resultado, respuesta;
        String opcion;
        boolean validar = true, correcto = true;
        
        
        do {
            num1 = (int) (Math.random()*11);
            num2 = (int) (Math.random()*10);
            resultado = num1 * num2;
            do {
            System.out.println("Por favor ingrese el resultado de la siguiente multiplicacion: "+num1+" * "+num2);
            respuesta = leer.nextInt();
            } while (respuesta != resultado);
            if (respuesta == resultado) {
                System.out.println("Felicitaciones!!!");
                System.out.println("Quiere seguir participando? S/N");
                opcion = leer.next();
                opcion = opcion.toUpperCase();
                switch (opcion){
                    case "N":
                        System.out.println("Muchas Gracias!!");
                        correcto = false;
                        break;
                    case "S":
                        correcto = true;
                        break;
                    default:
                        System.out.println("Quiere seguir participando? S/N");
                        opcion = leer.nextLine();
                }
                }
            } while (correcto);
            
        
        
        
        
    }
    
}
