import java.util.Scanner;

public class Vetores {

	public static void main(String[] args) {
		//Para criar um vetor, tipo nome[]= new tipo[tamanho];
		Scanner leitor = new Scanner(System.in);
		int qtde;
		System.out.println("Digite a quantidade de alunos");
		qtde = leitor.nextInt();

		double alunos[] = new double[qtde];
		double total=0;

		System.out.println("O vetor tem tamanho " + alunos.length);


		for(int i=0; i<alunos.length;i++) {
		System.out.println("Digite o consumo do " + (i+1) + "º aluno");
		alunos[i] = leitor.nextDouble();
		total = total + alunos[i];
		}



		for(int i=0;i<alunos.length;i++) {
		System.out.println("O aluno " + (i+1) + " consumiu R$" + alunos[i]);
		}



		System.out.println("O total de consumo foi de R$" + total);

		leitor.close();
		

	}

}
