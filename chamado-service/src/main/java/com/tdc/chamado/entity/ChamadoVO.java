package com.tdc.chamado.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class ChamadoVO {
	
	@JsonProperty("id_usuario")
	private Long idUsuario;

	@JsonProperty("id_Catalogo")
	private Long idCatalogo;

	@JsonProperty("descricao")
	private String descricao;
	
	
}
