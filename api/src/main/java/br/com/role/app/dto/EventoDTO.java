package br.com.role.app.dto;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@SuppressWarnings("unused")
public class EventoDTO {

	private int id;
	private String nome;
	private String descricao;
	private Date dataAbertura;
	private Date dataEncerramento;
	private String endereco;
	private String contato;
	private String site;
	private String perfilFacebook;
	private String perfilInstagram;
	private String flyer;
}
