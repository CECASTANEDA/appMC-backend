package com.mitocode.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
public class Persona {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idPersona;

	@NotNull
	@Size(min = 2, message = "{nombres.persona.size}")
	@Column(name = "nombres", nullable = false, length = 70)
	private String nombres;

	@NotEmpty
	@Size(min = 2, message = "{apellidos.persona.size}")
	@Column(name = "apellidos", nullable = false, length = 70)
	private String apellidos;

	public Integer getIdPersona() {
		return idPersona;
	}

	public void setIdPersona(Integer idPersona) {
		this.idPersona = idPersona;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

}
