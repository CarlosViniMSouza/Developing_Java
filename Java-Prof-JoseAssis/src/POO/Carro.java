package POO;

import java.util.Random;

public class Carro {
	int ano;
	String model;
	double sold;
	
	public Carro() {
		Random num_ale = new Random();
		int chassi = num_ale.nextInt(10000);
		System.out.println("Chassi : " + chassi);
	}
	
	void ligar() {
		System.out.println("engine LIGAR");
	}
	
	void desligar() {
		System.out.println("engine DESLIGAR");
	}
	
	void reiniciar() {
		System.out.println("engine REINICIAR");
	}
	
	void acelerar() {
		System.out.println("engine ACELERAR");
	}
}
