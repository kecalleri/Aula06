import java.util.Random;

public class Exercicio3Vetores {
	
	// 3. Faça um algoritmo que gere aleatoriamente através de um laço de repetição PARA um vetor de 50 elementos inteiros (entre 0 - 9), calcule e exiba:
		//	• A quantidade de números entre 3 e 7;
		//	• Quantidade de números pares;
		//	• A quantidade de números menores que 3;
		//	• Quantidade de números ímpares.
		//	Obs.: O vetor com os 50 elementos deve ser impresso na tela também.//

	public static void main(String[] args) {
		
		int aleatorios[] = new int[50];
		Random gerador = new Random();
		//PREENCHENDO COM ALEATÓRIOS
		for(int i=0; i<aleatorios.length;i++) {
		//gerador.nextInt(); gera um número inteiro entre 0 e um anterior ao que está entre parênteses
		aleatorios[i] = gerador.nextInt(10);
		}
		for(int i=0; i<aleatorios.length;i++) {
		System.out.println(aleatorios[i]);
		}
					
		
	}

}
