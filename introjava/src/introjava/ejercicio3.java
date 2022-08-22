/*Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en Java.
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
public class ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        Scanner sc =new Scanner (System.in);
    
     
        System.out.println("ingrese frase");
        String frase= sc.nextLine();
        //String frase2=sc.nextLine();
        String frase1=frase.toUpperCase();
        String frase2=frase.toLowerCase();
        
        System.out.println(frase1.toUpperCase());
        System.out.println(frase2.toLowerCase());
    }
    
}
