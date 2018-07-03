package practicaswss.rest.servicios;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
//Para que funcione

@ApplicationPath //Para url común si quieres
(value = "/v1.0")
public class Aplicacion extends Application {
	
	public Set<Class<?>> getClasses(){
		
		HashSet<Class<?>> classesServicio = new HashSet<>();
		classesServicio.add(GestionClientes.class);
		
		return classesServicio;
		
	}

}
