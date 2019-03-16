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
public class Bacon extends Decorator{
    Burger burger;

    public Bacon(Burger burger) {
        this.burger = burger;
    }

    @Override
    public String getDescription() {
        return burger.getDescription()+", Bacon" ;
    }

    @Override
    public double cost() {
		return 3.99;
	}
    
    
}
