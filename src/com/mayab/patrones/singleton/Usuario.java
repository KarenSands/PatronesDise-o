/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mayab.patrones.singleton;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;

/**
 *
 * @author karen
 */
public class Usuario {
    public static String Nombre;
    public static String Apellido;
    public static boolean logueado;
    
    private static Usuario instance = new Usuario(Nombre, Apellido);
    public static Usuario getInstance() {
        return Usuario.instance;
    }


    public Usuario(String Nombre, String Apellido) {
        Usuario.Nombre = Nombre;
        Usuario.Apellido = Apellido;
    }
    
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        Usuario.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        Usuario.Apellido = Apellido;
    }

    public boolean isLogueado() {
          if(logueado==TRUE){
              System.out.println("Sesión iniciada");
        } else{
              System.out.println("Sesión cerrada");
          }
        return logueado;
    }

    public void setLogueado(boolean Logueado) {
        logueado = Logueado;
    }
    
    public boolean Login(){
         if(logueado==FALSE){
            logueado=Boolean.TRUE;
        }
        return logueado;
    }
    
        public boolean Logout(){
          if(logueado==TRUE){
            logueado=Boolean.FALSE;
        }
        return logueado;
    }
    
}
