/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mayab.patrones.singleton;

/**
 *
 * @author karen
 */
public class Singleton {
    private static Singleton instance = new Singleton();
    private Singleton() { }
    
    public static Singleton getInstance() {
            return Singleton.instance;
    }
}