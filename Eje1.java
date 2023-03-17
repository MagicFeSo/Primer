/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eje1;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Eje1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1, num2, suma;
        System.out.println("Ingresar 2 numeros");
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        suma = num1+num2;
        System.out.println("La suma de los numeros es: " + suma);
        
    }
    
}
