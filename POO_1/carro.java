package POO_1;

public class carro {
	
	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;
	
	void exibirAutonomia() {
		System.out.println("A autonomia do carro �: "+capCombustivel*consumoCombustivel);
	}
	
	double obterAutonomia() {
		
		System.out.println("M�todo obter autonomia foi chamado.");
		return capCombustivel*consumoCombustivel;
	}
	
	double calcularCombustivel (double km) {
		double qtdCombustivel = km/consumoCombustivel;
		return qtdCombustivel;
	}
	
	

}
