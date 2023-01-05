/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6extra13;
import java.util.Scanner;
/**
 *
 * @author Mario
 */
public class Guia6Extra13 {

    /**
     * @param args the command line arguments
     * Crear un programa que dibuje una escalera de números, donde cada línea de números
comience en uno y termine en el número de la línea. Solicitar la altura de la escalera al
usuario al comenzar. Ejemplo: si se ingresa el número 3:
1
12
123
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int num, cont = 0;
        System.out.println("Por favor, ingrese la cantidad de escalones de la escalera de numeros");
        num = leer.nextInt();
        do {
        for (int i = 0; i < num; i++){
            for(int j = 0; j <= cont; j++){
                System.out.print(j+1);
                
                
            }cont = cont + 1;
            System.out.println("");
            }
        } while (cont < num);
    }
    
}
