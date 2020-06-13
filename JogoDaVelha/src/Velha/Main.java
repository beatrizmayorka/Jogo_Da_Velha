package Velha;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		
		Scanner ler = new Scanner (System.in);
		JV jogo = new JV();
		String posicao;
		int valida = 0, Jogadas = 0;
		
		while(true) {
			System.out.printf(" ===== Jogo da velha ===== \n\n");
			jogo.Mostrar();
			
			//inicia jogador 1
			do {
				
				System.out.print(" --> Jogador 1, Informe uma posicao: ");
				System.out.print("\n");
				
				posicao = ler.next();
				while(!jogo.Valido(posicao)) {
					System.out.printf(" ----- Jogada invalida, tente novamente! ----- ");
					System.out.print(" --> Jogador 1, Informe uma posicao: ");
					System.out.print("\n");
					posicao = ler.next();
					valida = 0;
				}
				jogo.Jogada(posicao, "X");
				valida = 1;
				
			}while(valida == 0); //Fim do jogador 1
			
			Jogadas ++;
			valida = 0;
			jogo.Mostrar();
			if(!jogo.Ganhou(Jogadas).equals("null")) {
				break;
			}
			
			//Inicio do jogador 2
			do {
				
				System.out.print(" --> Jogador 2, Informe uma posicao: ");
				System.out.print("\n");
				
				posicao = ler.next();
				while(!jogo.Valido(posicao)) {
					System.out.printf("Jogada invalida, tente novamente! \n");
					System.out.print(" --> Jogador 2, Informe uma posicao: ");
					System.out.print("\n");
					posicao = ler.next();
					valida = 0;
				}
				jogo.Jogada(posicao, "O");
				valida = 1;
				
			}while(valida == 0);//fim do jogador 2
			
			Jogadas++;
			valida = 0;
			jogo.Mostrar();
			if(!jogo.Ganhou(Jogadas).equals("null")) {
				break;
			}
			
		}
		
		System.out.println(" --> Empate! ");
		
	}

}