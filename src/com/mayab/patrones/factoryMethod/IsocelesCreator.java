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
public class IsocelesCreator extends TrianguloCreator{
    
    @Override
    public Triangulo createTriangulo(String tipo){
        if(tipo.equals("isoceles")){
            return new Isoceles();
        } 
        return null;
    }
}
