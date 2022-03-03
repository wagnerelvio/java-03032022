package tipo;

import caracteristicas.Carro;

public class Automovel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Carro van = new Carro();
		
		
		van.marca = "Gol";
		van.modelo = "Gol-2022";
		van.numPassageiros = 4;
		van.capacidadeDeCombustivel = 40;
		van.consumoDeCombustivel = 16;
		
		van.exibirAutonomia();
		

		//System.out.print(van.exibirAutonomia);
		
		
		System.out.printf("Os dados do automovel 01 são: \n\n"
				+ " - Marca: %s\n"
				+ " - Modelo: %s\n"
				+ " - Num. Passageiros: %d\n"
				+ " - Capacidade de Combustivel: %s\n "
				+ " - Consumo de Combustivel: %s ",
				van.marca, van.modelo, van.numPassageiros, van.capacidadeDeCombustivel,van.consumoDeCombustivel );
	

	}

}
