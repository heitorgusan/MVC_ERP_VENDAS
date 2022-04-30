package com.erpfuncionarios.gecola.model;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "funcionarios")
public class FuncionarioModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idFuncionario;
	
	@NotNull
	@Size(min = 2, max = 15)
	private String nomeFuncionario;
	
	@NotNull
	private short idadeFuncionario;
	
	@NotNull
	private double salarioFuncionario;
	
	@NotNull
	@DateTimeFormat(pattern = "yyyy-mm-dd")
	private LocalDate dataNascimentoFuncionario;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataCadastroFuncionario = new java.sql.Date(System.currentTimeMillis());

	public int getIdFuncionario() {
		return idFuncionario;
	}

	public void setIdFuncionario(int idFuncionario) {
		this.idFuncionario = idFuncionario;
	}

	public String getNomeFuncionario() {
		return nomeFuncionario;
	}

	public void setNomeFuncionario(String nomeFuncionario) {
		this.nomeFuncionario = nomeFuncionario;
	}

	public short getIdadeFuncionario() {
		return idadeFuncionario;
	}

	public void setIdadeFuncionario(short idadeFuncionario) {
		this.idadeFuncionario = idadeFuncionario;
	}

	public double getSalarioFuncionario() {
		return salarioFuncionario;
	}

	public void setSalarioFuncionario(double salarioFuncionario) {
		this.salarioFuncionario = salarioFuncionario;
	}

	public LocalDate getDataNascimentoFuncionario() {
		return dataNascimentoFuncionario;
	}

	public void setDataNascimentoFuncionario(LocalDate dataNascimentoFuncionario) {
		this.dataNascimentoFuncionario = dataNascimentoFuncionario;
	}

	public Date getDataCadastroFuncionario() {
		return dataCadastroFuncionario;
	}

	public void setDataCadastroFuncionario(Date dataCadastroFuncionario) {
		this.dataCadastroFuncionario = dataCadastroFuncionario;
	}
		
}