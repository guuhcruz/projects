package br.com.role.app.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "eventos")
public class Evento extends BaseEntity implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4073665502437903382L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer uid;
	
	@Column(name = "nome", nullable = false, length = 50, unique = false)
	private String nome;
	
	@JsonProperty("nome")
    public String getNome() {
        return nome;
    }
	
	@Column(name = "data_abertura", nullable = false, unique = false)
	private Date dataAbertura;
	
	@JsonProperty("data_abertura")
    public Date getDataAbertura() {
        return dataAbertura;
    }
	
	@Column(name = "data_encerramento", nullable = false, unique = false)
	private Date dataEncerramento;
	
	@JsonProperty("data_encerramento")
    public Date getDataEncerramento() {
        return dataEncerramento;
    }
	
	@Column(name = "descricao", nullable = false, length = 250, unique = false)
	private String descricao;
	
	@JsonProperty("descricao")
    public String getDescricao() {
        return descricao;
    }
	
	@Column(name = "endereco", nullable = false, length = 250, unique = false)
	private String endereco;
	
	@JsonProperty("endereco")
    public String getEndereco() {
        return endereco;
    }
	
	@Column(name = "contato", nullable = false, length = 50, unique = false)
	private String contato;
	
	@JsonProperty("contato")
    public String getContato() {
        return contato;
    }
	
	@Column(name = "site", nullable = false, length = 50, unique = false)
	private String site;
	
	@JsonProperty("site")
    public String getSite() {
        return site;
    }
	
	@Column(name = "perfil_facebook", nullable = false, length = 50, unique = false)
	private String perfilFacebook;
	
	@JsonProperty("perfil_facebook")
    public String getPerfilFacebook() {
        return perfilFacebook;
    }
	
	@Column(name = "perfil_instagram", nullable = false, length = 50, unique = false)
	private String perfilInstagram;
	
	@JsonProperty("perfil_instagram")
    public String getPerfilInstagram() {
        return perfilInstagram;
    }
	
	@Column(name = "flyer", nullable = false, length = 50, unique = false)
	private String flyer;
	
	@JsonProperty("flyer")
    public String getFlyer() {
        return flyer;
    }

	@Override
	public Integer getUid() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setUid(Integer id) {
		// TODO Auto-generated method stub
		
	}
}
