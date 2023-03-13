package entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "USUARIO")
public class Usuario {

    @Id
    @Column(name = "IDUSUSARIO")
    private String idUsuario;

    @Column(name = "NOMUSUSARIO")
    private String nombre;

    @Column(name = "APELUSUSARIO")
    private String apellido;

    @Column(name = "PWDUSUSARIO")
    private String password;

    
    //Getters & setters

	public String getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(String idUsuario) {
		this.idUsuario = idUsuario;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

    
}
