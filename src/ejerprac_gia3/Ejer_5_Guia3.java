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
public class Ejer_5_Guia3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Escriba un programa en el cual se ingrese un valor límite positivo, 
        //y a continuación solicite números al usuario hasta que la suma de
        //los números introducidos supere el límite inicial.
        Scanner leer = new Scanner(System.in);
        int suma;
        suma=0;
                
        System.out.println("Ingrese sus numeros");
        

    	do {
        
            int num = leer.nextInt();
    	    	suma = suma + num;

    	} while (suma < 100);
        System.out.println("La suma de los numeros ingresados a superado el valor limite dando como resultado: " + suma);
}

    
}
