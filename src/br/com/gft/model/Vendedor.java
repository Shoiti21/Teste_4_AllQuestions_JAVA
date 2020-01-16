package br.com.gft.model;

public class Vendedor  extends Funcionario {
	public Vendedor(String Nome, int Idade, double Salario) {
		super(Nome,Idade,Salario);
	}
	public void Bonificacao() {
		double total=this.getSalario()+3000.0;
		super.Bonificacao(total);
	}
}
