/*Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eje4;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Eje4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        float Cell, Far;
        System.out.print("Ingrese los grados centigrados: ");
        Cell = leer.nextFloat();
        Far = 32 + (9 * Cell / 5);
        System.out.print("La temperatura en grados Fahrenheit es de: " + Far + "°F");
        
    }
    
}
