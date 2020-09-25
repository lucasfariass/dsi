package com.si.dsi.pessoa.mapper;

import java.util.List;
import java.util.stream.Collectors;

import com.si.dsi.pessoa.dto.PessoaDTO;
import com.si.dsi.pessoa.entity.Pessoa;

public class PessoaMapper {
	
	private PessoaMapper() {
	}
	
	public static Pessoa mapper(PessoaDTO pessoaDTO) {
		Pessoa pessoa = new Pessoa();
		
		pessoa.setCpf(pessoa.getCpf());
		pessoa.setId(pessoa.getId());
		pessoa.setNome(pessoa.getNome());
		
		return pessoa;
	}
	
	public static PessoaDTO mapper(Pessoa pessoa) {
		PessoaDTO pessoaDTO = new PessoaDTO();
		
		pessoaDTO.setCpf(pessoa.getCpf());
		pessoaDTO.setId(pessoa.getId());
		pessoaDTO.setNome(pessoa.getNome());
		
		return pessoaDTO;
	}
	
	public static List<PessoaDTO> mapper(List<Pessoa> pessoas) {
		return pessoas.stream().map(PessoaMapper::mapper).collect(Collectors.toList());
	}

}
