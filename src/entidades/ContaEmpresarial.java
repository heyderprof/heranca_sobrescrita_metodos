package entidades;


public class ContaEmpresarial extends Conta { //subclasse, é uma extensão da classe conta

	
	// atributos específicos da subclasse
	
	private double limiteEmprestimo;
	private String cnpj;
	

	// construtor com atributos + método super, para utilizar os atributos da superclasse
	
	public ContaEmpresarial(int numero, String nome, double saldo, double limiteEmprestimo, String cnpj) {
		super(numero, nome, saldo);
		this.limiteEmprestimo = limiteEmprestimo;
		this.cnpj = cnpj;
	}
	
	// Getters e Setters

	public double getLimiteEmprestimo() {
		return limiteEmprestimo;
	}


	public void setLimiteEmprestimo(double limiteEmprestimo) {
		this.limiteEmprestimo = limiteEmprestimo;
	}


	public String getCnpj() {
		return cnpj;
	}


	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public void emprestimo (double valor) {
		saldo = saldo + valor;
	}
	
	// Método saque sendo sobrescrito, para implementar uma regra de negócio específico desta subclasse
	// Regra: Taxa de 10.00 para cada saque
	
	@Override
	public void saque (double valor) {
		saldo = ((saldo - valor) - 10);
	}
	
	// Polimorfismo em tempo de execução (Sobrescrita de métodos): 
	// Quando uma classe filha sobrescreve um método da classe pai, 
	// permitindo que o comportamento seja definido na classe específica.

	

}