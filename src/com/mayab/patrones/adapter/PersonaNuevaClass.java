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
public class PersonaNuevaClass implements PersonaNueva{
    
        public String completeName;
        public String age;

    public PersonaNuevaClass() {
        this.completeName = "Karen Arenas";
        this.age = "21";
    }

    public PersonaNuevaClass(String completeName, String age) {
        this.completeName = completeName;
        this.age = age;
    }

    public String nombreC(){
        return completeName;
    }

    public String edad(){
        return age;
    }

}
