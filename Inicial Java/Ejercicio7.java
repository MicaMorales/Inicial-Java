
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
 * Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota: investigar
la función equals() en Java.
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        System.out.println("Ingrese una Frase");
        Scanner leer = new Scanner( System.in);
        String frase = leer.nextLine();
       
        
     if (frase.equals("eureka")){
     
        System.out.println("Clave Correcta");
        
      
     } else  {
       
        System.out.println("Clave Incorrecta");
        
      // rever por que imprime ambos msj cuando es correcto la clave  
    }
    
        
    
    
        
    
    }
    
}
