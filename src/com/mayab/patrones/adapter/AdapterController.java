/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mayab.patrones.adapter;

/**
 *
 * @author karen
 */
public class AdapterController {
    public static void main(String[] args) {
    
        PersonaVieja pVieja1 = new PersonaViejaClass();
        PersonaNueva pNueva1 = new PersonaNuevaClass();
        PersonaVieja pVieja2 = new AdapterPersona(pNueva1);
        
        System.out.println("persona vieja: ");
        System.out.println(pVieja1.nombre());
        System.out.println(pVieja1.apellido());
        System.out.println(pVieja1.fecha());
        
        System.out.println("Persona nueva: ");
        System.out.println(pNueva1.nombreC());
        System.out.println(pNueva1.edad());
        
        System.out.println("Persona nueva adaptada: ");
        System.out.println(pVieja2.nombre());
        System.out.println(pVieja2.apellido());
        System.out.println(pVieja2.fecha());
    }
}
