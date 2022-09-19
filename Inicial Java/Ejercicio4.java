

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lola
 * Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        System.out.println("Ingrese temperatura en grados");
        Scanner leer;
        leer= new Scanner (System.in);
        int grados = leer.nextInt();
        
        int F = 32+(9*grados/5);    
        
        System.out.println("La temperatura en grados Fahrenheit es " + F);
        
        
    }
    
}
