/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerprac_gia3;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejer_1_Guia3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Crear un programa que dado un número determine si es par o impar.
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int num = leer.nextInt();
        if ( num%2 != 0) {
        System.out.println("Su numero es impar");
        }else {
            System.out.println("Su numero es par");
        }
        
    }
    
}
