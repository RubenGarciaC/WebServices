package practicaswss.soap.servicios;

import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebParam.Mode;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.Holder;

@WebService(
		targetNamespace = "http://clark.com/services/office",
		name="ServicioBasic"
		//wsdlLocation="" Permite controlar el documento que se entrega como WDSL
		)
public interface PrimerServicio_SEI {

	@WebResult(name="temperature")
	double getTemperatura(
			@WebParam(name="ciudad") String localidad);

	@WebMethod(operationName="crearAlumno") //camufla nombre
	void altaAlumno(
			@WebParam(name="alumno")
			Alumno alumno
			) throws ServicioException;

	
	//Enviar info por cabeceras
	
	@WebMethod(operationName="cabeceras")
	void envioPorCabeceras(
			
			@WebParam(name="firma", header = true, targetNamespace="http://clark.com")
			String firma,
			@WebParam(name="apikey",header=true) //le dices true que llega a través de la cabecera
			String apikey,
			@WebParam(name="mensaje")
			String mensajeApi
	);
	

	@WebMethod(operationName="modalidades")
	long modalidadesDeEnvio(
			@WebParam(name="cadenaEntrada", mode=Mode.IN)
			String cadenaEntrada,
			@WebParam(name="cadenaSalida", mode=Mode.OUT)
			Holder<String> cadenaSalida,   //Se envuelve la salida en String
			@WebParam(name="cadenaEntradaSalida", mode=Mode.INOUT)
			Holder<String> cadenaEntradaSalida
	);
	
	@WebMethod(operationName="registrarEjecucion_Sincrono")
	void registrarEjecucion( 
			@WebParam(name="nivel")
			String nivel,
			@WebParam(name="mensaje")
			String mensaje
	);
	
	@Oneway
	@WebMethod(operationName="registrarEjecucion_Asincrono")
	void registrarEjecucionAsincrono( //Para no devolver nada
			@WebParam(name="nivel")
			String nivel,
			@WebParam(name="mensaje")
			String mensaje
	);
	@WebMethod(operationName="subirFichero") //Lo convierte a texto el binario
	void subirFichero(
			@WebParam(name="nombreFichero")
			String nombreFichero,
			@WebParam(name="tipoMime")
			String tipoMime,
			@WebParam(name="fichero")
			byte[] fichero
	);
	
	
	
}