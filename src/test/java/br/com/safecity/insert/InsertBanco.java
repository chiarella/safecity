package br.com.safecity.insert;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.math.BigDecimal;

import org.apache.commons.lang3.RandomStringUtils;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.safecity.request.CategoriaRequest;
import br.com.safecity.request.EnderecoRequest;
import br.com.safecity.request.ReclamacaoRequest;

@SpringBootTest
@AutoConfigureMockMvc
public class InsertBanco {

	@Autowired
	private MockMvc mockMvc;

	@Test
	@Order(1)
	void novaCategoria1() throws Exception {
		this.mockMvc.perform(
				post("/v1/categorias").contentType(MediaType.APPLICATION_JSON).content(asJsonString(bindCategoria1())))
				.andExpect(status().isCreated());
	}

	@Test
	@Order(2)
	void novaCategoria2() throws Exception {
		this.mockMvc.perform(
				post("/v1/categorias").contentType(MediaType.APPLICATION_JSON).content(asJsonString(bindCategoria2())))
				.andExpect(status().isCreated());
	}

	@Test
	@Order(3)
	void novaCategoria3() throws Exception {
		this.mockMvc.perform(
				post("/v1/categorias").contentType(MediaType.APPLICATION_JSON).content(asJsonString(bindCategoria3())))
				.andExpect(status().isCreated());
	}

	@Test
	@Order(4)
	void novaCategoria4() throws Exception {
		this.mockMvc.perform(
				post("/v1/categorias").contentType(MediaType.APPLICATION_JSON).content(asJsonString(bindCategoria4())))
				.andExpect(status().isCreated());
	}

	@Test
	@Order(5)
	void novaReclamacao1() throws Exception {
		this.mockMvc.perform(post("/v1/reclamacoes").contentType(MediaType.APPLICATION_JSON)
				.content(asJsonString(bindReclamacao1()))).andExpect(status().isCreated());
	}

	@Test
	@Order(6)
	void novaReclamacao2() throws Exception {
		this.mockMvc.perform(post("/v1/reclamacoes").contentType(MediaType.APPLICATION_JSON)
				.content(asJsonString(bindReclamacao2()))).andExpect(status().isCreated());
	}

	@Test
	@Order(7)
	void novaReclamacao3() throws Exception {
		this.mockMvc.perform(post("/v1/reclamacoes").contentType(MediaType.APPLICATION_JSON)
				.content(asJsonString(bindReclamacao3()))).andExpect(status().isCreated());
	}

	@Test
	@Order(8)
	void novaReclamacao4() throws Exception {
		this.mockMvc.perform(post("/v1/reclamacoes").contentType(MediaType.APPLICATION_JSON)
				.content(asJsonString(bindReclamacao4()))).andExpect(status().isCreated());
	}

	static String asJsonString(final Object obj) {
		try {
			String json = new ObjectMapper().writeValueAsString(obj);
			return json;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	static String randomString() {
		String texto = null;
		try {
			int length = 10;
			boolean useLetters = true;
			boolean useNumbers = false;
			texto = RandomStringUtils.random(length, useLetters, useNumbers);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		return texto;
	}

	static CategoriaRequest bindCategoria1() {
		CategoriaRequest categoriaRequest = new CategoriaRequest();
		categoriaRequest.setDescricaoCategoria("Assalto");
		return categoriaRequest;
	}

	static CategoriaRequest bindCategoria2() {
		CategoriaRequest categoriaRequest = new CategoriaRequest();
		categoriaRequest.setDescricaoCategoria("Buraco na Via");
		return categoriaRequest;
	}

	static CategoriaRequest bindCategoria3() {
		CategoriaRequest categoriaRequest = new CategoriaRequest();
		categoriaRequest.setDescricaoCategoria("Falta de iluminação publica");
		return categoriaRequest;
	}

	static CategoriaRequest bindCategoria4() {
		CategoriaRequest categoriaRequest = new CategoriaRequest();
		categoriaRequest.setDescricaoCategoria("Alto indice de Furto");
		return categoriaRequest;
	}

	static ReclamacaoRequest bindReclamacao1() {
		ReclamacaoRequest reclamacaoRequest = new ReclamacaoRequest();
		reclamacaoRequest.setIdCategoria(1L);
		reclamacaoRequest.setTitulo("Assalto na Av. Berrini");
		reclamacaoRequest.setDescricaoReclamacao("Fui assaltado prox. ao Bradesco na Av Berrini, 2 individuos armado");
		EnderecoRequest enderecoRequest = new EnderecoRequest();
		enderecoRequest.setCep("04571926");
		enderecoRequest.setComplemento(randomString());
		enderecoRequest.setLogradouro(randomString());
		reclamacaoRequest.setEndereco(enderecoRequest);
		return reclamacaoRequest;
	}

	static ReclamacaoRequest bindReclamacao2() {
		ReclamacaoRequest reclamacaoRequest = new ReclamacaoRequest();
		reclamacaoRequest.setIdCategoria(2L);
		reclamacaoRequest.setTitulo("Buraco perigoso");
		reclamacaoRequest.setDescricaoReclamacao("Danifiquei meu carro ao passar no buraco em frente ao Petz");
		EnderecoRequest enderecoRequest = new EnderecoRequest();
		enderecoRequest.setCep("04553900");
		enderecoRequest.setComplemento(randomString());
		enderecoRequest.setLogradouro(randomString());
		reclamacaoRequest.setEndereco(enderecoRequest);
		return reclamacaoRequest;
	}

	static ReclamacaoRequest bindReclamacao3() {
		ReclamacaoRequest reclamacaoRequest = new ReclamacaoRequest();
		reclamacaoRequest.setIdCategoria(3L);
		reclamacaoRequest.setTitulo("Poste com lâmpada queimada");
		reclamacaoRequest.setDescricaoReclamacao("Rua escura sem iluminaçãono ponto próximo ao numero 430");
		EnderecoRequest enderecoRequest = new EnderecoRequest();
		enderecoRequest.setCep("05734140");
		enderecoRequest.setComplemento(randomString());
		enderecoRequest.setLogradouro(randomString());
		reclamacaoRequest.setEndereco(enderecoRequest);
		return reclamacaoRequest;
	}

	static ReclamacaoRequest bindReclamacao4() {
		ReclamacaoRequest reclamacaoRequest = new ReclamacaoRequest();
		reclamacaoRequest.setIdCategoria(4L);
		reclamacaoRequest.setTitulo("Carros furtados");
		reclamacaoRequest.setDescricaoReclamacao("Alto indice de furto a carros");
		EnderecoRequest enderecoRequest = new EnderecoRequest();
		enderecoRequest.setCep("05425010");
		enderecoRequest.setComplemento(randomString());
		enderecoRequest.setLogradouro(randomString());
		reclamacaoRequest.setEndereco(enderecoRequest);
		return reclamacaoRequest;
	}

}
