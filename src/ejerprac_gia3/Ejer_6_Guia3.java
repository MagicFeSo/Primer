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
public class Ejer_6_Guia3 {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos numeros enteros");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        int res = num1 - num2;
        boolean bandera = false;
        //String respuesta = "S";
        do {
        System.out.println("Ingrese una de las siguientes opciones");
        System.out.println("1 Sumar"); 
        System.out.println("2 Restar");
        System.out.println("3 Multiplicar"); 
        System.out.println("4 Dividir"); 
        System.out.println("5 Salir");
        
    	int opcion = leer.nextInt();
        //if (opcion >= 1 && opcion <=4){
    	switch (opcion) {
        	case 1:
           System.out.println("La suma es: " + num1+num2);
           break;

        	case 2:
           System.out.println("La resta es: " + res);
            break;

                case 3:
           System.out.println("La multipliccacion es: " + num1*num2);
            break;
            
                case 4:
           System.out.println("La division es: " + num1/num2);
           break;
           
           
                case 5:
                     
           System.out.println("¿Está seguro que desea salir del programa (S/N)?");
           String respuesta = leer.next();
                    if (respuesta.equals("S")); {
                    bandera=true;
                    
                }
                    break;
                default: System.out.println("Opcion incorrecta");
                    
                    
        }while (bandera==false);
            System.out.println("Saliendo del menu");
         
         
         
        }
    }
}



                         
                
        
        
   

                    
        
        
    
    



