package com.ejercicio.rest.dominio;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Estudiante {
    
    String nombre;
    Long nota;
    
    public Estudiante() {
        
    }

    public Estudiante(String nombre, Long nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Long getNota() {
        return nota;
    }

    public void setNota(Long nota) {
        this.nota = nota;
    }
    
}