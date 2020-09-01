package eds;

import java.util.Scanner;

public class CiclosRepetitivos {

	public static void main(String[] args) {
		
		//while
		
		int cont = 0;
		
		while(cont < 4) {
			System.out.println("valor do contador: " + cont);
			cont++;
		}
		
		System.out.println("---------------------");
		//do while
		int cont2 = 0;
		do {
			System.out.println("valor do contador2: " + cont2);
			cont2++;
		}while(cont2 < 4);
		
		
		
		System.out.println("ciclo for---------------------");
		//for
		int i;
		for (i = 0; i < 4; i++) {
			System.out.println("valor do i: " + i);
		}
		
		System.out.println("ciclo for comdecremento---------------------");
		for (i = 3; i >= 0; i--) {
			System.out.println("valor do i: " + i);
		}
		
		//break e continue
		System.out.println("break---------------------");
		for (i = 0; i < 10; i++) {
			if(i == 5) {
				break;
			}
			System.out.println(i);
		}
		
		System.out.println("continue---------------------");
		for (i = 0; i < 10; i++) {
			if(i == 5) {
				continue;
			}
			System.out.println(i);
		}
		
		//entrada de dados de usuario.
		System.out.println("entrada de dados de usuario---------------------");
		Scanner entr = new Scanner(System.in);//criação do objeto para a entrada
		
		//System.out.println("Digite alguma coisa...");
		//String msg = entr.nextLine();
		
		//System.out.println("mensagem digitada: " + msg);
		
		
		//exercício: criar um menu de operações matematica
		String opcao;
		int opint;
		String valor1, valor2;
		
		do {
			System.out.println("**** MENU ******");
			System.out.println("Digite: 0 - sair; 1 - somar, 2 - multiplicar");
			opcao = entr.nextLine();
			switch(opcao) {
				case "0":
					break;
				case "1":
					System.out.println("operação de soma selecionada");
					System.out.println("digite o primeiro valor");
					valor1 = entr.nextLine();
					System.out.println("digite o segundo valor");
					valor2 = entr.nextLine();
					System.out.println("resultado é: " + (Integer.parseInt(valor1) + Integer.parseInt(valor2)));
					break;
				case "2":
					System.out.println("operação de multiplicação selecionada");
					break;
				default:
					System.out.println("opção não valida");
					break;
			}
		}while(!opcao.equals("0"));
		
		System.out.println("programa finalizado!!");

	}

}
