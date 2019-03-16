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
public class Pasajero implements Observer{
    public String nombre;
    public Vuelo vuelo;

    public Pasajero(String nombre, Vuelo vuelo) {
        this.nombre = nombre;
        this.vuelo= vuelo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Vuelo getVuelo() {
        return vuelo;
    }

    public void setVuelo(Vuelo vuelo) {
        this.vuelo = vuelo;
    }
    
    public void alertar(Vuelo vuelo){
        System.out.println("El destino del vuelo del pasajero es:" + vuelo.getDestino());
    }
}
