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
public class FileImp implements File{
    
    public String FileName;

    public FileImp(String FileName) {
        this.FileName = FileName;
    }
    
    @Override
    public void borrar(){
        System.out.println("Estoy borrando " + FileName);
    }
    
    @Override
    public void escribir(){
        System.out.println("Estoy escribiendo "+ FileName);
    }
    
    @Override
    public void leer(){
        System.out.println("Estoy leyendo "+ FileName);
    }
}
