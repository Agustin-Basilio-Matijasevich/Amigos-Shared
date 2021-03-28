package com.mycompany.comprobanteventa;

import javax.swing.JOptionPane;

public class comprobante {


    public static void main(String[] args) {
    String empresa_emisora = (JOptionPane.showInputDialog(null,"CARACTER DE LA EMPRESA EMISORA","IVA",
        JOptionPane.PLAIN_MESSAGE,null,new Object[]{"Responsable Inscripto","Responsabe No Inscripto","Monotibutista","Exento"}
        ,"Selecciona")).toString();
    if (empresa_emisora == "Responsable Inscripto"){
        String comprador = (JOptionPane.showInputDialog(null,"CARACTER DEL COMPRADOR","IVA",
        JOptionPane.PLAIN_MESSAGE,null,new Object[]{"Responsable Inscripto","Responsabe No Inscripto","Monotibutista","Exento"}
        ,"Selecciona")).toString();
        if(comprador == "Responsable Inscripto" || comprador == "Responsabe No Inscripto"){
         JOptionPane.showMessageDialog(null,"COMPROBANTE A", "RECIBO COMPRA", JOptionPane.PLAIN_MESSAGE);   
        }else{
            JOptionPane.showMessageDialog(null,"COMPROBANTE B", "RECIBO COMPRA", JOptionPane.PLAIN_MESSAGE);
        }
    }else{
    JOptionPane.showMessageDialog(null,"COMPROBANTE C", "RECIBO COMPRA", JOptionPane.PLAIN_MESSAGE);
    }
    }
    
}
