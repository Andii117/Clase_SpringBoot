package com.basic.basic;

public class ClaseA {

    private String  nombres;
    private String  apellidos;

    public ClaseA() {
        this.nombres = "----";
        this.apellidos="****";
    }
    
    public String informacion() {
        return " ClaseA{" + "nombres=" + nombres +
               ", apellidos=" + apellidos + '}';
    }   

}
