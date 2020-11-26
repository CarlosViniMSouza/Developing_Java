package POO;

public class Fusquinha {

	public static void main(String[] args) {
		Carro Fusquinha = new Carro();
		Fusquinha.ano = 1950;
		Fusquinha.model = "Volks 1950";
		Fusquinha.sold = 2500;
		
		System.out.println("Carro : Fusca\n" + "Ano : " + Fusquinha.ano + "\nModelo : " + Fusquinha.model);
		
		Fusquinha.ligar();
		Fusquinha.acelerar();
		Fusquinha.desligar();

	}

}
