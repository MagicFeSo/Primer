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
public class Ejer_7_Guia3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String FDE;
        int longi;
        do{
            System.out.println("Ingrese una secuencia FDE");
            FDE = leer.nextLine();
            longi = FDE.length();
            if (FDE.length()<=5 && FDE.substring(0,1).equals("X") && FDE.substring(longi-1,longi).equals("O")) {
         }
        }while(FDE == "&&&&&");
                    
            
        }
    
    }

