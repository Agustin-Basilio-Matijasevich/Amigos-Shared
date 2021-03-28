
package com.mycompany.promedionotas;

import javax.swing.JOptionPane;


public class promedionotas {

    public static void main(String[] args) {
   String nota1 = JOptionPane.showInputDialog("INGRESE LA NOTA DEL PRIMER EXAMEN ");
   String nota2 = JOptionPane.showInputDialog("INGRESE LA NOTA DEL SEGUNDO EXAMEN");
   String nota3 = JOptionPane.showInputDialog("INGRESE LA NOTA COCEPTUAL");
   
   double nota_final = (Double.parseDouble(nota1)/10)*3 + (Double.parseDouble(nota2)/10)*5 + (Double.parseDouble(nota3)/10)*2;
    JOptionPane.showMessageDialog(null,"LA NOTA FINAL ES: "+nota_final);
    }
    
}
