package com.ifmt.cobracaifmt5.model;

public enum StatusTitulo {
	PENDENTE("PENDENTE"),
	RECEBIDO("RECEBIDO");
	
	
private String descricao;
	
	StatusTitulo(String descricao){
		this.descricao=descricao;
	}
	
	public String getdescricao() {
		return descricao;
	}
	
}
