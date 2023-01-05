/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6extra5;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Guia6Extra5 {

    /**
     * @param args the command line arguments
     * Una obra social tiene tres clases de socios:
o Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en
todos los tipos de tratamientos.
o Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para
los mismos tratamientos que los socios del tipo A.
o Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos
tratamientos.
o Solicite una letra (carácter) que representa la clase de un socio, y luego un valor
real que represente el costo del tratamiento (previo al descuento) y determine el
importe en efectivo a pagar por dicho socio.
     */
    public static void main(String[] args) {
        String socio;
        double valor;
        Scanner leer = new Scanner (System.in);
        boolean letra;
        do {
            System.out.println("Ingrese clase de socio, A, B o C");
            socio = leer.nextLine();
            socio = socio.toUpperCase();
            letra = "A".equals(socio) || "B".equals(socio) || "C".equals(socio); 
        } while (letra == false);
        
        
        System.out.println("Ingrese el monto a abonar para realizar el descuento");
        valor = leer.nextDouble();
        
        switch (socio){
            case "A":
                System.out.println("Los socios categoria A abonanan un valor de: "+ (valor*0.5));
                break;
            case "B":
                System.out.println("Los socios categoria B abonanan un valor de: "+(valor*0.75));
                break;
            case "C":
                System.out.println("Los socios categoria C abonanan un valor de: "+valor);
                break;
        } 
        
    }
    
}
