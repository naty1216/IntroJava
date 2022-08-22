//Crear un programa que dado un numero determine si es par o impar./*

package introjava;

import java.util.Scanner;/**
 *
 * @author Ed-Naty
 */
public class ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num;
        Scanner leer=new Scanner(System.in);
        System.out.println("ingrese numero");
         num =leer.nextInt();
         if (num%2==0){
             System.out.println("el numero "+num+" es par");
            
             
             
             
         
         
         
         }else {
             System.out.println("el numero "+num+" es impar");}
    }
    
}
