package CursinhoJava;

public class Operadores_Log {

	public static void main(String[] args) {
		double i = 100;
		System.out.println("Vejamos algumas operações");
		System.out.println("-------------------------");
		System.out.println("resultado 1 :" + (i + 5));
		System.out.println("resultado 2 :" + (i - 5));
		System.out.println("resultado 3 :" + (i * 5));
		System.out.println("resultado 4 :" + (i / 5));
		System.out.println("resultado 5 :" + (i % 5));
		System.out.println("resultado 6 :" + (i += 5));
		System.out.println("resultado 7 :" + (i -= 5));
		System.out.println("resultado 8 :" + (i *= 5));
		System.out.println("resultado 9 :" + (i /= 5));
		i++;
		System.out.println("resultado 10 :" + i++);
		i--;
		System.out.println("resultado 11 :" + i--);

	}

}
