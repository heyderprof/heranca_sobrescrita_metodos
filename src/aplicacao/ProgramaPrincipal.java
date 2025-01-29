package aplicacao;

import entidades.ContaEmpresarial;
import entidades.ContaPoupanca;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		
		// instanciando 2 objetos, c1 e c2, um de cada sublcasse
		
		ContaPoupanca c1 = new ContaPoupanca(1000, "Maria João da Silva", 1000, 0.33);
		ContaEmpresarial c2 = new ContaEmpresarial(1000, "IFMS", 1000, 10000, "00.000.000/0001-00");

		// executado o método de saque para ambos os objetos
		
		c1.saque(100); // poupanca
		c2.saque(100); // empresarial
		
		// exibindo saldo das contas após o saque
		// é possível notar a diferença nos valores
		// em c1.saque, foi cobrada a taxa de 10.00, 
		// comprovando a sobrescrita do método saque.
		
		System.out.println(c1.getSaldo());
		System.out.println(c2.getSaldo());
		
		
		
	}

}
