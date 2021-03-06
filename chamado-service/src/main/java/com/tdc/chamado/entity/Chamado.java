package com.tdc.chamado.entity;

import java.io.Serializable;
import java.time.Instant;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiParam;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "tbl_chamado", catalog = "manutencao_db")
public class Chamado implements Serializable{
	
	private static final long serialVersionUID = 8109981229123136175L;

	@Id	
	@Column(name = "id_chamado", columnDefinition = "serial")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected Integer idChamado;
	
	@Column(name = "descricao")
	private String descricao;
	
	@Column(name = "data_hora_abertura")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm")
	private LocalDateTime dataHoraAbertura = LocalDateTime.now();
	
	private Integer idUsuario;
	
	private Integer idCatalogo;
	
	private String status = "Novo";
	
	public Chamado(ChamadoVO chamadoVO){
		this.descricao = chamadoVO.getDescricao();
		this.idCatalogo = chamadoVO.getIdCatalogo();
		this.idUsuario = chamadoVO.getIdUsuario();
	}

}
