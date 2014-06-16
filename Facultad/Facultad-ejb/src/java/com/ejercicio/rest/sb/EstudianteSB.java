package com.ejercicio.rest.sb;

import com.ejercicio.rest.dominio.Estudiante;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Singleton;
import javax.ejb.LocalBean;

@Singleton
@LocalBean
public class EstudianteSB {
    
    List<Estudiante> bd = new ArrayList<>();

    public Estudiante alta(Estudiante e) {
        bd.add(e);
        return e;
    }

    public List<Estudiante> lista() {
        return bd;
    }
    
    public Estudiante buscar(String param) {
        Estudiante e = null;
        for (Estudiante l : bd) {
            if (l.getNombre().equals(param)) {
                e = l;
            }
        }
        return e;
    }
    
}