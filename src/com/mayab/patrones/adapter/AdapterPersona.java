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
public class AdapterPersona implements PersonaVieja{
    
    public PersonaNuevaClass personaNueva;

    public AdapterPersona(PersonaNueva personaNueva) {
        this.personaNueva = (PersonaNuevaClass) personaNueva;
    }
    
    @Override
    public String nombre(){
        String nombreCom=personaNueva.nombreC();
        String[] nombres = nombreCom.split(" ");
        String name= nombres[0];
        return name;
    }
    

    public String apellido(){
        String nombreCom = personaNueva.nombreC();
        String[] nombres = nombreCom.split(" ");
        String surname= nombres[1];
        return surname;
    }
    
    public String fecha() {
        String age = personaNueva.edad();
        return age;
    }
}
