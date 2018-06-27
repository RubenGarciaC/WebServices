package practicaswss.soap.servicios;

import java.io.FileOutputStream;

import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.ws.soap.MTOM;

@WebService
@MTOM(enabled=true,threshold=0)  //=0 a partir de esto se lanza el mtom
public class EnvioDeFicheroMTOM {
	
	
	public void subirFichero(
			@WebParam(name="nombre")
			String nombre,
			@WebParam(name="tipoMime")
			String tipoMime, 
			@WebParam(name="fichero")
			byte[] fichero) {
		
		
		try(FileOutputStream fos = new FileOutputStream("/tmp/"+nombre)) {
			fos.write(fichero);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
