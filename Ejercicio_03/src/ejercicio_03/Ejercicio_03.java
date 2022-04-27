/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_03;

import Entidades.Electrodomesticos;
import Entidades.Lavadora;
import Entidades.Televisor;
import java.util.ArrayList;

/**
 *
 * @author Alejandro Birolo
 */
public class Ejercicio_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<Electrodomesticos> listaElec= new ArrayList();
        Lavadora lava;
        Televisor tv;
        double precioTot=0;
        
        listaElec.add(new Lavadora (15,"blanco",'A',100, 500 ));
        listaElec.add(new Lavadora (115,"negro",'B',80, 50 ));
        listaElec.add(new Televisor(15,"rojo",'C',50,55, true ));
        listaElec.add(new Televisor(15,"azul",'D',40, 22, false));
       
        System.out.println("Objetos creados");
        for (Electrodomesticos electrodomesticos : listaElec) {
            System.out.println(electrodomesticos);
        }
       
        for (Electrodomesticos elect : listaElec) {
            
            if (elect instanceof Lavadora) {
                lava=(Lavadora) elect;
                lava.precioFinal();
                precioTot+= lava.getPrecio();
            }
            
            if (elect instanceof Televisor) {
                tv=(Televisor) elect;
                tv.precioFinal();
                precioTot+= tv.getPrecio();
            }
        }
        
        System.out.println("Objetos Actualizados");
        for (Electrodomesticos electrodomesticos : listaElec) {
            System.out.println(electrodomesticos);
        }
        
        System.out.println("Precio Total de electrodomesticos: " + precioTot);
        
    }
    
}
