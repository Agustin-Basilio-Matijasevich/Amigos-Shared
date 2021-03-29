
package com.mycompany.pasaje;

import javax.swing.JOptionPane;


public class pasaje {

    
    public static void main(String[] args) {
    
    String pasaje = (JOptionPane.showInputDialog(null,"SELECCIONA EL DESTINO\n"+
    "0. SANTA FE\n"+
    "1. CORDOBA\n"+
    "2. BUENOS AIRE\n"+
    "3. LA PAMPA\n"+
    "4. RIO NEGRO\n"+
    "5. CHUBUT\n"+
    "6. SANTA CRUZ\n"+
    "7. TIERRA DEL FUEGO\n")); 
    
    double porc = ((2.0/10)*1.5)*Double.parseDouble(pasaje);
    double precio = 2.0 + porc;
    
    JOptionPane.showMessageDialog(null,"EL VALOR A PAGAR ES: \n"+"$"+
    precio);
    }
    }
    

