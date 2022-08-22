/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava;

import java.util.Scanner;

public class manosAlaobra9 {
//Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe salir del
//bucle y mostrar el mensaje "Se capturó el numero cero". El programa deberá calcular y mostrar el
//resultado de la suma de los números leídos, pero si el número es negativo no debe sumarse.
//Nota: recordar el uso de la sentencia break
    /**
     * @param args the command line arguments
     */
    //@SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        //Scanner leer = new Scanner(System.in)
        
        int suma;
        int numero;
        suma=0;
        String respuesta;
        Scanner read = new Scanner(System.in);
        
        do{
        System.out.println("ingrese 20 numeros positivos");
          numero = read.nextInt();
         // if (numero!=0 && numero>0){
              //suma=suma+numero;
          //continue;
          if (numero==0){
        System.out.println("se capturo el numero 0");
                    //System.out.println("la suma de los numeros es "+suma+);
 
              System.out.println("es seguro que quiere ingrasar estos numeros");
          respuesta= read.next();
          
              break;
                   } 
          
          while (numero !=0) (respuesta.equals("s")) }
             
            
          
            
     
        
             
            
          
            
             
      
           
       
    
    
    

