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
public abstract class Decorator extends Burger{
    
   @Override
   public abstract String getDescription();
   @Override
   public abstract double cost();
}
