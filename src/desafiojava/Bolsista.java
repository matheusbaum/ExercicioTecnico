package desafiojava;

import java.util.ArrayList;
import java.util.List;

public class Bolsista {
	private String nomeBolsista;
	private String cpfBolsista;
	private String entidadeDeEnsino;
	private String mesReferencia;
	private String intanoReferencia;
	private String diretoria;
	private String sgSistema;
	private String cdModalidadeSgb;
	private String dsModalidadePagamento;
	private String moeda;
	private String valorBolsistaPagamento;

	public Bolsista(String nomeBolsista, String cpfBolsista, String entidadeDeEnsino, String mesReferencia,
			String intanoReferencia, String diretoria, String sgSistema, String cdModalidadeSgb,
			String dsModalidadePagamento, String moeda, String bolsistaPagamento) {
		super();
		this.nomeBolsista = nomeBolsista;
		this.cpfBolsista = cpfBolsista;
		this.entidadeDeEnsino = entidadeDeEnsino;
		this.mesReferencia = mesReferencia;
		this.intanoReferencia = intanoReferencia;
		this.diretoria = diretoria;
		this.sgSistema = sgSistema;
		this.cdModalidadeSgb = cdModalidadeSgb;
		this.dsModalidadePagamento = dsModalidadePagamento;
		this.moeda = moeda;
		this.valorBolsistaPagamento = bolsistaPagamento;
	}

	public String getNomeBolsista() {
		return nomeBolsista;
	}

	public void setNomeBolsista(String nomeBolsista) {
		this.nomeBolsista = nomeBolsista;
	}

	public String getCpfBolsista() {
		return cpfBolsista;
	}

	public void setCpfBolsista(String cpfBolsista) {
		this.cpfBolsista = cpfBolsista;
	}

	public String getEntidadeDeEnsino() {
		return entidadeDeEnsino;
	}

	public void setEntidadeDeEnsino(String entidadeDeEnsino) {
		this.entidadeDeEnsino = entidadeDeEnsino;
	}

	public String getMesReferencia() {
		return mesReferencia;
	}

	public void setMesReferencia(String mesReferencia) {
		this.mesReferencia = mesReferencia;
	}

	public String getIntanoReferencia() {
		return intanoReferencia;
	}

	public void setIntanoReferencia(String intanoReferencia) {
		this.intanoReferencia = intanoReferencia;
	}

	public String getDiretoria() {
		return diretoria;
	}

	public void setDiretoria(String diretoria) {
		this.diretoria = diretoria;
	}

	public String getSgSistema() {
		return sgSistema;
	}

	public void setSgSistema(String sgSistema) {
		this.sgSistema = sgSistema;
	}

	public String getCdModalidadeSgb() {
		return cdModalidadeSgb;
	}

	public void setCdModalidadeSgb(String cdModalidadeSgb) {
		this.cdModalidadeSgb = cdModalidadeSgb;
	}

	public String getDsModalidadePagamento() {
		return dsModalidadePagamento;
	}

	public void setDsModalidadePagamento(String dsModalidadePagamento) {
		this.dsModalidadePagamento = dsModalidadePagamento;
	}

	public String getMoeda() {
		return moeda;
	}

	public void setMoeda(String moeda) {
		this.moeda = moeda;
	}

	public String getBolsistaPagamento() {
		return valorBolsistaPagamento;
	}

	public void setBolsistaPagamento(String bolsistaPagamento) {
		this.valorBolsistaPagamento = bolsistaPagamento;
	}

	public String toString() {
		return "Bolsista [nomeBolsista=" + nomeBolsista + ", cpfBolsista=" + cpfBolsista + ", entidadeDeEnsino="
				+ entidadeDeEnsino + ", mesReferencia=" + mesReferencia + ", intanoReferencia=" + intanoReferencia
				+ ", diretoria=" + diretoria + ", sgSistema=" + sgSistema + ", cdModalidadeSgb=" + cdModalidadeSgb
				+ ", dsModalidadePagamento=" + dsModalidadePagamento + ", moeda=" + moeda + ", bolsistaPagamento="
				+ valorBolsistaPagamento + "]";
	}
	
	public String codificarNome() {
		return shuffle(getNomeBolsista());
	}
	
	
	/*Embaralhar os nomes*/
	public String shuffle(String input) {
		List<Character> characters = new ArrayList<Character>();
		for(char c : input.toCharArray()) {
			characters.add(c);
		}
		StringBuilder output = new StringBuilder(input.length());
		while(characters.size() != 0) {
			int rand = (int)(Math.random() * characters.size());
			output.append(characters.remove(rand));
		}
		System.out.println(output.toString());
		
		return output.toString();
	}

}
