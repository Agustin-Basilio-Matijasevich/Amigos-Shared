
package com.mycompany.merienda;

import javax.swing.JOptionPane;


public class merienda {

    
    public static void main(String[] args) {
    
String merienda = (JOptionPane.showInputDialog(null,"Selecciona lo que deseas merendar","Meriendas",
        JOptionPane.PLAIN_MESSAGE,null,new Object[]{"cafe","cafe con leche","te","te con leche"}
        ,"Selecciona")).toString();
String azucar = (JOptionPane.showInputDialog(null,"Selecciona cuanta azucar poner","Meriendas",
        JOptionPane.PLAIN_MESSAGE,null,new Object[]{"una cucharada","dos cucharadas","tres cucharadas"}
        ,"Selecciona")).toString();

JOptionPane.showMessageDialog(null,"Tu merienda es un "+merienda+", con "+azucar+"  de azucar", "Meriendas", JOptionPane.PLAIN_MESSAGE);


    }
    
}
