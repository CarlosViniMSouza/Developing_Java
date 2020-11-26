package CursinhoJava;

public class Condicionais {

	public static void main(String[] args) {
		/**
		 * Testando 'if' 'else' e 'else if'
		 */
		int info = 58;
		if (info < 16) {
			System.out.println("N�o pode votar");
		} else if (18 <= info && info <= 70) {
			System.out.println("Vote � vontade");
		} else {
			System.out.println("Voto Facultativo");
		}
		// Testando o switch no java:
		char bottom = 'A';
		
		switch (bottom) {
		case 'A':
			System.out.println("Bot�o Agenda Ativado");
			break;
			
		case 'B':
			System.out.println("Bot�o Conversa Ativado");
			break;
			
		case 'C':
			System.out.println("Bot�o Desligar Ativado");
			break;

		default:
			break;
		}
		
		for (int a1 = 1; a1 <= 5; a1++) {
			System.out.println(a1);
		}
		
		for (int var1 = 1; var1 <= 10; var1++) {
			System.out.println("\nTabuada do " + var1 + "\n");
			for (int var2 = 1; var2 <= 10; var2++) {
				System.out.println(var1 + "x" + var2 + "=" + var1*var2);
			}
			// temos o do(){}while tbm !
		}
	}

}
