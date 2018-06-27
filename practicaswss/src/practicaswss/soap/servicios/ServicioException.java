package practicaswss.soap.servicios;

import javax.xml.ws.WebFault;

@WebFault(name="ErrorEnServicio")
public class ServicioException extends Exception {

	public ServicioException() {
		super();
	}

	public ServicioException(String message, Throwable cause) {
		super(message, cause);
	}

	public ServicioException(String message) {
		super(message);
	}

}