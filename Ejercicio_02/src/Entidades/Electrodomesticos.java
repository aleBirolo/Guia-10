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
public abstract class Electrodomesticos {
    protected double precio;
    protected String color;
    protected char consumoEnerg;
    protected double peso;
    private Scanner entrada;
    
    public Electrodomesticos() {
        this.precio = 0;
        comprobarColor(" ");
        comprobarConsumoEnergetico(' ');
        this.peso = 0;
    }

    public Electrodomesticos(double precio, String color, char consumoEnerg, double peso) {
        this.precio = precio;
        comprobarColor(color);
        comprobarConsumoEnergetico(consumoEnerg);
        this.peso = peso;
    }

    public double getPrecio() {
        return precio;
    }

    public String getColor() {
        return color;
    }

    public char getConsumoEnerg() {
        return consumoEnerg;
    }

    public double getPeso() {
        return peso;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setConsumoEnerg(char consumoEnerg) {
        this.consumoEnerg = consumoEnerg;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    private void comprobarConsumoEnergetico(char consumo){
        if ('A'<= consumo && consumo <='F')
            this.consumoEnerg= consumo;
        else
            this.consumoEnerg='F';
    }
    
    private void comprobarColor (String color){
        if (color.equalsIgnoreCase("blanco") ||
            color.equalsIgnoreCase("negro") ||
            color.equalsIgnoreCase("rojo") ||
            color.equalsIgnoreCase("gris") 
           )
            this.color=color;
        else
            this.color="blanco";
    }
    
    protected void crearElectrodomestico(){
        entrada = new Scanner(System.in).useDelimiter("\n");
        
        System.out.print("Ingrese Precio: ");
        setPrecio(entrada.nextDouble()+1000d);
        
        System.out.print("Ingrese Color: ");
        comprobarColor(entrada.next());
        
        System.out.print("Ingrese Consumo Energetico: ");
        comprobarConsumoEnergetico(entrada.next().charAt(0));
        
        System.out.print("Ingrese Peso: ");
        setPeso(entrada.nextDouble());
    }
    
    protected void precioFinal(){
        
        switch (this.consumoEnerg)
        {
            case 'A':
                this.precio+=1000;
                break;
            case 'B':
                this.precio+=800;
                break;
            case 'C':
                this.precio+=600;
                break;
            case 'D':
                this.precio+=500;
                break;
            case 'E':
                this.precio+=300;
                break;
            case 'F':
                this.precio+=100;
                break;  
        }
        
        if( 1<= this.peso  && this.peso<=19)
            this.precio+=100;
        else if (20<= this.peso && this.peso <=49)
            this.precio+=500;
        else if (50 <= this.peso && this.peso <=79)
            this.precio+=800;
        else
            this.precio+=1000;
    }

    @Override
    public String toString() {
       return  " precio=" + precio + ", color=" + color + ", consumoEnerg=" + consumoEnerg + ", peso=" + peso ;
    }
    
}
