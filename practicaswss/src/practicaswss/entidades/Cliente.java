package practicaswss.entidades;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement  //(namespace="ClienteJurjo") // no necesario namespace
@XmlAccessorType(XmlAccessType.FIELD)
public class Cliente {

	private String nombre;
	private String nif;
	private String apellidos;
	
	public Cliente() {
		
	}
	
	public Cliente(String nombre, String nif, String apellidos) {
		super();
		this.nombre = nombre;
		this.nif = nif;
		this.apellidos = apellidos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

}
