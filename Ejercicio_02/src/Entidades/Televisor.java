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
public final class Televisor extends Electrodomesticos {
    private Scanner entrada;
    private double resolucion;
    private boolean sintonizador;

    public Televisor() {
        super();
    }

    public Televisor(double precio, String color, char consumoEnerg, double peso, double resolucion, boolean sintonizador) {
        super(precio, color, consumoEnerg, peso);
        this.resolucion= resolucion;
        this.sintonizador=sintonizador;
    }

    public double getResolucion() {
        return resolucion;
    }

    public boolean getSintonizador() {
        return sintonizador;
    }

    
    public void setResolucion(double resolucion) {
        this.resolucion = resolucion;
    }

    public void setSintonizador(boolean sintonizador) {
        this.sintonizador = sintonizador;
    }
    
   public void crearTelevisor(){
       entrada = new Scanner(System.in);
       
       super.crearElectrodomestico();
       
        System.out.print("Ingrese Resolucion: ");
        setResolucion(entrada.nextDouble());
        
        System.out.print("Ingrese si tiene sintonizador (Y/N): ");
  
        if ( String.valueOf(entrada.next().charAt(0)).toUpperCase().compareTo("Y") == 0   )
            setSintonizador(true);
        else
            setSintonizador(false);
        
        precioFinal();
   } 

    @Override
    protected void precioFinal() {
        super.precioFinal(); 
        
        if (this.resolucion >=40)
            super.setPrecio(precio*1.3d); 
        
        if (this.sintonizador == true)
            super.setPrecio(precio + 500);
    }
   
    @Override
    public String toString() {
        return "Televisor{" + super.toString() + " resolucion=" + resolucion + ", sintonizador=" + sintonizador + '}';
        
    }
   
}
