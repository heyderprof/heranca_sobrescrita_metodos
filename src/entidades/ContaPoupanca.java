package entidades;

public class ContaPoupanca extends Conta { //subclasse, é uma extensão da classe conta
	
	// atributos específicos da subclasse
	
	private double taxaJuros;
	
	// construtor com atributos + método super, para utilizar os atributos da superclasse

	public ContaPoupanca(int numero, String nome, double saldo, double taxaJuros) {
		super(numero, nome, saldo);
		this.taxaJuros = taxaJuros;
	}
	
	// Getters e Setters

	public double getTaxaJuros() {
		return taxaJuros;
	}

	public void setTaxaJuros(double taxaJuros) {
		this.taxaJuros = taxaJuros;
	}
	
	public void atualizarSaldo(double valor) {
		saldo = saldo + (saldo * taxaJuros);
				
	}
	
	// Esta classe não sobrescreve o método saque, pois não é necessário implementar nenhuma regra específica.
	// Não há taxa para saques em contas do tipo poupança.
	// Como não há sobrescrita, o método saque da superclasse será invocado ao executar contapoupanca.saque().

}
