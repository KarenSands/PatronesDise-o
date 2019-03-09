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
public class FactoryMethodController {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        TrianguloCreator t1 = new EquilateroCreator();
        TrianguloCreator t2 = new IsocelesCreator();
        TrianguloCreator t3 = new EscalenoCreator();
        
        t1.calcularMedidas("equilatero");
        t2.calcularMedidas("isoceles");
        t3.calcularMedidas("escaleno");
        
    }
    
}
