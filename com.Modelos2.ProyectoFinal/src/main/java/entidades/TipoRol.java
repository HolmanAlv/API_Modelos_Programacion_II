package entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "TIPOROL")
public class TipoRol {

    @Id
    @Column(name = "IDTIPOROL")
    private String idTipoRol;

    @Column(name = "DESCTIPOROL")
    private String descripcion;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "IDROLFK")
    private Rol rol;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "IDUSUSARIOFK")
    private Usuario usuario;
    
    //Getters & setters

	public String getIdTipoRol() {
		return idTipoRol;
	}

	public void setIdTipoRol(String idTipoRol) {
		this.idTipoRol = idTipoRol;
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

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

    
}
