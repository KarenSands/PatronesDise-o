/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mayab.patrones.factoryMethod;

/**
 *
 * @author karen
 */
public abstract class TrianguloCreator {
    
    protected abstract Triangulo createTriangulo(String tipo);
   
    public Triangulo calcularMedidas(String tipo){
        Triangulo t = createTriangulo(tipo);
        System.out.println("Calculando medidas de "+ t.getName());
        t.area();
        t.perímetro();
        return t;
    }
    
}
