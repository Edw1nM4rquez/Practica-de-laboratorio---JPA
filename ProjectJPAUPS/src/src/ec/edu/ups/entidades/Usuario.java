package src.ec.edu.ups.entidades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Usuario
 *
 */
@Entity

public class Usuario implements Serializable {

	
	private static final long serialVersionUID = 1L;
	//nombre, cedula=id, apellido, correo, pwd
	@Id
	private String cedula;
	private String nombre;
	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	private String apellido;
	private String correo;
	private String pwd;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "usuario")
	private List<Telefono> telefonos = new ArrayList<Telefono>();
	

	public Usuario() {
		
	}

	//Esta solo para crear el usuario, sin crear los telefonos
	public Usuario(String cedula, String nombre, String apellido, String correo, String pwd) {
		super();
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.correo = correo;
		this.pwd = pwd;
	}



	//esta para agregar los telefonos del usuario
	public Usuario(String cedula, String nombre, String apellido, String correo, String pwd, List<Telefono> telefonos) {
		super();
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.correo = correo;
		this.pwd = pwd;
		this.telefonos = telefonos;
	}

	public String getId() {
		return cedula;
	}

	public void setId(String id) {
		this.cedula = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public List<Telefono> getTelefonos() {
		return telefonos;
	}

	public void setTelefonos(List<Telefono> telefonos) {
		this.telefonos = telefonos;
	}

	@Override
	public String toString() {
		return "Usuario [cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido + ", correo=" + correo + ", pwd="
				+ pwd + "]";
	}
	
   
}