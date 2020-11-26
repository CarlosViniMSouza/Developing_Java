package POO;

public class Cessna {
	
	public static void main(String[] args) {
		Aviao cessna = new Aviao();
		cessna.ano = 2010;
		cessna.envergadura = 12;
		cessna.sold = 300000;
		cessna.model = "RTX FX";
		
		System.out.println("Avião : Cessna");
		System.out.println("Ano : " + cessna.ano);
		System.out.println("Envergadura : " + cessna.envergadura);
		System.out.println("Sold : US$" + cessna.sold);
		System.out.println("Modelo : " + cessna.model);
		
		cessna.ligar();
		cessna.acelerar();
		cessna.Aterrisagem();
		cessna.desligar();
	}
}
