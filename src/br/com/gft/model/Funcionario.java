package br.com.gft.model;

public class Funcionario {
	private String Nome;
	private int Idade;
	private double Salario;
	public Funcionario(String Nome, int Idade, double Salario) {
		this.Nome=Nome;
		this.Idade=Idade;
		this.Salario=Salario;
	}
	public double getSalario() {
		return Salario;
	}
	public void Bonificacao(double salario) {
		Salario = salario;
	}
	public String getNome() {
		return Nome;
	}
	public int getIdade() {
		return Idade;
	}
}
