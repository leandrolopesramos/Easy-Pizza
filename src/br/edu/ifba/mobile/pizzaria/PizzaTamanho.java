package br.edu.ifba.mobile.pizzaria;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.SessionScoped;

@SessionScoped
public class PizzaTamanho implements IPizza {
	
	private String inf;
	private double preco;
	
	public void setInfo(int tam){
		if (tam == 1)
		this.inf = "-Tamanho: Pequena.";
		
		else if (tam == 2)
		this.inf = "-Tamanho: Média.";
		
		else if (tam == 3)
		this.inf = "-Tamanho: Grande.";
		
		else if (tam == 4)
		this.inf = "-Tamanho: Família.";
		
		else
		this.inf = "-Tamanho: Nenhum.";
	}
	
	public List<String> getIngredientes(){
		List<String> ingredientes = new ArrayList<String>();
		ingredientes.add("Informações da Pizza:");
		ingredientes.add(this.inf);
		return ingredientes;
	}
	
	@Override
	public void setPreco(int tam) {
		if (tam == 1)
			this.preco = 4.50;
			
		else if (tam == 2)
			this.preco = 6.50;
			
		else if (tam == 3)
			this.preco = 8.00;
			
		else if (tam == 4)
			this.preco = 10.00;
	}
	
	public double getPreco(){
		return this.preco;
	}



}
