package br.edu.ifba.mobile.pizzaria;

import java.util.List;

import javax.faces.bean.SessionScoped;

@SessionScoped
public class PizzaIngredientes implements IPizza{

	private IPizza anterior;
	private String inf;
	private double preco;
	
	public PizzaIngredientes (IPizza anterior, int ing){
		this.anterior = anterior;
		this.setInfo(ing);
		this.setPreco(ing);
	}
	@Override
	public void setInfo(int ing) {
		if (ing == 1)
			this.inf = "-Sabor: Atum.";
		
		else if (ing == 2)
			this.inf = "-Sabor: Bacon.";
		
		else if (ing == 3)
			this.inf = "-Sabor: Calabresa.";
		
		else if (ing == 4)
			this.inf = "-Sabor: Camarão.";
		
		else if (ing == 5)
			this.inf = "-Sabor: Carne Seca.";
		
		else if (ing == 6)
			this.inf = "-Sabor: Champingnhon.";
		
		else if (ing == 7)
			this.inf = "-Sabor: Lombo.";
		
		else if (ing == 8)
			this.inf = "-Sabor: Milho.";
		
		else if (ing == 9)
			this.inf = "-Sabor: Presunto.";
		
		else if (ing == 10)
			this.inf = "-Sabor: Frango.";
		
		else if (ing == 11)
			this.inf = "-Sabor: Chocolate.";
		
		else if (ing == 12)
			this.inf = "-Sabor: Banana.";
		
		else if (ing == 13)
			this.inf = "-Sabor: Goiabada.";
		
		else if (ing == 14)
			this.inf = "-Sabor: Romeu e Julieta.";
		
		else
			this.inf = "-Sabor: Nenhum.";	
		
	}
	
	@Override
	public List<String> getIngredientes() {
		List<String> ingredientes = anterior.getIngredientes();
		ingredientes.add(this.inf);
		return ingredientes;
	}

	@Override
	public void setPreco(int ing) {
		if (ing == 1 || ing == 3 || ing == 8 || ing == 9 || ing == 12)
			this.preco = 3.00;
			
		else if (ing == 2 || ing == 10)
			this.preco = 3.50;
		
		else if (ing == 5 || ing == 7 || ing == 11 || ing == 13)
			this.preco = 4.00;
			
		else if (ing == 4 || ing == 6 || ing == 14)
			this.preco = 4.50;
		
		else
			this.preco = 0.00;
		
	}

	@Override
	public double getPreco() {
		return ((anterior.getPreco() + this.preco) + (anterior.getPreco() + this.preco)/10);
	}

}
