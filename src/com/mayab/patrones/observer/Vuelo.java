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
public class Vuelo implements Observable{
    
    public String sala;
    public String salida;
    public String destino;
    public String state;
    public Pasajero[] pasajero= new Pasajero[30];

    public Vuelo(String sala, String salida, String destino, String state) {
        this.state = state;
        this.sala = sala;
        this.salida = salida;
        this.destino = destino;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
        NotifyObservers();
    }
    
    public void setPasajero(Pasajero[] pasajero) {
        this.pasajero = pasajero;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
        NotifyObservers();
    }

    public String getSalida() {
        return salida;
    }

    public void setSalida(String salida) {
        this.salida = salida;
        NotifyObservers();
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
        NotifyObservers();
    }
    
    public void addObserverToList(Pasajero p){
        for (int i = 0; i < 30; i++) {
            pasajero[i]=p;
        }
    }
    
    public void deleteObserverFromList(){
        System.out.println("Observer borrado");
    }
    
    public void NotifyObservers(){
        System.out.println("Cambio realizado");
    }
    
    
}
