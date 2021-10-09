package br.com.safecity.response;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.mapstruct.Mapper;

import com.fasterxml.jackson.annotation.JsonProperty;

import br.com.safecity.domain.Endereco;

//@Document(value = "reclamacaoResponse")
//@Mapper
public class ReclamacaoResponse { //implements Serializable {
	

	/**
	 * 
	 */
//	private static final long serialVersionUID = -6963858322342881493L;

//	@Field(name = "idReclamacao")
//	@Indexed(unique = true)

	@JsonProperty("idReclamacao")
	private Long idReclamacao;
	
	@JsonProperty("titulo")
	private String titulo;
	
	@JsonProperty("descricaoReclamacao")
	private String descricaoReclamacao;
	
	//@Field(name = "idCategoria")
	@JsonProperty("idCategoria")
	private Long idCategoria;
	
	@JsonProperty("endereco")
	private Endereco endereco;
//	private Categoria categoria;
	
	private String andersonB;
	
	
	

	public String getAndersonB() {
		return andersonB;
	}

	public void setAndersonB(String andersonB) {
		this.andersonB = andersonB;
	}

	public Long getIdReclamacao() {
		return idReclamacao;
	}

	public void setIdReclamacao(Long idReclamacao) {
		this.idReclamacao = idReclamacao;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricaoReclamacao() {
		return descricaoReclamacao;
	}

	public void setDescricaoReclamacao(String descricaoReclamacao) {
		this.descricaoReclamacao = descricaoReclamacao;
	}

	public Long getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(Long idCategoria) {
		this.idCategoria = idCategoria;
	}
	
	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}


	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this);
	}
//	
	

}
