package com.mycompany.examenrecu;

import java.util.HashMap;
import javax.swing.JOptionPane;

public class Examenrecu {
    public static void main(String[] args) {
       HashMap<String,Double> producto = new HashMap<>();
       double pagototal=0;       
       
       int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de productos"));
       
       for (int  i = 0; i < n; i++){
           String nombre = JOptionPane.showInputDialog("Ingrese el nombre del producto " + (i + 1) + " : ");
            
           for (int j = 0; j < 1; j++) {
                while (true) {
                	double precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio para " + nombre + ": ")); 
                            float porcentajedescuento = 0;
                    if (precio >0 && precio >=40.000){        
                        if (precio >= 1 && precio <= 10.000) 
                            porcentajedescuento=0.00f;
                            else if(precio == 10.001 && precio >= 20.000)
                                porcentajedescuento=0.05f;
                            else if (precio == 20.001 && precio >=30.000)
                                porcentajedescuento=0.08f;
                            else if (precio == 30.001 && precio >=30.002)
                                porcentajedescuento = 0.1f;
                        pagototal = precio-precio*porcentajedescuento;
                        System.out.println("El valor a pagar es:"+pagototal+" $");
                        break;
                    }else{
                        System.out.println("El valor es invalido");
                    }

                }
            }
        }System.out.println("Cantidad total de productos validados: " + n);
    }  
}