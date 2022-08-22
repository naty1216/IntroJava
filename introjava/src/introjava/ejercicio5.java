/*Escribir un programa que lea un número entero por teclado y muestre por pantalla el
doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt().
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava;

import java.util.Scanner;/**
 *
 * @author Ed-Naty
 */
public class ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double num;
        Scanner leer= new Scanner (System.in);
        System.out.println("ingrese un numero entero");
        num=leer.nextDouble();
        double raiz=Math.sqrt(num);
        System.out.println("la raiz cuadrada de "+num+"es "+raiz);
        
        double potencia=Math.pow(num, 2);
        System.out.println("el numero "+num+"elevado a la 2 es " +potencia);
        
        double potencia3= Math.pow(num, 3);
        System.out.println("el numero "+num+"elevado a la 3 es "+potencia3);
        
        
    }
    
}
