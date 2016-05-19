package br.edu.ifba.mobile.pizzaria;

import java.util.List;

public class PizzaCondimentos implements IPizza{

	private IPizza anterior;
	private String inf;
	private double preco;
	
	public PizzaCondimentos (IPizza anterior, int cond){
		this.anterior = anterior;
		this.setInfo(cond);
		this.setPreco(cond);
	}
	

	@Override
	public void setInfo(int cond) {
		if (cond == 1)
			this.inf = "-Condimentos: Azeitona.";
		
		else if (cond == 2)
			this.inf = "-Condimentos: Cebola.";
		
		else if (cond == 3)
			this.inf = "-Condimentos: Oregano.";
		
		else if (cond == 4)
			this.inf = "-Condimentos: Pimenta.";
		
		else if (cond == 5)
			this.inf = "-Condimentos: Palmito.";
		
		else if (cond == 6)
			this.inf = "-Condimentos: Tomates.";
		
		else
			this.inf = "-Condimentos: Nenhum.";
	}

	@Override
	public List<String> getIngredientes() {
		List<String> ingredientes = anterior.getIngredientes();
		ingredientes.add(this.inf);
		return ingredientes;
	}

	@Override
	public void setPreco(int cond) {
		if (cond == 1 || cond == 3)
			this.preco = 2.00;
			
		else if (cond == 2 || cond == 6)
			this.preco = 2.50;
			
		else if (cond == 4 || cond == 5)
			this.preco = 3.00;
		
		else
			this.preco = 0.00;
		
	}


	@Override
	public double getPreco() {
		return anterior.getPreco() + this.preco;
	}

}
