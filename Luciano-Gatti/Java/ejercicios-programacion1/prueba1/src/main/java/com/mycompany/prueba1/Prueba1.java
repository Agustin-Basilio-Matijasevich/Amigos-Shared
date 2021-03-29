/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.prueba1;

import java.util.Scanner;

/**
 *
 * @author lucia
 */
public class Prueba1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
    
        int a, b;
        Scanner num = new Scanner(System.in); 
        
        System.out.println("Ingrese el primer numero: \n");
        a = num.nextInt();
        
        System.out.println("Ingrese el segundo numero: \n");
        b = num.nextInt();
     
       int suma = a + b;
       int resta = a - b;
       double division =  a / b;
       int multiplicación = a * b;
       
       System.out.println("Suma: \n" + suma + "Resta: \n" + resta + "División: \n"
       + division + "Multiplicación: \n" + multiplicación);
    }
    
}
