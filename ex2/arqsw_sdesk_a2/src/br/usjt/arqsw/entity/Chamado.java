package br.usjt.arqsw.entity;

import java.io.Serializable;
import java.util.Date;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
/**
 * 
 * @author Accel Gustavo Araújo Rocha - RA:81616654 - SIN3AN-MCA
 *
 */
public class Chamado implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@NotNull(message="O Chamado nÃ£o pode ser vazio")
	@Min(value=1, message="O Chamado nÃ£o pode ser vazio")
	private int id;
	
	@NotNull(message="A descriçÃ£o nÃ£o pode ser vazia")
	@Size(min=5, max=100, message="A descrição deve estar entre 5 e 100 caracteres.")
	private String descricao;
	@NotNull
	private String status;
	@NotNull
	private Date dt_abertura;
	private Date dt_fechamento;
	@NotNull
	private Fila fila;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getDt_abertura() {
		return dt_abertura;
	}

	public void setDt_abertura(Date dt_abertura) {
		this.dt_abertura =dt_abertura;
	}

	public Date getDt_fechamento() {
		return dt_fechamento;
	}

	public void setDt_fechamento(Date dt_fechamento) {
		this.dt_fechamento = dt_fechamento;
	}

	public Fila getFila() {
		return fila;
	}

	public void setFila(Fila fila) {
		this.fila = fila;
	}

}
