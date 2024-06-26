package com.mycompany.examenrecu;

import java.util.HashMap;
import javax.swing.JOptionPane;


public class Ejercicio2 {
    public static void main(String[] args) {
       HashMap<String,Integer> hospital = new HashMap<>();
       
       int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de pacientes"));
       for (int  i = 0; i < n; i++){
           String nombre = JOptionPane.showInputDialog("Ingrese el nombre del paciente " + (i + 1) + " : ");
       double trata = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio del tratamiento"));
       double medi = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio de los medicamentos"));
        
                
           for (int j = 0; j < 1; j++) {
                while (true) {
                	 int dias = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los dias para " + nombre + ": ")); 
                        double pagototal = trata+medi+dias*100000;
                        System.out.println("El valor a pagar de el paciente " +nombre+ " es:"+pagototal+" $");
                        break;
                }
    
            }
        }
    }
}
