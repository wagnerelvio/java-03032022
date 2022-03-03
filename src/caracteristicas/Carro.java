package caracteristicas;

public class Carro {
	
	public String marca;
	public String modelo;
	public int numPassageiros;
	public double capacidadeDeCombustivel; // capacidade em litros
	public double consumoDeCombustivel; // consumo em km
	
	
	//Declarar metodo
	public void exibirAutonomia() {
		
		//autonomia
		
		System.out.println("A autonomia do carro é:" + capacidadeDeCombustivel * consumoDeCombustivel + " Km ");
	}

}
