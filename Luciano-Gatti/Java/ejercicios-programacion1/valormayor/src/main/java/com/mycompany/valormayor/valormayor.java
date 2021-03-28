
package com.mycompany.valormayor;

import java.util.Scanner;

public class valormayor {
     static int mayor,temp;
     static Scanner entrada= new Scanner(System.in);

    public static void main(String[] args) {
     System.out.println("Dame el primer numero: ");
        temp=entrada.nextInt();
        mayor=temp;
        System.out.println("Segundo numero: ");
        entradaComprobada();
        System.out.println("Tercer numero: ");
        entradaComprobada();
        System.out.println("Cuarto numero: ");
        entradaComprobada();
        System.out.println("El mayor es: \n"+ mayor);
            
    }
    static void entradaComprobada () {
        temp=entrada.nextInt();
        if (temp>mayor) mayor=temp;
    }
}
       
