/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.salidadecasa;


import javax.swing.JOptionPane;

public class salidadecasa {

    public static void main(String[] args) {

        
    int yo = Integer.parseInt(JOptionPane.showInputDialog("En que estado me encuentro: \n"+
        "1. aseado\n"+
        "2. sucio\n"));
      if (yo==1){
          JOptionPane.showMessageDialog(null, "Me cambio para salir");
      }
      else{
          JOptionPane.showMessageDialog(null, "Me baño y me cambio salir");
          
      }
      JOptionPane.showMessageDialog(null, "Ya estoy vestido para salir");
      
      int resp = JOptionPane.showConfirmDialog(null, "¿Junte lo que tengo que llevar?");
      if(resp==0){
         JOptionPane.showMessageDialog(null, "Salgo de mi casa"); 
    
      }
      else{
          if(resp==1){
              JOptionPane.showMessageDialog(null, "Busco mis cosas");
              JOptionPane.showMessageDialog(null, "Salgo de mi casa"); 
          }else{
             System.exit(0);
          }
      }
    }
}
