package com.mycompany.promediovotos;

import javax.swing.JOptionPane;


public class promediovotos {

    
    public static void main(String[] args) {
        double porc;
     int part_j = Integer. parseInt (JOptionPane.showInputDialog("INGRESE LA CANTIDAD DE VOTOS DEL PARTIDO JUSTICIALISTA"));
     int part_ucr = Integer. parseInt (JOptionPane.showInputDialog("INGRESE LA CANTIDAD DE VOTOS DEL PARTIDO DE LA UNION CIVICA RADICAL"));
     int part_dc = Integer. parseInt (JOptionPane.showInputDialog("INGRESE LA CANTIDAD DE VOTOS DEL PARTIDO DEMOCRATA CRISTIANO"));
     int part_f = Integer. parseInt (JOptionPane.showInputDialog("INGRESE LA CANTIDAD DE VOTOS DEL PARTIDO FEDERAL"));
     int part_c = Integer. parseInt (JOptionPane.showInputDialog("INGRESE LA CANTIDAD DE VOTOS DEL PARTIDO COMUNISTA"));
     int part_i = Integer. parseInt (JOptionPane.showInputDialog("INGRESE LA CANTIDAD DE VOTOS INDECISOS"));
    
     int total =  part_j + part_ucr + part_dc + part_f + part_c + part_i ;
     porc = (double) (part_j*100)/total;
     JOptionPane.showMessageDialog(null,"EL PORCENTAJE DE VOTOS DEL PARTIDO JUSTICIALISTA ES:" + porc +"%");
     porc = (double) (part_ucr*100)/total;
     JOptionPane.showMessageDialog(null,"EL PORCENTAJE DE VOTOS DEL PARTIDO DE LA UNION CIVICA RADICAL ES:" + porc + "%");
     porc = (double) (part_dc*100)/total;
     JOptionPane.showMessageDialog(null,"EL PORCENTAJE DE VOTOS DEL PARTIDO DEMOCRATA CRISTIANO ES:" + porc + "%");
     porc = (double) (part_f*100)/total;
     JOptionPane.showMessageDialog(null,"EL PORCENTAJE DE VOTOS DEL PARTIDO FEDERAL ES:" + porc + "%");
     porc = (double) (part_c*100)/total;
     JOptionPane.showMessageDialog(null,"EL PORCENTAJE DE VOTOS DEL PARTIDO COMUNISTA ES:" + porc + "%");
     porc = (double) (part_i*100)/total;
     JOptionPane.showMessageDialog(null,"EL PORCENTAJE DE VOTOS INDECISOS ES:" + porc + "%");
    }
    
    
}
