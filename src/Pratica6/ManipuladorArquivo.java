package Pratica6;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Scanner;

public class ManipuladorArquivo {

	public static void leitor(String path) throws IOException {
		BufferedReader buffRead = new BufferedReader(new FileReader(path));
		String linha = "";
		while (true) {
			if (linha != null) {
				System.out.println(linha);

			} else
				break;
			linha = buffRead.readLine();
		}
		buffRead.close();
	}

	public static void escritor(String path) throws IOException {
		Scanner entrance = new Scanner(System.in);
		
		ArrayList<String> projetoSocial = new ArrayList();
		
		String título, objetivo, endereço, dataInício, status;
		
		BufferedWriter escrever = new BufferedWriter(new FileWriter(path));
		
		System.out.println("Digite o título: ");
		título = entrance.next();
		System.out.println("Digite o objetivo: ");
		objetivo = entrance.next();
		System.out.println("Digite a data de início: ");
		dataInício = entrance.next();
		System.out.println("Digite a data de status: ");
		status = entrance.next();
		
		projetoSocial.add(título+";"+objetivo+";"+dataInício+";"+status);
	
		escrever.append(projetoSocial + "\n");
		escrever.close();
		System.out.println("Cadastro realizado com Sucesso");
		
	}

}
