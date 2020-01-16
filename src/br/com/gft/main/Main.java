package br.com.gft.main;

import java.util.ArrayList;
import java.util.List;

import br.com.gft.model.Gerente;
import br.com.gft.model.Pessoa;
import br.com.gft.model.Supervisor;
import br.com.gft.model.Vendedor;

public class Main {
	public static void main(String[] args) {
		//-------------------QUEST�O 1-------------------
		Pessoa p1=new Pessoa("Jo�o",15);
		Pessoa p2=new Pessoa("Leandro",21);
		Pessoa p3=new Pessoa("Paulo",17);
		Pessoa p4=new Pessoa("Jessica",18);
		List<Pessoa> listapessoas=new ArrayList<>();
		listapessoas.add(p1);
		listapessoas.add(p2);
		listapessoas.add(p3);
		listapessoas.add(p4);
		
		Pessoa pessoa=new Pessoa();
		pessoa.MaiorIdade(listapessoas);
		//-------------------QUEST�O 2-------------------
		pessoa.listaMaiorDeIdade(listapessoas);
		//-------------------QUEST�O 3-------------------
		List<Pessoa> listapessoas1=new ArrayList<>();
		listapessoas1.add(p2);
		listapessoas1.add(p4);
		pessoa.existeJessica(listapessoas);
		pessoa.existeJessica(listapessoas1);
		//-------------------QUEST�O 4-------------------
		Gerente gerente=new Gerente("Sheikah",30,10000);
		Supervisor supervisor=new Supervisor("Kokiris",26,10000);
		Vendedor vendedor=new Vendedor("Goros",25,10000);
		gerente.Bonificacao();
		supervisor.Bonificacao();
		vendedor.Bonificacao();
		System.out.println("O sal�rio do "+gerente.getNome()+" � de "+gerente.getSalario());
		System.out.println("O sal�rio do "+supervisor.getNome()+" � de "+supervisor.getSalario());
		System.out.println("O sal�rio do "+vendedor.getNome()+" � de "+vendedor.getSalario());
	}
}
