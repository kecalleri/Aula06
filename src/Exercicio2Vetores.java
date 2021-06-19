import java.util.Scanner;

public class Exercicio2Vetores {
	
	/*O professor Wuni Jim Yensonal precisa de um programa para ajudar com um problema simples: para uma turma com 50 alunos precisa calcular a média da sala e descobrir quais são os alunos que precisarão de um atendimento personalizado. O fluxo do programa deve ser o seguinte: 
	*/
	    public static void main(String[] args) {
	        Scanner leitor = new Scanner(System.in);
	        double notas[] = new double[3];
	        String nomes[] = new String[3];
	        double media=0;
	        //A. Digitar as 50 notas em um vetor e, para cada nota digitada, digitar o nome do aluno correspondente em outro vetor
	        for(int i=0;i<notas.length;i++) {
	            System.out.println("Por favor digite o nome do aluno " + (i+1));
	            nomes[i] = leitor.nextLine(); //Pode usar o next!!!
	            System.out.println("Por favor digite a nota do aluno " + (i+1));
	            notas[i] = leitor.nextDouble();
	            leitor.nextLine();//Como estamos usando o nextLine na linha 16, precisamos do nosso POG para tirar o "ENTER" do buffer
	        }
	        //B. Calcular a média das notas digitadas
	        //Para calcular a média, sugiro fazer um loop para ir somando as notas e fora do loop dividir pela quantidade de notas ;)
	        for(int i=0;i<notas.length;i++) {
	            media = media + notas[i];
	        }
	        media = media / notas.length;
	        System.out.println("\n\nA média da turma é " + media);
	        //C. Para cada uma das notas que foi digitada e ficou abaixo da média, exibir uma mensagem que diga “Chamar o aluno para conversar
	        //Para essa etapa, sugiro percorrer o vetor, olhando cada uma das posições e comparando com a média. Se for menor, exibir a mensagem.
	        for(int i=0;i<notas.length;i++) {
	            if (notas[i] < media) {
	                System.out.println("O(a) aluno(a) " + nomes[i] + " tirou nota " + notas[i] + ", e está abaixo da média. Chamar para conversar");
	            }
	        }
	        leitor.close();
	    }
}
