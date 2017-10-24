package es.altair.bean;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="equipo")

public class Equipo implements Serializable{

	@Id
	  private int idEquipo;
	  private String nombre;
	  private String ciudad;
	  private int numSocios;
	  
	public Equipo() {
		super();
	}

	
	
	public Equipo(String nombre, String ciudad, int numSocios) {
		super();
		this.nombre = nombre;
		this.ciudad = ciudad;
		this.numSocios = numSocios;
	}



	public Equipo(int idEquipo, String nombre, String ciudad, int numSocios) {
		super();
		this.idEquipo = idEquipo;
		this.nombre = nombre;
		this.ciudad = ciudad;
		this.numSocios = numSocios;
	}

	public int getIdEquipo() {
		return idEquipo;
	}

	public void setIdEquipo(int idEquipo) {
		this.idEquipo = idEquipo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public int getNumSocios() {
		return numSocios;
	}

	public void setNumSocios(int numSocios) {
		this.numSocios = numSocios;
	}

	@Override
	public String toString() {
		return "Equipo [idEquipo=" + idEquipo + ", nombre=" + nombre + ", ciudad=" + ciudad + ", numSocios=" + numSocios
				+ "]";
	}
	  
	  
	  
}
