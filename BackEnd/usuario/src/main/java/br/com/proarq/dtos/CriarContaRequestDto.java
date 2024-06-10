package br.com.proarq.dtos;

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
public class CriarContaRequestDto {
	
	private String nome;
	private String sobrenome;
	private String email;
	private String senha;
	private String senhaConfirmacao;

}
