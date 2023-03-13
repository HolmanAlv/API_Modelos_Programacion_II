package entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "ROL")
public class Rol {

    @Id
    @Column(name = "IDROL")
    private String idRol;

    @Column(name = "NOMROL")
    private String nombre;

    @Column(name = "DESCROL")
    private String descripcion;

    //Getters & setters

    
	public String getIdRol() {
		return idRol;
	}

	public void setIdRol(String idRol) {
		this.idRol = idRol;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

   
}