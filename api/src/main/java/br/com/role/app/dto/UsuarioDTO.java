package br.com.role.app.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@SuppressWarnings("unused")
public class UsuarioDTO {

	private int id;
	private String nome;
	private String email;
	private String telefone;
	private String senha;
}
