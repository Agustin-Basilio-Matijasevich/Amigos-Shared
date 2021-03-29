
package com.mycompany.edadpersona2;
import javax.swing.JOptionPane;


public class edadpersona2 {
  
   
    public static void main(String[] args) {
    int dia_nac, mes_nac, año_nac, dia_act, mes_act, año_act, edad, mes, dia;
    
    do {
       dia_nac = Integer. parseInt (JOptionPane.showInputDialog("INGRESE EL DIA DE SU NACIMIENTO"));
       mes_nac = Integer. parseInt (JOptionPane.showInputDialog("INGRESE EL MES DE SU NACIMIENTO")); 
       año_nac = Integer. parseInt (JOptionPane.showInputDialog("INGRESE EL AÑO DE SU NACIMIENTO"));
           if (dia_nac <= 0 || dia_nac > 31 || mes_nac <= 0 || mes_nac > 12 || año_nac > 2021 || año_nac < 1821 || 
               mes_nac == 2 && dia_nac > 28 || mes_nac == 4 && dia_nac > 30 || mes_nac == 6 && dia_nac > 30 || 
               mes_nac == 9 && dia_nac > 30 || mes_nac == 11 && dia_nac > 30){
           JOptionPane.showMessageDialog(null,"FECHA INCORRECTA");
           } 
          
    }
    while (dia_nac <= 0 || dia_nac > 31 || mes_nac <= 0 || mes_nac > 12 || año_nac > 2021 || año_nac < 1821 || 
               mes_nac == 2 && dia_nac > 28 || mes_nac == 4 && dia_nac > 30 || mes_nac == 6 && dia_nac > 30 || 
               mes_nac == 9 && dia_nac > 30 || mes_nac == 11 && dia_nac > 30);
    do {
       dia_act = Integer. parseInt (JOptionPane.showInputDialog("INGRESE EL DIA ACTUAL"));
       mes_act = Integer. parseInt (JOptionPane.showInputDialog("INGRESE EL MES ACTUAL")); 
       año_act = Integer. parseInt (JOptionPane.showInputDialog("INGRESE EL AÑO ACTUAL"));
           if (dia_act <= 0 || dia_act > 31 || mes_act <= 0 || mes_act > 12 || año_act != 2021 || 
               mes_act == 2 && dia_act > 28 || mes_act == 4 && dia_act > 30 || mes_act == 6 && dia_act > 30 || 
               mes_act == 9 && dia_act > 30 || mes_act == 11 && dia_act > 30){
               JOptionPane.showMessageDialog(null,"FECHA INCORRECTA");
           }
    }
    while (dia_act <= 0 || dia_act > 31 || mes_act <= 0 || mes_act > 12 || año_act != 2021 || 
               mes_act == 2 && dia_act > 28 || mes_act == 4 && dia_act > 30 || mes_act == 6 && dia_act > 30 || 
               mes_act == 9 && dia_act > 30 || mes_act == 11 && dia_act > 30);
    
   
   if (mes_act < mes_nac){
   edad =  año_act - año_nac - 1;
    }
   else if(mes_act == mes_nac && dia_act >= dia_nac){
      edad = año_act - año_nac; 
    }
    else if(mes_act == mes_nac && dia_act < dia_nac){
      edad = año_act - año_nac - 1;
    }else{
        edad = año_act - año_nac;
    }
   
   
   if (edad >= 1){
    JOptionPane.showMessageDialog(null,"LA PERSONA TIENE "+edad+" AÑOS");
    }else if(mes_act > mes_nac) {
        mes = mes_act - mes_nac;
    JOptionPane.showMessageDialog(null,"EL BEBE TIENE "+mes+" MESES");
    }else if(dia_act > dia_nac){
        dia = dia_act - dia_nac;
        JOptionPane.showMessageDialog(null,"EL BEBE TIENE "+dia+" DIAS");
    }else{
        JOptionPane.showMessageDialog(null,"ESTA RECIEN NACIDO");
    } 
    
  }
    
}
    
    

