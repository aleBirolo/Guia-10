/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import Interfaces.CalculosFormas;

/**
 *
 * @author Alejandro Birolo
 */
public final class Rectangulo implements CalculosFormas {
    private double ladoMayor;
    private double ladoMenor;
    private double perimetro;
    private double area;

    public Rectangulo() {
        this.ladoMayor = 2;
        this.ladoMenor = 1;
        calcularPerimetro();
        calcularArea();
    }

    public Rectangulo(double ladoMayor, double ladoMenor) {
        if (ladoMenor < ladoMayor){
           this.ladoMayor = ladoMayor;
           this.ladoMenor = ladoMenor; 
           calcularPerimetro();
           calcularArea();
        }
        else
            this.ladoMayor =  this.ladoMenor = this.perimetro = this.area = 0;
    }

    public double getLadoMayor() {
        return ladoMayor;
    }

    public double getLadoMenor() {
        return ladoMenor;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public double getArea() {
        return area;
    }
    
    public void setLadoMayor(double ladoMayor) {
        if (this.ladoMenor < ladoMayor )
            this.ladoMayor = ladoMayor;
        else
            this.ladoMayor = 0;
    }

    public void setLadoMenor(double ladoMenor) {
        if (this.ladoMayor > ladoMenor)
            this.ladoMenor = ladoMenor;
        else
            this.ladoMenor = 0;
    }

    @Override
    public String toString() {
        return "Rectangulo{" + "ladoMayor=" + ladoMayor + ", ladoMenor=" + ladoMenor + ", perimetro=" + perimetro + ", area=" + area + '}';
    }

    @Override
    public void calcularPerimetro() {
        this.perimetro = 2 * ( this.ladoMayor + this.ladoMenor);
    }

    @Override
    public void calcularArea() {
        this.area = this.ladoMayor * this.ladoMenor ;
    }
     
}
