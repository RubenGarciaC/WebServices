package practicaswss.rest.servicios;

import java.net.HttpURLConnection;
import java.util.Collection;
import java.util.HashMap;

import javax.annotation.PostConstruct;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import practicaswss.entidades.Cliente;

// La llamada sería
// /serviciosrest/clientes/{nif}
//Para probar http://localhost:8080/practicaswss/v1.0/clientes/51

@Path("/clientes")
public class GestionClientes {
	
	private 
	HashMap<String, Cliente> tablaClientes = new HashMap<>();
	
	@PostConstruct
	private void cargarDatos() {  //para simular que ha cargado algo de una db
		
		tablaClientes.put("1010",
				new Cliente("Luis","1010","García" )
				);
		
		tablaClientes.put("1212",
				new Cliente("Alberto","1212","Francesco" )
				);
		
	}
	
	
	@GET
	@Path("/{nif}") // /{nif:[0-9]{8}[A-Z] con esto validamos 8 numeros 1 letra
	@Produces({"application/json","application/xml"}) //el xml lo podemos obviar
	public Response buscarPorNif(
			@PathParam(value = "nif")
			String nifCliente
			) 
	{
		
		cargarDatos();
		
		if(tablaClientes.containsKey(nifCliente)){ //.expired, etc
			return Response.ok(tablaClientes.get(nifCliente)).build();
		}
		else {

			//return Response.noContent().entity("El cliente no existe").type("text/plain").build();
			//para evitar el 202 
			return Response.status(HttpURLConnection.HTTP_NOT_FOUND).type("text/plain").build();
		}
		
	}
	
	@GET  //Coge por efecto sin barra si no le pasas parámetros
	@Path("/")
	public Collection<Cliente> todosLosClientes(){
		cargarDatos();
		return tablaClientes.values();
		
	}
	
	
	
	
	
	
	

}