package practicaswss.soap.servicios;

import java.util.Date;

public class Alumno {

	private String nif;
	private String nombre;
	private Date fechaNacimiento;

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	@Override
	public String toString() {
		return String.format("Alumno [nif=%s, nombre=%s, fechaNacimiento=%s]", nif, nombre, fechaNacimiento);
	}
	
	

}