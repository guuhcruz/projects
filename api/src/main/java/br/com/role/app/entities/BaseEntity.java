package br.com.role.app.entities;

import java.io.Serializable;

import org.springframework.hateoas.ResourceSupport;

import com.fasterxml.jackson.annotation.JsonProperty;

public abstract class BaseEntity extends ResourceSupport implements Serializable, Cloneable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1745401353979772606L;

	@JsonProperty("id")
    public abstract Integer getUid();

    public abstract void setUid(Integer id);
}
