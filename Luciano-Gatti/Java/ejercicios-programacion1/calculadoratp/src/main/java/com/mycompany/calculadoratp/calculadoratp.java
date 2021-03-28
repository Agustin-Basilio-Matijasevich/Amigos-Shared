package com.mycompany.calculadoratp;
import java.util.Scanner;


public class calculadoratp {

public static void main(String[] args) {
int op, A, B, C, D, a, c, n;
double suma, resta, multi, divi, poten, raiz, x;
Scanner num = new Scanner(System.in); 
    
System.out.println("Que operación desea realizar: \n"+
    "1. (10*4+5)/2 \n"+ 
    "2. (√[(A+B)]*C-D)/[a*(c-a)]^n \n");
op = num.nextInt();

if(op==1){
multi = 10*4; 
System.out.println("10*4= "+multi);
suma = multi + 5;
System.out.println(multi+"+5= "+suma);
divi= suma / 2;
System.out.println(suma+"/2= "+divi);}
else{
    System.out.println("Ingrese el valor de A: \n");
    A = num.nextInt();
    System.out.println("Ingrese el valor de B: \n");
    B = num.nextInt();
    System.out.println("Ingrese el valor de C: \n");
    C = num.nextInt();
    System.out.println("Ingrese el valor de D: \n");
    D = num.nextInt();
    System.out.println("Ingrese el valor de a: \n");
    a = num.nextInt();
    System.out.println("Ingrese el valor de c: \n");
    c = num.nextInt();

suma = A + B;
System.out.println("A + B = "+suma+"\n");
raiz = Math.pow(suma, 1.0/2.0);
System.out.println("√[(A+B)]= "+raiz+"\n");
multi= raiz * C;
System.out.println(" √[(A+B)] * C = "+multi+"\n");
resta = multi-D;
System.out.println("√[(A+B)]*C - D = "+resta+"\n");
x = resta;
resta = c - a;
System.out.println( "c - a = "+resta+"\n");
multi= a * resta;
System.out.println("a * (c-a) = "+multi+"\n");
n = 2;
poten = Math.pow(multi,n);
System.out.println("[a*(c-a)]^2 = "+poten+"\n");
divi= x / poten;
System.out.println("√[(A+B)]*C-D) / [a*(c-a)]^n = "+divi+"\n");
}
}
} 
