package tipo;

import caracteristicas.Carro2;

//import caracteristicas.Carro2;

public class Automovel2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Carro2 van = new Carro2();

		van.marca = "Gol";
		van.modelo = "Gol-2022";
		van.numPassageiros = 4;
		van.capacidadeDeCombustivel = 40;
		van.consumoDeCombustivel = 16;

		//van.exibirAutonomia();

     	van.exibirAutonomia();
     	
     	
     	double autonomia = van.exibirAutonomia();
     			System.out.println(autonomia);
		
		//System.out.println("A autonomia do carro é: " + van.capacidadeDeCombustivel * van.consumoDeCombustivel);

		//System.out.println(van.exibirAutonomia);

		/*
		 * System.out.printf("Os dados do automovel 01 são: \n\n" + " - Marca: %s\n" +
		 * " - Modelo: %s\n" + " - Num. Passageiros: %d\n" +
		 * " - Capacidade de Combustivel: %s\n " + " - Consumo de Combustivel: %s ",
		 * van.marca, van.modelo, van.numPassageiros,
		 * van.capacidadeDeCombustivel,van.consumoDeCombustivel );
		 */

	}

}
