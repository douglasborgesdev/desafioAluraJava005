package br.com.douglas.desafioAluraJava005.Main;

public class Main {

	public static void main(String[] args) {

		System.out.println("-------------------------------------------\n");

		System.out.println("Declarando Valores e Variáveis.");
		DeclarandoValoresVariaveis();

		System.out.println("\n-------------------------------------------\n");

		System.out.println("Conversão de Tipos");
		ConversaoDeTipos();

		System.out.println("\n-------------------------------------------\n");

		System.out.println("Primitivos em Ação");
		PrimitosEmAção();

		System.out.println("\n-------------------------------------------\n");

		System.out.println("Converção de Temperatura");
		ConvercaoDeTemperatura();

		System.out.println("\n-------------------------------------------\n");

		System.out.println("Cadastro de Livros");
		CadastroDeLivros();

		System.out.println("\n-------------------------------------------\n");

		System.out.println("Classificação por Categoria");
		ClassificacaoPorCategoria();

		System.out.println("\n-------------------------------------------\n");

		System.out.println("Par ou Impar");
		ParOuImpar();

		System.out.println("\n-------------------------------------------\n");

		System.out.println("Conversor de Moeda");
		ConversorDeMoeda();
		
		System.out.println("\n-------------------------------------------\n");

		System.out.println("Verificação de Idade e Escopo de Variáveis");
		VerificacaoDeIdadeEscopoDeVariaveis();
		
		System.out.println("\n-------------------------------------------\n");

		System.out.println("Planejando uma Viagem: Consumo e Autonomia");
		PlanejandoUmaViagemConsumoAutonomia();
	}

	// Declarando Valores e Variáveis
	public static void DeclarandoValoresVariaveis() {
		String nome = "Maria";
		int idade = 25;
		double altura = 1.68;
		boolean estudante = true;
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Altura: " + altura);
		System.out.println("É estudante: " + estudante);

	}

	// Conversão de Tipos
	public static void ConversaoDeTipos() {
		double valorDouble = 19.5;
		int valorInt = (int) valorDouble;
		System.out.println("O valor inteiro do produto é: " + valorInt);

	}

	// Primitivos em Ação
	public static void PrimitosEmAção() {
		double nota1 = 7.5;
		double nota2 = 8.0;
		double nota3 = 9.0;

		double media = (nota1 + nota2 + nota3) / 3;

		System.out.println("A média das notas é: " + media);

	}

	// Converção de Temperatura
	public static void ConvercaoDeTemperatura() {
		int celsius = 20;

		double fahrenheit = (celsius * 9 / 5.0) + 32;

		System.out.println("A temperatura em graus fahrenheit é: " + fahrenheit);

	}

	// Cadastro de Livros
	public static void CadastroDeLivros() {
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
	}

	// Classificação por Categoria
	public static void ClassificacaoPorCategoria() {
		double preco = 150;

		if (preco <= 50) {
			System.out.println("Categoria de Produto: Econômico");
		} else if (preco > 50 && preco <= 200) {
			System.out.println("Categoria de Produto: Intermediário");
		} else {
			System.out.println("Categoria de Produto: Premium");
		}
	}

	// Par ou Impart
	public static void ParOuImpar() {
		int numero = 7;

		if (numero % 2 == 0) {
			System.out.println("O número é par");
		} else {
			System.out.println("O número é impar");
		}
	}

	// Conversor de Moeda
	public static void ConversorDeMoeda() {
		double valorReais = 451.50;
		double taxaCambio = 5.25;
		double valorDolar = valorReais / taxaCambio;

		System.out.println("O valor em dolar é: US$" + valorDolar);
	}

	// Verificação de idade e escopo de variáveis
	public static void VerificacaoDeIdadeEscopoDeVariaveis() {
		int idade = 17;
		String mensagem = "";
		
		if (idade >= 18) {
			mensagem = "Você é maior de idade.";
		} else {
			mensagem = "Você é menor de idade.";
		}

		System.out.println(mensagem);
	}
	
	// Planejando uma Viagem: Consumo e Autonomia
	public static void PlanejandoUmaViagemConsumoAutonomia() {
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
	}
}
