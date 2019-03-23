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
public class PersonaViejaClass implements PersonaVieja{
 
    public String name;
    public String surname;
    public String Birthday;
    
    public PersonaViejaClass() {
        this.name = "Karen";
        this.surname = "Arenas";
        this.Birthday = "31/03/1998";
    }

    public PersonaViejaClass(String name, String surname, String Birthday) {
        this.name = name;
        this.surname = surname;
        this.Birthday = Birthday;
    } 

    
    public String nombre() {
        return name;
    }

    
    public String apellido() {
        return surname;
    }

    
    public String fecha() {
        return Birthday;
    }
}
