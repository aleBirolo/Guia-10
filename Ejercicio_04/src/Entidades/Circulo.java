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
public final class Circulo implements CalculosFormas{
    private double radio;
    private double diametro;
    private double longitud;
    private double perimetro;
    private double area;

    public Circulo() {
        this.radio = 1;
        this.diametro = 2 ;
        this.longitud = 2 * Math.PI;
        calcularPerimetro();
        calcularArea();
    }

    public Circulo(double radio) {
        this.radio = radio;
        this.diametro = radio * 2 ;
        this.longitud = radio * 2 * Math.PI;
        calcularPerimetro();
        calcularArea();
    }

    public double getRadio() {
        return radio;
    }

    public double getDiametro() {
        return diametro;
    }

    public double getLongitud() {
        return longitud;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public double getArea() {
        return area;
    }
    
    public void setRadio(double radio) {
        this.radio = radio;
        this.diametro = radio * 2 ;
        this.longitud = radio * 2 * Math.PI;
    }

    @Override
    public String toString() {
        return "Circulo{" + "radio=" + radio + ", diametro=" + diametro + ", longitud=" + longitud + ", perimetro=" + perimetro + ", area=" + area + '}';
    }

    @Override
    public void calcularPerimetro() {
       this.perimetro = 2 * Math.PI * this.radio ;
    }

    @Override
    public void calcularArea() {
       this.area = Math.PI * this.radio * this.radio ;
    }

}
