/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_02;

import Entidades.Lavadora;
import Entidades.Televisor;

/**
 *
 * @author Alejandro Birolo
 */
public class Ejercicio_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lavadora lava = new Lavadora();
        Televisor tv = new Televisor();
        
        System.out.println("Lavadora");
        lava.crearLavadora();
        System.out.println(lava);
  
        System.out.println("Televisor");
        tv.crearTelevisor();
        System.out.println(tv);
    }
}
