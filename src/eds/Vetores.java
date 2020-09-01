package eds;

public class Vetores {

	public static void main(String[] args) {
		
		//declaração de um vetor sem inicialização
		int[] vetor1 = new int[5]; 
		
		String[] vetor2 = new String[10];// vetor para stringpalavras
		
		//adicionando valores ao vetor
		vetor1[0] = 20; //colocando un valor inteiro na posição zero do vetor1
		vetor1[1] = 12;
		vetor1[2] = 30;
		vetor1[3] = 10;
		vetor1[4] = 60;
		
		vetor2[0] = "um";
		
		//imprimindo os valores do vetor
		System.out.println(vetor1[0]);
		System.out.println(vetor1[1]);
		System.out.println(vetor1[2]);
		System.out.println(vetor1[3]);
		System.out.println(vetor1[4]);
		
		System.out.println(vetor2[0]);
		System.out.println(vetor2[4]);//posição sem dado é null
		
		//declaração de um vetor com inicialização de dados
		int[] vetor3 = {15, 35};
				
		vetor3[1] = 40;
		
		System.out.println(vetor3[0]);
		System.out.println(vetor3[1]);
		
		
		//consultar o tamnaho do vetor
		int n_vetor3 = vetor3.length;
		
		System.out.println("tamanho vetor2: " + vetor2.length);
		System.out.println("tamanho do vetor3: " + n_vetor3);
		
		
		
		//automatizando com cliclos repetitivos
		//usando for
		int[] vetor4 = new int[10];
		
		//ciclo para preenchimento do vetor
		for(int i = 0; i < vetor4.length; i++) {  // i = 1                       0, 1, 2, 3, 4, 5... 9
			vetor4[i] = i;
		}
		
		//ciclo para imprimir os valore do vetor
		for (int i = 0; i < vetor4.length; i++) {
			System.out.print(vetor4[i] + " ");
		}
		
		System.out.println(" ");
		
		for (int i = vetor4.length - 1; i >= 0; i--) { 
			System.out.print(vetor4[i] + " ");
		}
		
		//tarefa
		//criear um vetor para valores inteiros de tamanho 10. Preencher olvetor usando ciclo for. Calculem a soma de todos os valores
		//que estão no vetor, usando for.
		
		
	}
}
