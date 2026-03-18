package br.com.douglas.desafioAluraJava005.Main;

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		MensagemBoasVindas("Praticando Java: variáveis e tipos");
		MenuDeOpcoes();

	}

	public static void MensagemBoasVindas(String titulo) {
		try {
			LimparTerminal();
		} catch (IOException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(
			      "╭━━━╮╱╱╱╱╱╱╱╱╱╱╱╱╱╭╮╱╱╱╱╱╭╮╱╱╱╱╱╱╱╱╱╱╱╭╮╱╱╱╭━━━┳╮╱╱╱╱╱╱╱╱╭╮\n"
				+ "┃╭━╮┃╱╱╱╱╱╱╱╱╱╱╱╱╱┃┃╱╱╱╱╱┃┃╱╱╱╱╱╱╱╱╱╱╱┃┃╱╱╱┃╭━╮┃┃╱╱╱╱╱╱╱╱┃┃\n"
				+ "┃┃╱╰╋╮╭┳━┳━━┳━━╮╭━╯┣━━╮╱╱┃┣━━┳╮╭┳━━╮╭━╯┣━━╮┃┃╱┃┃┃╭╮╭┳━┳━━┫┃\n"
				+ "┃┃╱╭┫┃┃┃╭┫━━┫╭╮┃┃╭╮┃┃━┫╭╮┃┃╭╮┃╰╯┃╭╮┃┃╭╮┃╭╮┃┃╰━╯┃┃┃┃┃┃╭┫╭╮┣╯\n"
				+ "┃╰━╯┃╰╯┃┃┣━━┃╰╯┃┃╰╯┃┃━┫┃╰╯┃╭╮┣╮╭┫╭╮┃┃╰╯┃╭╮┃┃╭━╮┃╰┫╰╯┃┃┃╭╮┣╮\n"
				+ "╰━━━┻━━┻╯╰━━┻━━╯╰━━┻━━╯╰━━┻╯╰╯╰╯╰╯╰╯╰━━┻╯╰╯╰╯╱╰┻━┻━━┻╯╰╯╰┻╯");
		System.out.println("\n" + titulo);
		
	}
	
	public static void LimparTerminal() throws IOException, InterruptedException{
		new ProcessBuilder("clear").inheritIO().start().waitFor();
	}
	
	public static void VoltarAoMenu() {
		
		Scanner leitura = new Scanner(System.in);
		System.out.print("\nDigite uma tecla para voltar ao menu...");
		leitura.nextLine();
		main(new String[] {});
	}

	public static void MenuDeOpcoes() {
		
		int exercicio = 0;

		do {
			System.out.println("\nSelecione um exercico abaixo:\n");

			System.out.println("1.  Declarando Valores e Variáveis.");
			System.out.println("2.  Conversão de Tipos");
			System.out.println("3.  Primitivos em Ação");
			System.out.println("4.  Converção de Temperatura");
			System.out.println("5.  Cadastro de Livros");
			System.out.println("6.  Classificação por Categoria");
			System.out.println("7.  Par ou Impar");
			System.out.println("8.  Conversor de Moeda");
			System.out.println("9.  Verificação de Idade e Escopo de Variáveis");
			System.out.println("10. Planejando uma Viagem: Consumo e Autonomia");
			
			
			System.out.println("\n0.  Encerrar o Programa");
			
			System.out.print("\nOpção Desejada: ");
			Scanner leitura = new Scanner(System.in);
			exercicio = leitura.nextInt();

			switch (exercicio) {
			case 0:
				break;
			case 1:
				DeclarandoValoresVariaveis();
				break;
			case 2:
				ConversaoDeTipos();
				break;
			case 3:
				PrimitosEmAção();
				break;
			case 4:
				ConvercaoDeTemperatura();
				break;
			case 5:
				CadastroDeLivros();
				break;
			case 6:
				ClassificacaoPorCategoria();
				break;
			case 7:
				ParOuImpar();
				break;
			case 8:
				ConversorDeMoeda();
				break;
			case 9:
				VerificacaoDeIdadeEscopoDeVariaveis();
				break;
			case 10:
				PlanejandoUmaViagemConsumoAutonomia();
				break;
			default:
				System.out.println("Opção invalida tente novamente!");
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		} while (exercicio < 0 || exercicio > 10);
	}
	
	// Declarando Valores e Variáveis
	public static void DeclarandoValoresVariaveis() {
		
		MensagemBoasVindas("EXERCICIO: Declarando Valores e Variáveis");
		
		String nome = "Maria";
		int idade = 25;
		double altura = 1.68;
		boolean estudante = true;
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Altura: " + altura);
		System.out.println("É estudante: " + estudante);
		
		VoltarAoMenu();

	}

	// Conversão de Tipos
	public static void ConversaoDeTipos() {
		
		MensagemBoasVindas("EXERCICIO: Conversão de Tipos");
		
		double valorDouble = 19.5;
		int valorInt = (int) valorDouble;
		System.out.println("O valor inteiro do produto é: " + valorInt);
		
		VoltarAoMenu();

	}

	// Primitivos em Ação
	public static void PrimitosEmAção() {
		
		MensagemBoasVindas("EXERCICIO: Primitivos em Ação");
		
		double nota1 = 7.5;
		double nota2 = 8.0;
		double nota3 = 9.0;

		double media = (nota1 + nota2 + nota3) / 3;

		System.out.println("A média das notas é: " + media);
		
		VoltarAoMenu();

	}

	// Converção de Temperatura
	public static void ConvercaoDeTemperatura() {
		
		MensagemBoasVindas("EXERCICIO: Converção de Temperatura");
		
		int celsius = 20;

		double fahrenheit = (celsius * 9 / 5.0) + 32;

		System.out.println("A temperatura em graus fahrenheit é: " + fahrenheit);
		
		VoltarAoMenu();

	}

	// Cadastro de Livros
	public static void CadastroDeLivros() {
		
		MensagemBoasVindas("EXERCICIO: Cadastro de Livros");
		
		String titulo = "O Pequeno Príncipe";
		String autor = "Antoine de Saint-Exupéry";
		int paginas = 96;
		double preco = 39.9;
		char categoria = 'F';

		String categoriaDescricao;

		if (categoria == 'F') {
			categoriaDescricao = "Ficção";
		} else if (categoria == 'N') {
			categoriaDescricao = "Não Ficção";
		} else if (categoria == 'T') {
			categoriaDescricao = "Tecnologia";
		} else if (categoria == 'H') {
			categoriaDescricao = "História";
		} else {
			categoriaDescricao = "Categoria Invalida";
		}

		System.out.println("Livro cadastrado: \"" + titulo + "\", de " + autor + ". Ele possui " + paginas
				+ " páginas, e custa R$" + preco + " e pertence à categoria " + categoriaDescricao);
	
		VoltarAoMenu();
		
	}

	// Classificação por Categoria
	public static void ClassificacaoPorCategoria() {
		
		MensagemBoasVindas("EXERCICIO: Classificação por Categoria");
		
		double preco = 150;

		if (preco <= 50) {
			System.out.println("Categoria de Produto: Econômico");
		} else if (preco > 50 && preco <= 200) {
			System.out.println("Categoria de Produto: Intermediário");
		} else {
			System.out.println("Categoria de Produto: Premium");
		}
		
		VoltarAoMenu();
		
	}

	// Par ou Impart
	public static void ParOuImpar() {
		
		MensagemBoasVindas("EXERCICIO: Par ou Impart");
		
		int numero = 7;

		if (numero % 2 == 0) {
			System.out.println("O número é par");
		} else {
			System.out.println("O número é impar");
		}
		
		VoltarAoMenu();
	}

	// Conversor de Moeda
	public static void ConversorDeMoeda() {
		
		MensagemBoasVindas("EXERCICIO: Conversor de Moeda");
		
		double valorReais = 451.50;
		double taxaCambio = 5.25;
		double valorDolar = valorReais / taxaCambio;

		System.out.println("O valor em dolar é: US$" + valorDolar);
		
		VoltarAoMenu();
	}

	// Verificação de idade e escopo de variáveis
	public static void VerificacaoDeIdadeEscopoDeVariaveis() {
		
		MensagemBoasVindas("EXERCICIO: Verificação de idade e escopo de variáveis");
		
		int idade = 17;
		String mensagem = "";
		
		if (idade >= 18) {
			mensagem = "Você é maior de idade.";
		} else {
			mensagem = "Você é menor de idade.";
		}

		System.out.println(mensagem);
		
		VoltarAoMenu();
	}
	
	// Planejando uma Viagem: Consumo e Autonomia
	public static void PlanejandoUmaViagemConsumoAutonomia() {
		
		MensagemBoasVindas("EXERCICIO: Planejando uma Viagem: Consumo e Autonomia");
		
		double consumoMedio = 12.5;
		double capacidadeTamqueEmLitros = 50;
		double combustivelAtualEmLitros = 20;
		double distanciaDaViavelEmKilometros = 200;
		
		double autonomiaMaxima = capacidadeTamqueEmLitros * consumoMedio;
		double autonomiaAtual = combustivelAtualEmLitros * consumoMedio;
		String CompletarViagemMensagem = "";
		
		if (distanciaDaViavelEmKilometros <= autonomiaAtual) {
			CompletarViagemMensagem = "Você conseguirá completar a viagem sem precisar abastecer";
		} else {
			CompletarViagemMensagem = "Você não conseguirá completar a viagem sem precisar abastecer";
		}
		
		System.out.println("Autonomia máxima do veículo: " + autonomiaMaxima + " km");
		System.out.println("Autonomia atual: " + autonomiaAtual + " km");
		System.out.println(CompletarViagemMensagem);
		
		VoltarAoMenu();
		
	}
}
