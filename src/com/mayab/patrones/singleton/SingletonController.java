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
public class SingletonController {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean logueado;
        
        Usuario us = Usuario.getInstance();

        System.out.println("Haciendo login:");
        us.Login();
        us.isLogueado();

        
        Usuario us2 = Usuario.getInstance();
        System.out.println("Haciendo logout");
        us2.Logout();
        us2.isLogueado();
        System.out.println(us.isLogueado());
       
    }
    
}
