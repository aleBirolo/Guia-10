/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_04;

import Entidades.Circulo;
import Entidades.Rectangulo;

/**
 *
 * @author Alejandro Birolo
 */
public class Ejercicio_04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rectangulo rec = new Rectangulo(4,2);
        Circulo cir = new Circulo(1);
        
        System.out.println(rec);
        System.out.println(cir);
    }
}
