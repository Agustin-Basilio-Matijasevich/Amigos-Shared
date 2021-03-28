package com.mycompany.ordendecreciente;


import javax.swing.JOptionPane;


public class ordendecreciente {
 

    public static void main(String[] args) {
 
    int a = Integer. parseInt (JOptionPane.showInputDialog("Ingrese el primer número"));
    int b = Integer. parseInt (JOptionPane.showInputDialog("Ingrese el segundo número")); 
    int c = Integer. parseInt (JOptionPane.showInputDialog("Ingrese el tercer número"));
    if(a<b && b<c){
           JOptionPane.showMessageDialog(null,a+","+b+","+c);
    }
    else if(a<c && c<b){
            JOptionPane.showMessageDialog(null,a+","+c+","+b);  
    }
    else if(b<a && a<c){
            JOptionPane.showMessageDialog(null,b+","+a+","+c);
    }  
    else if(b<c && c<a){
            JOptionPane.showMessageDialog(null,b+","+c+","+a);  
    }
    else if(c<a && a<b){ 
            JOptionPane.showMessageDialog(null,c+","+a+","+b);
    }   
    else {
            JOptionPane.showMessageDialog(null,c+","+b+","+a); 
    }
    }
}

