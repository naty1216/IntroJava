/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava;

import java.util.Scanner;
 
public class manosAlaObra8 {
//Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10 la nota se
//pedirá de nuevo hasta que la nota sea correcta.
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nota;
       Scanner leer=new Scanner(System.in);
       //do {
           System.out.println("ingrese nota del 0 al 10");
           
        
           nota= leer.nextInt();
           
           while (nota>=0 || nota<10){
           
           System.out.println("la nota" +nota+"es correcta");
           break;
           
           
           if (nota>10){
               System.out.println("vuelva a ingresa nota");
               
               break;
               }
               
     }      
        
    
    

