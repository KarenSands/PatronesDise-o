/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mayab.patrones.proxy;

/**
 *
 * @author karen
 */
public class Usuario {
    public String Nombre;
    public String Tipo;

    public Usuario(String Nombre, String Tipo) {
        this.Nombre = Nombre;
        this.Tipo = Tipo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        if ("Super".equals(Tipo)||"Normal".equals(Tipo)) {
            this.Tipo = Tipo;
        } else{
            System.out.println("Usuario no válido");
        }
        
    }
    
    
}
