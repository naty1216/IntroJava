/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava;

import java.util.Scanner;/**
 *
 * @author Ed-Naty
 */
public class ManosAlaobra6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("ingrese primer numero");
        int num1= leer.nextInt();
        System.out.println("ingrese segundo numero");
        int num2=leer.nextInt();
        
        System.out.println("alguno de los numero es mayor a 25?");
        if (num1>25)
            System.out.println("el primer es mayor a 25");
        else 
            System.out.println("el primer numero es menor a 25");
        if (num2>25)
            System.out.println("el segundo numero es mayor a 25");
        else
            System.out.println("el segundo numero es menor a 25");
                
    }
    
}
