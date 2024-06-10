package br.com.proarq.dtos;

import java.time.Instant;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CriarContaResponseDto {

	private Integer idUsuario;
	private String nome;
	private String sobrenome;
	private String email;
	private Instant DataHoraCriacao;
}