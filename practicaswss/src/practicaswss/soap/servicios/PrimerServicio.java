package practicaswss.soap.servicios;

import javax.jws.WebService;
import javax.xml.ws.Holder;

//@WebService Normal sin parametros
/* Lo llevamos a la interface
@WebService(
		targetNamespace = "http://clark.com/services/office",
		serviceName="ServicioBasico",
		portName="OperacionesBasicas",
		name="ServicioBasic"
		//wsdlLocation="" Permite controlar el documento que se entrega como WDSL
		)
*/

@WebService(endpointInterface = "practicaswss.soap.servicios.PrimerServicio_SEI",
		portName = "OperacionesBasicas",
		serviceName = "ServicioBasico")
public class PrimerServicio implements PrimerServicio_SEI {
	
	public double getTemperatura(String localidad) {
		
		if(localidad.equalsIgnoreCase("Madrid"))
		{
			return 30.0;
		}
		else if(localidad.equalsIgnoreCase("Sevilla")) 
		{
			return 40.11;
		}
		else 
		{
			return -10;	
		}
	}

	@Override
	public void altaAlumno(Alumno alumno) throws ServicioException {
		if(alumno.getNif().matches("^\\d{8}[A-Z]$")) {   //^estricto 8 digitos 1 letra
			throw new ServicioException("NIF incorrecto");
		}
		System.out.println("Alumno recibido");
		System.out.println(alumno);
	}
	
	@Override
	public void envioPorCabeceras(
		String firma, String apikey, String mensaje) {
		System.out.println("Firma: "+ firma);
		System.out.println("ApiKey "+apikey);
		System.out.println("Mensaje"+mensaje);
	}

	@Override
	public long modalidadesDeEnvio(String cadenaEntrada, Holder<String> cadenaSalida,
			Holder<String> cadenaEntradaSalida) {
		
		System.out.println("Cadena de entrada: "+cadenaEntrada);
		System.out.println("Cadena de salida: "+ cadenaSalida.value);
		System.out.println("Cadena de entrada y salida : "+cadenaEntradaSalida.value);
		
		cadenaSalida.value = "Cadena de salda";
		cadenaEntradaSalida.value = "Cadena salida y o entrada";
		
		
		return System.currentTimeMillis();
	}

	@Override
	public void registrarEjecucion(String nivel, String mensaje) {
		System.out.println("Nivel: " + nivel);
		System.out.println("Mensaje: "+mensaje);
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void registrarEjecucionAsincrono(String nivel, String mensaje) {
		System.out.println("Nivel: " + nivel);
		System.out.println("Mensaje: "+mensaje);
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

		
	
	
	
}
