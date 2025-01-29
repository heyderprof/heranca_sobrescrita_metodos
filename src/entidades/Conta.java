package entidades;

public class Conta { // Superclasse conta

	protected int numero; // atributos com visibilidade "protected" para que possam ser acessados pelas subclasses
	protected String nome;
	protected double saldo;

	
	public Conta() { // construtor padrão vazio

	}



	public Conta(int numero, String nome, double saldo) { // construtor com atributos

		this.numero = numero;
		this.nome = nome;
		this.saldo = saldo;

	}

	// Getters e Setters

	public int getNumero() {
		return numero;

	}


	public void setNumero(int numero) {
		this.numero = numero;

	}


	public String getNome() {
		return nome;

	}


	public void setNome(String nome) {
		this.nome = nome;

	}


	public double getSaldo() {
		return saldo;

	}

	

	public void saque(double valor) { // método de saque padrão
		saldo = saldo - valor;

	}

	
	public void deposito (double valor) { // método de depósito padrão
		saldo = saldo + valor;

	}
	
	// Caso não sejam sobrescritos pelas subclasses, os métodos a serem executados serão os "padrão",
	// conforme definidos na superclasse.


}