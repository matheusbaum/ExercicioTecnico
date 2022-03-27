package desafiojava;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class App {
	public static void main(String[] args) throws Exception {
		int op;
		StringBuilder sb = new StringBuilder();
		sb.append("Digite uma opção:\n");
		sb.append("1 - Consulta do bolsista zero do ano requerido.\n");
		sb.append("2 - Codificação nomes dos bolsistas.\n");
		sb.append("3 - Consulta da média anual requerida.\n");
		sb.append("4 - Listar as três bolsas mais altas e as três mais baixas.\n");
		sb.append("5 - Terminar Programa.\n");

		do {
			op = Integer.parseInt(JOptionPane.showInputDialog(sb));
			Metodos metodo = new Metodos();
			File arquivo = new File("src/desafiojava/bolsistas.csv");
			Scanner leitor = new Scanner(arquivo);

			List<Bolsista> listasBolsistas = new ArrayList<Bolsista>();

			while (leitor.hasNext()) {
				/* Pegando os atributos da linha do arquivo csv */
				String[] atributos = leitor.nextLine().split(";");

				Bolsista bolsista = new Bolsista(atributos[0], atributos[1], atributos[2], atributos[3], atributos[4],
						atributos[5], atributos[6], atributos[7], atributos[8], atributos[9], atributos[10]);

				listasBolsistas.add(bolsista);
			}

			leitor.close();

			/* Consulta do bolsista zero do ano requerido. */
			if (op == 1) {
				int anoConsulta = Integer.parseInt(JOptionPane.showInputDialog("Digite o Ano para a consulta: "));
				JOptionPane.showMessageDialog(null,
						"O bolsista zero é: " + metodo.mostrarBolsaZeroAno(anoConsulta, listasBolsistas));
				continue;
			}

			/* Codificação nomes dos bolsistas */
			if (op == 2) {
				JOptionPane.showMessageDialog(null, metodo.retornarNomeEmbaralhado(listasBolsistas));
			}

			/* Consulta da média anual requerida */
			if (op == 3) {
				int anoConsulta = Integer.parseInt(JOptionPane.showInputDialog("Digite o Ano para a consulta: "));
				JOptionPane.showMessageDialog(null,
						"A média do ano consultado é: " + metodo.consultarMediaAnual(anoConsulta, listasBolsistas));
			}

			/* Listar as três bolsas mais altas e as três mais baixas */
			if (op == 4) {
				metodo.ranquearAlunos(listasBolsistas);
				JOptionPane.showMessageDialog(null, metodo.ranquearAlunos(listasBolsistas));
				System.out.println(metodo.ranquearAlunos(listasBolsistas));
			}
			
			if (op == 5) {
				break;
			}

		} while (op == 5);

	}

}
