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
public class Guacamole extends Decorator{
    Burger burger;

    public Guacamole(Burger burger) {
        this.burger = burger;
    }

    @Override
    public String getDescription() {
        return burger.getDescription()+", Guacamole" ;
    }

    @Override
    public void setDescription(String description) {
        this.description = "Hamburguesa con Guacamole";
    }

    @Override
    public double cost() {
		return 4.99;
	}
    
    
}
