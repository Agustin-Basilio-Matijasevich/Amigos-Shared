
package com.mycompany.seccionconductor;

import javax.swing.JOptionPane;


public class seccionconductor {

    
    public static void main(String[] args) {
    double I, C, S;
        I = Double.parseDouble (JOptionPane.showInputDialog("INDIQUE LA CORRIENTE ELECTRICA DEL MATERIAL "));
        C = Double.parseDouble (JOptionPane.showInputDialog("INDIQUE LA CONDUCTIBILIDAD DEL MATERIAL"));
        S = I / C;
        S = S + (S/10.0)*2.5;
    JOptionPane.showMessageDialog(null,"LA SECCION DEL MATERIAL ES: " + S);
    
    }
    
}
