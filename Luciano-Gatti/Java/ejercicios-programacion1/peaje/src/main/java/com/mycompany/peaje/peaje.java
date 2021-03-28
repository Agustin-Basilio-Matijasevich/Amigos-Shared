
package com.mycompany.peaje;

import javax.swing.JOptionPane;


public class peaje {

   
    public static void main(String[] args) {
    double km;
    
    km = Double.parseDouble (JOptionPane.showInputDialog("INDIQUE LA DISTANCIA A RECORRER"));
    
    if(km<0){
     JOptionPane.showMessageDialog(null,"NO SE OPERA CON VALORES NEGATIVOS");
    }
    else if (km > 0 && km <= 10){
        JOptionPane.showMessageDialog(null,"EL PRECIO A PAGAR ES 2.00");
    }
    else if(km > 10 && km <= 20){
        JOptionPane.showMessageDialog(null,"EL PRECIO A PAGAR ES 3.00");
    }
    else if(km > 20 && km <= 40){
        JOptionPane.showMessageDialog(null,"EL PRECIO A PAGAR ES 3.00");
    }
    else if (km > 40 && km <=80){
        JOptionPane.showMessageDialog(null,"EL PRECIO A PAGAR ES 4.00");
    }
    else{
        JOptionPane.showMessageDialog(null,"DIGITE UNA DISTANCIA VALIDA");
        
    }
}
}
