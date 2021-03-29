
package com.mycompany.plazofijo;

import javax.swing.JOptionPane;


public class plazofijo {

  
    public static void main(String[] args) {
    double plazo_fijo = Double.parseDouble(JOptionPane.showInputDialog(null,"INDIQUE EL MONTO DEL PLAZO FIJO"));
    double cap_ini = Double.parseDouble(JOptionPane.showInputDialog(null,"INDIQUE EL MONTO DEL CAPITAL INICIAL"));
    double dias_int = Double.parseDouble(JOptionPane.showInputDialog(null,"INDIQUE LA CANTIDAD DE DIAS QUE FALTAN ABONAR"));
    
    double x = plazo_fijo - cap_ini;
    double z = 1.5/30;
    double interes = (x /100) * (z * dias_int) ;
    double cap_int = x + interes;
    double pagar = cap_int - 0.5;
    JOptionPane.showMessageDialog(null,"EL MONTO A PAGAR ES: "+ pagar);
}
}