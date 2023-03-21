package com.generation.farmagen.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_produto")
public class Produto {
		
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
		
	@NotBlank(message = "O atributo Nome é Obrigatório.")
	@Size(min = 1, max = 50, message = "O atributo nome deve conter no mínimo 1 e no máximo 50 caracteres")
	private String nome;
		
	@NotBlank(message = "O atributo Marca é Obrigatório.")
	@Size(min = 1, max = 50, message = "O atributo marca deve conter no mínimo 1 e no máximo 50 caracteres")
	private String marca;
		
	@NotNull(message = "O atributo Quantidade é Obrigatório.")
	private Integer quantidade;
		
	@NotNull(message = "O atributo Preço é Obrigatório.")
	private BigDecimal preco;
	
	@ManyToOne
    @JsonIgnoreProperties("produto")
    private Categoria categoria;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
	
		
	

} 
