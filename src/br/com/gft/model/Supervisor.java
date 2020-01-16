package br.com.gft.model;

public class Supervisor extends Funcionario{
	public Supervisor(String Nome, int Idade, double Salario) {
		super(Nome,Idade,Salario);
	}
	public void Bonificacao() {
		double total=this.getSalario()+5000.0;
		super.Bonificacao(total);
	}
}
