package desafiojava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Metodos {

	public String mostrarBolsaZeroAno(int anoConsulta, List<Bolsista> listaBolsista) {
		String bolsistaZero = "";

		for (Bolsista bolsista : listaBolsista) {
			if (bolsista.getIntanoReferencia().equals("AN_REFERENCIA")) {
				continue;
			}
			if (Integer.parseInt(bolsista.getIntanoReferencia()) == anoConsulta) {
				bolsistaZero = bolsista.getNomeBolsista() + " " + bolsista.getCpfBolsista() + " "
						+ bolsista.getEntidadeDeEnsino() + " " + bolsista.getBolsistaPagamento();
				break;
			}
		}

		return bolsistaZero;
	}
	
	public float consultarMediaAnual(int anoConsulta, List<Bolsista> listaBolsista) {
		int alunos = 0;
		float mediaAnual = 0;

		for (Bolsista bolsista : listaBolsista) {
			if (bolsista.getIntanoReferencia().equals("AN_REFERENCIA")) {
				continue;
			}
			if (Integer.parseInt(bolsista.getIntanoReferencia()) == anoConsulta) {
				mediaAnual += Float.parseFloat(bolsista.getBolsistaPagamento());
				alunos++;
			}
		}

		return mediaAnual / alunos;
	}

	public String ranquearAlunos(List<Bolsista> listaBolsistas) {
		List<Float> notas = new ArrayList<Float>();

		for (Bolsista bolsista : listaBolsistas) {
			if (bolsista.getBolsistaPagamento().equals("VL_BOLSISTA_PAGAMENTO")) {
				continue;
			}
			System.out.println("passei");
			notas.add(Float.parseFloat(bolsista.getBolsistaPagamento()));
		}

		Collections.sort(notas, Collections.reverseOrder());
		String notasAltas = " ";

		for (int i = 0; i < 3; i++) {
			if (i > 0) {
				notasAltas = notasAltas + ", " + notas.get(i);
			} else {
				notasAltas = notas.get(i).toString();
			}

		}

		Collections.sort(notas);

		String notasBaixas = " ";

		for (int i = 0; i < 3; i++) {
			if (i > 0) {
				notasBaixas = notasBaixas + ", " + notas.get(i);
			} else {
				notasBaixas = notas.get(i).toString();
			}

		}

		System.out.println(notas);
		return "Os Maiores valores são: " + notasAltas + ". Os Menores valores são: " + notasBaixas;
	}
	
	public String retornarNomeEmbaralhado(List<Bolsista> listasBolsistas) {
		Bolsista bolsistaum = listasBolsistas.get(0);
		
		return bolsistaum.codificarNome();
	}

}
