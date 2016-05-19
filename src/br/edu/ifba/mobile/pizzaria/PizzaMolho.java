package br.edu.ifba.mobile.pizzaria;

import java.util.List;

import javax.faces.bean.SessionScoped;

@SessionScoped
public class PizzaMolho implements IPizza{

	private IPizza anterior;
	private String ing; 
	private double preco;
	
	public PizzaMolho (IPizza anterior, int molho){
		this.anterior = anterior;
		this.setInfo(molho);
		this.setPreco(molho);
	}
	
	@Override
	public void setInfo(int molho) {
		if (molho == 1)
			this.ing = "-Molho: Tomate.";
		
		else if (molho == 2)
			this.ing = "-Molho: Rose.";
		
		else if (molho == 3)
			this.ing = "-Molho: Especial.";
		
		else
			this.ing = "-Molho: Nenhuma.";
	}
	
	@Override
	public List<String> getIngredientes() {
		List<String> ingredientes = anterior.getIngredientes();
		ingredientes.add(this.ing);
		return ingredientes;
	}

	@Override
	public void setPreco(int tam) {
		if (tam == 1)
			this.preco = 2.00;
			
		else if (tam == 2)
			this.preco = 3.00;
			
		else if (tam == 3)
			this.preco = 4.00;
			
		else
			this.preco = 0.00;
	}

	@Override
	public double getPreco() {
		return anterior.getPreco() + preco;
	}
	

}
