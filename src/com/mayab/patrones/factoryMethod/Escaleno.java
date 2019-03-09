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
public class Escaleno extends Triangulo{
    
   Escaleno() {
       name= "escaleno";
    }
   
       public void area(){
        System.out.println("área de escaleno");
    }
    public void perímetro(){
        System.out.println("perímetro de escaleno");
    }
}
