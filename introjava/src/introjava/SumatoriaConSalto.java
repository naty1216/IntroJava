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
public class SumatoriaConSalto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num;
        Scanner leer = new Scanner (System.in);
        
        do {
            System.out.println("Ingrese un numero entro positivo");
            num= leer.nextInt();
            if (num>1000){
                System.out.println("Este programa podria tardar, estas seguro? (s/n)");
                String confirma = leer.next();
                if (confirma.equals("s")){
                    break;
                    
                }
                
            } 
        } while (num<=0||num>100);
        
        int j , suma;
        for(int i=1; i<=num ; i++){
            if (i%2 != 0);
            
            continue;
            
            
         suma = 0;
 
            j=1;
            while(j<=i){
                j++;
                
                        
            }
            System.out.println("la suma de los"+i+"numero naturales es:"+suma);
            
            
            
        }
        
        // TODO code application logic here
    }
    
}
