package com.erpfuncionarios.gecola.model;

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


@Entity
@Table(name = "clientes")
public class ClienteModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idCliente;
	
	@NotNull
	@Size(min = 2 , max = 15)
	private String nomeCliente;

	@Temporal(TemporalType.TIMESTAMP)
	private Date dataCadastroCliente = new java.sql.Date(System.currentTimeMillis());

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public Date getDataCadastroCliente() {
		return dataCadastroCliente;
	}

	public void setDataCadastroCliente(Date dataCadastroCliente) {
		this.dataCadastroCliente = dataCadastroCliente;
	}

	
}