/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6extra21;
import java.util.Scanner;

/**
 *
 * @author Mario
 */
public class Guia6Extra21 {

    /**
     * @param args the command line arguments
     * Los profesores del curso de programación de Egg necesitan llevar un registro de las notas
adquiridas por sus 10 alumnos para luego obtener una cantidad de aprobados y
desaprobados. Durante el periodo de cursado cada alumno obtiene 4 notas, 2 por trabajos
prácticos evaluativos y 2 por parciales. Las ponderaciones de cada nota son:
Primer trabajo práctico evaluativo 10%
Segundo trabajo práctico evaluativo 15%
Primer Integrador 25%
Segundo integrador 50%
Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo. Al final del
programa los profesores necesitan obtener por pantalla la cantidad de aprobados y
desaprobados, teniendo en cuenta que solo aprueban los alumnos con promedio mayor o
igual al 7 de sus notas del curso.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        String [] nombres = new String [10];
        double [][] notas = new double [10][5];
        /*nombres [0] = "A1";
        nombres [1] = "A2";
        nombres [2] = "A3";
        nombres [3] = "A4";
        nombres [4] = "A5";
        nombres [5] = "A6";
        nombres [6] = "A7";
        nombres [7] = "A8";
        nombres [8] = "A9";
        nombres [9] = "A10";
*/
        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese el nombre del alumno "+(i+1));
            nombres [i] = leer.next();
            for (int j = 0; j < 4; j++) {
                //System.out.println("ingrese las notas");
                //notas [i][j] = leer.nextInt();
                switch (j){
                    case 0:
                        System.out.println("Nota del primer TP");
                        notas [i][j] = leer.nextInt();
                        break;
                    case 1:
                        System.out.println("Nota del segundo TP");
                        notas [i][j] = leer.nextInt();
                        break;
                    case 2:
                        System.out.println("Nota del Primer Integrador");
                        notas [i][j] = leer.nextInt();
                        break;
                    case 3:
                        System.out.println("Nota del Segundo Integrador");
                        notas [i][j] = leer.nextInt();
                        break;
                }
                //notas [i][j] = (int) (Math.random() * 10 + 1);
            }notas [i][4] = (notas [i][0] * 0.1)+(notas [i][1] * 0.15)+(notas [i][2] * 0.25)+(notas [i][3] * 0.5);
        }
        
        System.out.println("Alumnos aprobados");
        for (int i = 0; i < 10; i++) {
            if (notas [i][4] >= 7) {
                    System.out.println(nombres[i]);
                }
        }
        
    }
    
}
