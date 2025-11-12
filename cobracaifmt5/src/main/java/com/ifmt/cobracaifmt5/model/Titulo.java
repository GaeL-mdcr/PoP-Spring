package com.ifmt.cobracaifmt5.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity//entidad
public class Titulo {
	
	@Id //identifica a Entidade
	@GeneratedValue(strategy=GenerationType.IDENTITY) //estratégia - fica por conta do DB
	private Long codigo;
	private String descricao;
	@DateTimeFormat(pattern="dd/mm/yyy")
	@Temporal(TemporalType.DATE)//só da data
	private Date dataVencimento;
	@NumberFormat(pattern="#,##0.00")
	private BigDecimal valor;	
	@Enumerated(EnumType.STRING)//salvara no db como String
	private StatusTitulo status;

public Long getCodigo() {
	return codigo;
}
public void setCodigo(Long codigo) {
	this.codigo = codigo;
}
public String getDescricao() {
	return descricao;
}
public void setDescricao(String descricao) {
	this.descricao = descricao;
}
public Date getDataVencimento() {
	return dataVencimento;
}
public void setDataVencimento(Date dataVencimento) {
	this.dataVencimento = dataVencimento;
}
public BigDecimal getValor() {
	return valor;
}
public void setValor(BigDecimal valor) {
	this.valor = valor;
}
public StatusTitulo getStatus() {
	return status;
}
public void setStatus(StatusTitulo status) {
	this.status = status;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((codigo ==null) ? 0 :codigo.hashCode());
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Titulo other = (Titulo) obj;
	return Objects.equals(codigo, other.codigo);
}

	
}
