package com.basic.basic;

public class ClaseB {

	private String direccion;
    private String email;

    public ClaseB() {
        this.direccion="Calle ...";
        this.email="algo@dominio.com";
    }

    public String informacion() {
        return "ClaseB{" + "direccion=" + direccion 
                + ", email=" + email + '}';
    }
}
