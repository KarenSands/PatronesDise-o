/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mayab.patrones.observer;

/**
 *
 * @author karen
 */
public class ObserverController {
    public static void main(String[] args) {
        
        Vuelo v1 = new Vuelo("225", "Los Angeles", "México", "demorado");
        Pasajero p1 = new Pasajero("Karen",v1);
        Pasajero p2 = new Pasajero("Elena",v1);
        
        v1.addObserverToList(p1);
        v1.addObserverToList(p2);
        System.out.println("Destino del vuelo 1: " + v1.getDestino());
        v1.setDestino("Miami");
        System.out.println("Nuevo destino del vuelo 1: " + v1.getDestino());
        p1.alertar(v1);
        
    }
}
