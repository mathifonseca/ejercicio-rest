package com.ejercicio.rest.dominio;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement
public class Estudiante {
    
    String nombre;
    Long nota;
    List<Telefono> contactos;
    
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

    public List<Telefono> getContactos() {
        return contactos;
    }

    public void setContactos(List<Telefono> contactos) {
        this.contactos = contactos;
    }
    
}