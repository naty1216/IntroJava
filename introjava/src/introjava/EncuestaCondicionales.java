/*
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
public class EncuestaCondicionales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opinion;
        Scanner leer=new Scanner (System.in);
        System.out.println("Clasifique la peli de 1 a 5 estrellas");
        opinion = leer.nextInt();
         if (opinion >=1 && opinion <= 5){
             switch (opinion){
                 case 1:
                 case 2:
                     System.out.println("Nos sentimos apenados de que no hay disfrutado la peli...");
                     break;
                 case 3:
                     System.out.println("Has calificado la peli como buena");
                     break;
                 case 4:
                     System.out.println("Has calificado la peli como muy buena");
                     break;
                 case 5:
                     System.out.println("Fantastico que hayas disfrutado de un excelente entretenimiento");
                     break;
                     
                     
                     
             }
         }else if (opinion<0){
             System.out.println("una opinion negativa, tan mala fue la pelicula");
             
         }else if (opinion==0){
             System.out.println("el valor" +opinion+"no es valido y no se tomara en cuenta");
             
         }else {
             System.out.println(opinion+"wow! se te fue la mano con la clasificacion!");
             
         }
             System.out.println("Hasta la proxima!");
         }
        
        
    }
    

