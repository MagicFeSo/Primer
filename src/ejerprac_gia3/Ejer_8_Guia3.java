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
public class Ejer_8_Guia3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int n = leer.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i==0 || j==0 || i==n-1 || j==n-1){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
                
            }
            
           System.out.println(" "); 
        }
        
    }
    
}
