/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
dos. El programa deberá después mostrar el resultado de la suma*/



import java.util.Scanner;

/**
 *
 * @author lola
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int num1;
        int num2 ;
        int suma;
                
        
        System.out.println("Ingrese primer numero");
        Scanner leer;
        leer = new Scanner (System.in);
        num1=leer.nextInt();
      
        System.out.println("Ingrese segundo numero");
      
          num2=leer.nextInt(); 
        
        suma= num1+num2;
        
        System.out.println("el resultado es "+ suma );
                
    }
    
}
