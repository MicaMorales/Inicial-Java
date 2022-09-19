
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
 * Escribir un programa que lea un número entero por teclado y muestre por pantalla el
doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt().
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Ingrese un numero");
    Scanner leer;
            leer = new Scanner (System.in);
     int num = leer.nextInt ();
     
     int D = num *2;
     int T = num *3;
     double R = Math.sqrt(num);
     
        System.out.println("El doble de " +num + " es "+ D);
        System.out.println("El triple de " +num + " es "+ T);
        System.out.println("La raiz cuadrada de " + num + " es "+ R);
        
    }
    
}
