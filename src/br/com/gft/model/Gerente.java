package br.com.gft.model;

public class Gerente  extends Funcionario{
	public Gerente(String Nome, int Idade, double Salario) {
		super(Nome,Idade,Salario);
	}
	public void Bonificacao() {
		double total=this.getSalario()+10000.0;
		super.Bonificacao(total);
	}
}
