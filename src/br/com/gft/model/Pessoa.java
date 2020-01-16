package br.com.gft.model;

import java.util.List;

public class Pessoa {
	private String Nome;
	private int Idade;
	public Pessoa(String Nome, int Idade) {
		this.Nome=Nome;
		this.Idade=Idade;
	}
	public Pessoa() {}
	public void MaiorIdade(List<Pessoa> pessoaMaior) {
		int soma=0;
		String nomepessoa = null;
		for (Pessoa pessoa : pessoaMaior) {
			if(pessoa.Idade>soma) {
				nomepessoa=pessoa.Nome;
				soma=pessoa.Idade;
			}
		}
		System.out.println("A pessoa mais velha é "+nomepessoa+" com idade de "+soma);
	}
	public void listaMaiorDeIdade(List<Pessoa> listPessoa) {
		int soma=0;
		for (Pessoa pessoa : listPessoa) {
			soma++;
		}
		System.out.println("ANTES:");
		System.out.println("Quantidade de pessoas = "+soma);
		soma=0;
		for (Pessoa pessoa : listPessoa) {
			if(pessoa.Idade<18) {
				soma++;
			}
		}
		System.out.println("DEPOIS:");
		System.out.println("Quantidade de pessoas = "+soma);
	}
	public void existeJessica(List<Pessoa> listPessoa) {
		boolean jessica=false;
		for (Pessoa pessoa : listPessoa) {
			if(pessoa.Nome=="Jessica") {
				jessica=true;
			}
		}
		if(jessica==true) {
			System.out.println("LISTA:");
			System.out.println("Existe Jessica!");
		}
	}
}
