/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_01;

import Entidades.Animal;
import Entidades.Caballo;
import Entidades.Gato;
import Entidades.Perro;

/**
 *
 * @author Alejandro Birolo
 */
public class Ejercicio_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Animal perro = new Perro ("Stich", "Carnivoro",15, "Doberman");
        Animal perro1 = new Perro ("Teddy", "Croquetas",15, "Chihuahua");
        Animal gato = new Gato ("Pelusa","Galletas", 15, "Siames");
        Animal caballo= new Caballo ("Spark","Pasto",25,"Fino");
        
        perro.alimentarse();
        perro1.alimentarse();
        gato.alimentarse();
        caballo.alimentarse();
    }
    
}
