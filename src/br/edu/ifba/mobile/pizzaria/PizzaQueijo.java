package br.edu.ifba.mobile.pizzaria;

import java.util.List;

import javax.faces.bean.SessionScoped;

@SessionScoped
public class PizzaQueijo implements IPizza{

	private IPizza anterior;
	private String inf; /* Molho selecionado na Aplicacao */
	private double preco;
	
	public PizzaQueijo (IPizza anterior, int qjo){
		this.anterior = anterior;
		this.setInfo(qjo);
		this.setPreco(qjo);
	}
	

	@Override
	public void setInfo(int qjo) {
		if (qjo == 1)
			this.inf = "-Queijo: Catupiry.";
		
		else if (qjo == 2)
			this.inf = "-Queijo: Parmesão.";
		
		else if (qjo == 3)
			this.inf = "-Queijo: Mussarela.";
		
		else if (qjo == 4)
			this.inf = "-Queijo: Cheddar.";
		
		else if (qjo == 5)
			this.inf = "-Queijo: Gorgonzola.";
		
		else
			this.inf = "-Queijo: Nenhum.";		
	}
	
	@Override
	public List<String> getIngredientes() {
		List<String> ingredientes = anterior.getIngredientes();
		ingredientes.add(this.inf);
		return ingredientes;
	}

	@Override
	public void setPreco(int qjo) {
		if (qjo == 1 || qjo == 3)
			this.preco = 3.00;
			
		else if (qjo == 2)
			this.preco = 2.50;
		
		else if (qjo == 4 || qjo == 5)
			this.preco = 3.50;
			
		else
			this.preco = 0.00;
		
	}
	
	@Override
	public double getPreco() {
		return anterior.getPreco() + this.preco;
	}

}
