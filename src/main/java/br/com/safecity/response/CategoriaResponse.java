package br.com.safecity.response;

import java.io.Serializable;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CategoriaResponse implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4163641910899912035L;
	@JsonProperty("idCategoria")
	private Long idCategoria;
	
	@JsonProperty("descricaoCategoria")
	private String descricaoCategoria;

	public Long getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(Long idCategoria) {
		this.idCategoria = idCategoria;
	}

	public String getDescricaoCategoria() {
		return descricaoCategoria;
	}

	public void setDescricaoCategoria(String descricaoCategoria) {
		this.descricaoCategoria = descricaoCategoria;
	}

//	@Override
//	public String toString() {
//		return "CategoriaResponse [idCategoria=" + idCategoria + ", descricaoCategoria=" + descricaoCategoria + "]";
//	}
	
	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this);
	}


}
