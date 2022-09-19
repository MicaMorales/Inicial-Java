
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lola
 * 
 * Crear un programa que dado un numero determine si es par o impar.
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Ingrese un numero"); 
        
        Scanner leer = new Scanner (System.in);
        int num = leer.nextInt();
        
 
        
        if (num/2== 0){;
            System.out.println("El numero es par");
            
        }  else  {
            
            System.out.println("El numero es impar");
        }        
        
        
    }
    
}
