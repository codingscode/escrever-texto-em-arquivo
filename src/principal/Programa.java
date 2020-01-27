package principal;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Programa {

	public static void main(String[] args) {
		
		String[] linhas = new String[] {"Bom dia", "Boa tarde", "Boa noite"};
		String caminho = "C:\\Meus Projetos Pessoais\\Java\\Proprio\\Proj27escrevertxt\\textobranco.txt";
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(caminho))) {
			for (String linha : linhas) {
				bw.write(linha);
				bw.newLine();
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
}
