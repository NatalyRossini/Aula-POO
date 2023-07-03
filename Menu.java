package banco;

import java.util.Scanner;

public class Menu {  // Criado esta classe para "Menu" que será exibido ao usuário.
	
private Scanner sc; 
private Cofrinho cofre;

	public Menu() {
		sc = new Scanner(System.in); 
		cofre = new Cofrinho(); 
	}
	
	public void menuPrincipal() { 
		System.out.println("1 - Adicionar Moeda ");
		System.out.println("2 - Remover Moeda ");
		System.out.println("3 - Listar Moedas ");
		System.out.println("4 - Calcular total convertido para Real ");
		System.out.println("0 - Encerrar ");
		
		String escolhaUsuario = sc.next(); //Permite que usuário digite entre as opções e armazena o resultado na variável.
		
		System.out.println(escolhaUsuario);
		
		switch (escolhaUsuario) { // Estrutura de controle que permite testar o valor da expressão.
		case "0":
			System.out.println("Encerrado!");
			break; 
			
		case "1":  //Adiciona moeda
			System.out.println("Escolha a Moeda: ");
			System.out.println("1 - Real: ");
			System.out.println("2 - Dólar: ");
			System.out.println("3 - Euro: ");
			
			int escolhaDaMoeda = sc.nextInt();
			System.out.println("Digite o valor: ");
			double valorDaMoeda = sc.nextDouble();
			
			Moeda moeda = null; 
			
			if (escolhaDaMoeda == 1) {
				moeda = new Real (valorDaMoeda);
				
			} else if (escolhaDaMoeda == 2) {
				moeda = new Dolar (valorDaMoeda);
				
			} else if (escolhaDaMoeda == 3) {
				
				moeda = new Euro (valorDaMoeda);
			}else {
				System.out.println(" Moeda inválida! ");
				menuPrincipal();
			}
			
			cofre.adicionar(moeda);
			
			menuPrincipal(); 
			break;
		
		case "2": //Remove moeda
			System.out.println("Escolha a Moeda: ");
			System.out.println("1 - Real: ");
			System.out.println("2 - Dólar: ");
			System.out.println("3 - Euro: ");
			
			int removerMoeda = sc.nextInt();
			System.out.println("Digite o valor: ");
			double removeAMoeda = sc.nextDouble();
			
			Moeda moedas = null; 
			
			if (removerMoeda == 1) {
				moedas = new Real (removeAMoeda);
				
			} else if (removerMoeda == 2) {
				moedas = new Dolar (removeAMoeda);
				
			} else if (removerMoeda == 3) {
				
				moedas = new Euro (removeAMoeda);
			}else {
				System.out.println(" Moeda inválida! ");
				menuPrincipal();
			}
			
			cofre.remover(moedas);
			System.out.println();
			System.out.println(" Moeda removida! ");
			System.out.println();
			
			menuPrincipal(); 
			break;
					
			
		case "3": //Lista moedas
			cofre.listagemMoedas();
			menuPrincipal();
			break;
			
		case "4": //Converte moedas dolár e euro para real
			double valorTotalConvertido = cofre.totalConvertido();
			System.out.printf("O valor total convertido para real é: %.2f%n", valorTotalConvertido);
			menuPrincipal();
			break;
				
			
		default: //Será executado se nenhum dos casos correspondentes acima for encontrado. 
			System.out.println("Opção inválida! Escolha entre 1, 2, 3, 4 e 0 ");
			menuPrincipal(); 
			break;
					
			
		}
		
	}
}
