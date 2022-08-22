/*Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota: investigar
la función equals() en Java.
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava;

import java.util.Scanner;

/**
 *
 * @author Ed-Naty
 */
public class ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer=new Scanner(System.in);
       String cadena1;
       String cadena2;
       cadena1= "eureka";
        System.out.println("ingrese frase");
        cadena2=leer.nextLine();
        
        if (cadena1.equals(cadena2))   {
            System.out.println("CORRECTO");
        
        
        }else{
            System.out.println("INCORRECTO");
        
        
        }
        
               
    }
    
}
