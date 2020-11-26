package POO;

public class Ferrari {

	public static void main(String[] args) {
		Carro Ferrari = new Carro();
		Ferrari.ano = 2020;
		Ferrari.model = "GTX-1500";
		Ferrari.sold = 25000000;
		
		System.out.println("Carro : Ferrari\n" + "Ano : " + Ferrari.ano + "\nModelo : " + Ferrari.model);
		
		Ferrari.ligar();
		Ferrari.acelerar();
		
	}

}
