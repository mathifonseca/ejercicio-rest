package com.ejercicio.rest.ws;

import com.ejercicio.rest.dominio.Estudiante;
import com.ejercicio.rest.sb.EstudianteSB;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.Consumes;
import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Produces;
import java.util.List;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

@Path("estudiantes")
@Stateless
public class EstudianteResource {
    
    @EJB
    EstudianteSB sb;

    public EstudianteResource() {
    }

    @GET
    @Produces("application/json")
    public List<Estudiante> getJson() {
        return sb.lista();
    }
    
    @GET
    @Path("/{nombre}")
    @Produces("application/json")
    public Response search(@PathParam(value = "nombre") String nombre) {
        Response r;
        try {
            Estudiante b = sb.buscar(nombre);
            if (b == null) {
                r = Response.noContent().build();
            } else {
                r = Response.ok(b).build();
            }
        } catch (Exception ex) {
            r = Response.serverError().entity(ex).build();
        }
        return r;
    }

    @POST
    @Consumes("application/json")
    @Produces("application/json")
    public Estudiante postJson(@QueryParam(value = "nombre") String nombre, @QueryParam(value = "nota") Long nota) {
        return sb.alta(nombre, nota);
    }
    
}