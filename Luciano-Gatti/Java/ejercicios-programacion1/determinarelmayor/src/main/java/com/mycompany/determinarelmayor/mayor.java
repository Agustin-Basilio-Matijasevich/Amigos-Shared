/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.determinarelmayor;

import java.util.Scanner;

public class mayor {

    public static void main(String[] args) {
       
    float a, b, c;
    Scanner num = new Scanner (System.in);
    System.out.println("Ingrese el primer lado del triangulo: ");
    a = num.nextInt();
     System.out.println("Ingrese el segundo lado del triangulo: ");
    b = num.nextInt();
   System.out.println("Ingrese el tercer lado del triangulo: ");
    c = num.nextInt();
     if(a==b & b==c){
        System.out.println("Es equilatero");}
     else{ 
        if(a==b||b==c||c==a){
        System.out.println("Es isoseles");} 
        else{ 
         System.out.println("Es escaleno");}
}    
}
}