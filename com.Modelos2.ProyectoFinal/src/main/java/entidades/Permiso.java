package entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "PERMISO")

public class Permiso {

	@Id
	@Column(name = "IDPERMISO")
	private String idPermiso;

	@Column(name = "DESCPERMISO")
	private String descripcion;

	//Getters & setters

	public String getIdPermiso() {
		return idPermiso;
	}

	public void setIdPermiso(String idPermiso) {
		this.idPermiso = idPermiso;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	 
}


