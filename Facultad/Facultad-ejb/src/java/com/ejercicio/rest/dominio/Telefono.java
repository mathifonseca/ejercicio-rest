package com.ejercicio.rest.dominio;

public class Telefono {
    
    private String numero;
    private boolean esCelular;

    public Telefono() {
    }

    public Telefono(String numero, boolean esCelular) {
        this.numero = numero;
        this.esCelular = esCelular;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public boolean isEsCelular() {
        return esCelular;
    }

    public void setEsCelular(boolean esCelular) {
        this.esCelular = esCelular;
    }
    
}