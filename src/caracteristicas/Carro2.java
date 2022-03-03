package caracteristicas;

public class Carro2 {

	public String marca;
	public String modelo;
	public int numPassageiros;
	public double capacidadeDeCombustivel; // capacidade em litros
	public double consumoDeCombustivel; // consumo em km

	// Declarar metodo
	public double exibirAutonomia() {
		
		System.out.println("Metodo Obeter autonomia foi chamado: ");
		
		return capacidadeDeCombustivel * consumoDeCombustivel;

	}

}
