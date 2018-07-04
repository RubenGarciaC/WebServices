package practicaswss.rest.servicios;

import java.net.HttpURLConnection;
import java.util.Collection;
import java.util.HashMap;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.HttpMethod;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import practicaswss.entidades.Cliente;
import practicaswss.entidades.ErrorInfo;

// La llamada sería
// /serviciosrest/clientes/{nif}
//Para probar http://localhost:8080/practicaswss/v1.0/clientes/51
//@SessionScoped   //crea la cookie

@Path("/clientes")
@ApplicationScoped // funciona para todos los clientes
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
	@Produces({"application/xml","application/json"}) //el xml lo podemos obviar
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
	
	//para invocarlo por RestFull
	@PUT
	@POST
	@Path("/")
	@Consumes({"application/xml","application/json"})
	public Response altaCliente(Cliente cte) {
		
		if(tablaClientes.containsKey(cte.getNif())) {
			return Response.status(HttpURLConnection.HTTP_BAD_REQUEST)
					.entity(
						new ErrorInfo(-2120, "Existe cliente con el NIF:"+cte.getNif())	
							)
					//.type() se pueden poner cabeceras para obligar que nos las pasen
					.build(); //400 return
					
		}
		else {
			tablaClientes.put(cte.getNif(), cte);
			return Response.ok().build();
		}
	}
	
	@POST
	@Path("/{nif:[0-9]{8}[A-Z]}")
	@Consumes({"application/xml","application/json"})
	public Response modificarCliente(Cliente cte) {
		
		tablaClientes.put(cte.getNif(), cte);
		
		return Response.ok().build();
	}
	
	
	@DELETE
	@Path("/{nif:[0-9]{8}[A-Z]}")
	public Response borrarCliente(
			@PathParam("nif")
			String nif) {
		
		tablaClientes.remove(nif);
		
		return Response.ok().build();
	}
	
	
}