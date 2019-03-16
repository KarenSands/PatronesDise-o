/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mayab.patrones.decorator;

/**
 *
 * @author karen
 */
public class DecoratorController {
    public static void main(String[] args) {
        Burger bur = new Angus();
    bur = new Bacon(bur);
    bur = new Guacamole(bur);
    
    System.out.println(bur.getDescription()+bur.cost()); 
    }
}
