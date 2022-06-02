package Pratica6;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;


public class questao1 {

	public static void main(String[] args) throws IOException {
		Scanner entrance = new Scanner(System.in);
		
		int opcao;
		int i = 0;
		String nomeArquivo = "", caminho;
		
		do
	     {
		
			System.out.println("Selecione uma das opcao abaixo: \n" + "1 - Definir caminho e nome de Arquivo TXT para gravação\n" + "2 - Cadastrar Projeto\n" + "3 - Abrir Arquivo do Projeto\n" + "4 - Sair");
			opcao = entrance.nextInt();
			
			
			switch (opcao) {
				case 1:
					System.out.println("Digite o nome e caminho do arquivo para gravação");
					nomeArquivo = entrance.next();
					System.out.println("Digite o caminho do arquivo para gravação");
					caminho = entrance.next();
					
	                break;
	                
				case 2: 
					ManipuladorArquivo.escritor(nomeArquivo);
	                break;
	                 
				case 3: 
					ManipuladorArquivo.leitor(nomeArquivo);
					break;
					
				case 4:
	                break;
					
				default:
					System.out.println("Opcao invalid!");  
					
			}
	     } while (i!=4);

	}

}
