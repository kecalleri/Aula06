import java.util.Scanner;

public class Exercicio1Vetores {
// 1. Fa�a um programa que permita ao usu�rio digitar 30 atividades que ele realizou no dia. Ao final, o programa deve possibilitar que o usu�rio escolha se quer exibir as atividades na ordem em que digitou ou em ordem reversa.
	public static void main(String[] args) {
		String atividades[] = new String[3];
        Scanner leitor = new Scanner(System.in);
        int ordem;
        //Para digitar as atividades, vamos usar um for
        for(int i=0; i<atividades.length;i++) {
            System.out.println("Por favor, insira a " + (i+1) + "� atividade realizada hoje");
            atividades[i] = leitor.nextLine();
        }
        System.out.println("Voc� deseja exibir as atividades na ordem de digita��o ou em ordem reversa?\n1-ORDEM 2-ORDEM INVERSA");
        ordem = leitor.nextInt();
        switch(ordem) {
        case 1:
            //Em ordem
            for(int i=0;i<atividades.length;i++) {
                System.out.println(atividades[i]);
            }
            break;
        case 2:
            //Inversa
            for(int i=atividades.length-1; i>=0;i--) {
                System.out.println(atividades[i]);
            }
            break;
        default:
            System.out.println("Op��o inv�lida");
            break;
            
      
        }
        
        leitor.close();
		
	}

}
