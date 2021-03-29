
package com.mycompany.fecha;

import javax.swing.JOptionPane;


public class fecha {


    public static void main(String[] args) {
    int dia, mes, año;
    String a = "La fecha ingresada es: \n";
    do {
       dia = Integer. parseInt (JOptionPane.showInputDialog("INGRESE EL DIA"));
       mes = Integer. parseInt (JOptionPane.showInputDialog("INGRESE EL MES")); 
       año = Integer. parseInt (JOptionPane.showInputDialog("INGRESE EL AÑO"));
           if (dia <= 0 || dia > 31 || mes <= 0 || mes > 12 || año > 2021 || mes==2 && dia > 28
    || mes == 4 && dia > 30 || mes == 6 && dia > 30 || mes == 9 && dia > 30 || mes == 11 && dia > 30){
           JOptionPane.showMessageDialog(null,"FECHA INCORRECTA");
           }       
    }
    while (dia <= 0 || dia > 31 || mes <= 0 || mes > 12 || año > 2021 || mes==2 && dia > 28
    || mes == 4 && dia > 30 || mes == 6 && dia > 30 || mes == 9 && dia > 30 || mes == 11 && dia > 30);
    
    switch (mes){
        case 1: JOptionPane.showMessageDialog(null, a+ "El "+dia+" de enero de "+año);
        break;
        case 2: JOptionPane.showMessageDialog(null,a+"El "+dia+" de febrero de "+año);
        break;
        case 3: JOptionPane.showMessageDialog(null,a+"El "+dia+" de marzo de "+año);
        break;
        case 4: JOptionPane.showMessageDialog(null,a+"El "+dia+" de abril de "+año);
        break;
        case 5: JOptionPane.showMessageDialog(null,a+"El "+dia+" de mayo de "+año);
        break;
        case 6: JOptionPane.showMessageDialog(null,a+"El "+dia+" de junio de "+año);
        break;
        case 7: JOptionPane.showMessageDialog(null,a+"El "+dia+" de julio de "+año);
        break;
        case 8: JOptionPane.showMessageDialog(null,a+"El "+dia+" de agosto de "+año);
        break;
        case 9: JOptionPane.showMessageDialog(null,a+"El "+dia+" de septiembre de "+año);
        break;
        case 10: JOptionPane.showMessageDialog(null,a+"El "+dia+" de octube de "+año);
        break;
        case 11: JOptionPane.showMessageDialog(null,a+"El "+dia+" de noviembre de "+año);
        break;
        case 12: JOptionPane.showMessageDialog(null,a+"El "+dia+" de diciembre de "+año);
        break;
    }     
  } 
}
   
    
    
    
