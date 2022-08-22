/*Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava;
import java.util.Scanner;
import java.lang.*;
import java.io.*;


public class ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double C, Fahrenheit;
        Scanner leer=new Scanner (System.in);
        System.out.println("ingrese grado centigrados");
        C=leer.nextDouble();
        Fahrenheit =32+(9*C/5);
        System.out.println("el resultado es "+Fahrenheit);
        
    }
    
}
