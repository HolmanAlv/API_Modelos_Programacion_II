package entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "TIPOPERMISO")
public class TipoPermiso {

    @Id
    @Column(name = "IDTIPOPERMISO")
    private String idTipoPermiso;

    @Column(name = "DESCTIPOPERMISO")
    private String descripcion;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "IDROLFK")
    private Rol rol;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "IDPERMISOFK")
    private Permiso permiso;

    //Getters & setters
    
	public String getIdTipoPermiso() {
		return idTipoPermiso;
	}

	public void setIdTipoPermiso(String idTipoPermiso) {
		this.idTipoPermiso = idTipoPermiso;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Rol getRol() {
		return rol;
	}

	public void setRol(Rol rol) {
		this.rol = rol;
	}

	public Permiso getPermiso() {
		return permiso;
	}

	public void setPermiso(Permiso permiso) {
		this.permiso = permiso;
	}

    
}
