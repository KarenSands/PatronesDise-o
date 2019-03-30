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
public class ProxyFile implements File{
    private FileImp fileI;
    private final String fileName;
    private final Usuario us;

    public ProxyFile(String fileName, Usuario us) {
        this.fileName = fileName;
        this.us = us;
        this.fileI = new FileImp(fileName);
    } 
    
    @Override
    public void borrar() {
        if("Super".equals(us.getTipo())){
            fileI.borrar();
        } else {
            System.out.println("No tienes los permisos para borrar");
        }
    }

    @Override
    public void escribir() {
        if("Super".equals(us.getTipo())){
            fileI.escribir();
        } else {
            System.out.println("No tienes los permisos para escribir");
        }
    }

    @Override
    public void leer() {
        if("Super".equals(us.getTipo())){
            fileI.leer();
        } else {
            System.out.println("No tienes los permisos para leer");
        }
    }

    public FileImp getFileI() {
        return fileI;
    }

    public void setFileI(FileImp fileI) {
        this.fileI = fileI;
    }
    
}
