/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Scanner;

/**
 *
 * @author Alejandro Birolo
 */
public final class Lavadora extends Electrodomesticos{
    private double carga;
    private Scanner entrada;

    public Lavadora() {
        super();
        this.carga=0;
    }

    public Lavadora(double precio, String color, char consumoEnerg, double peso, double carga) {
        super(precio, color, consumoEnerg, peso);
        this.carga=carga;
    }

    public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }
    
    public void crearLavadora(){
        entrada = new Scanner(System.in);
        
        this.crearElectrodomestico();
        
        System.out.print("Ingrese Carga: ");
        setCarga(entrada.nextDouble());
        
       // this.precioFinal();
    }

    @Override
    public void precioFinal() {
        super.precioFinal(); 
        
        if (this.carga > 30)
            super.setPrecio( precio + 500);
    }
    
    @Override
    public String toString() {
        return "Lavadora{" + super.toString() +  " carga=" + carga + '}';
    }
}
