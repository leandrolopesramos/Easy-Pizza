package br.edu.ifba.mobile.pizzaria;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "montarPizza")
@SessionScoped
public class MontarPizza {
	private static List<String> tamanho = new ArrayList<String>();
	private static List<String> molho = new ArrayList<String>();
	private static List<String> queijo = new ArrayList<String>();
	private static List<String> condimentos = new ArrayList<String>();
	private static List<String> ingredientes = new ArrayList<String>();	
	private IPizza pizza = new PizzaTamanho();
	
	static {
		tamanho.add("Pequeno");
		tamanho.add("Medio");
		tamanho.add("Grande");
		tamanho.add("Familia");
		
		molho.add("Tomate");
		molho.add("Rose");
		molho.add("Especial");
		molho.add("Nenhum");
		
		queijo.add("Catupiry");
		queijo.add("Parmesão");
		queijo.add("Mussarela");
		queijo.add("Cheddar");
		queijo.add("Gorgonzola");
		queijo.add("Nenhum");
		
		condimentos.add("Azeitona");
		condimentos.add("Cebola");
		condimentos.add("Oregano");
		condimentos.add("Pimenta");
		condimentos.add("Palmito");
		condimentos.add("Tomate");
		
		ingredientes.add("Atum");
		ingredientes.add("Bacon");
		ingredientes.add("Calabresa");
		ingredientes.add("Camarão");
		ingredientes.add("Carne Seca");
		ingredientes.add("Champingnhon");
		ingredientes.add("Lombo");
		ingredientes.add("Milho");
		ingredientes.add("Presunto");
		ingredientes.add("Frango");
		ingredientes.add("Chocolate");
		ingredientes.add("Banana");
		ingredientes.add("Goiabada");
		ingredientes.add("Romeu e Julieta");
	}
	
	public String getNome(){
		return "Montar Pizza:";
	}
	
	public String getTamanho(int numero) {
		return tamanho.get(numero - 1);
	}
	
	public String getMolho(int numero) {
		return molho.get(numero - 1);
	}

	public String getQueijo(int numero) {
		return queijo.get(numero - 1);
	}
	
	public String getCondimento(int numero) {
		return condimentos.get(numero - 1);
	}

	public String getIngrediente(int numero) {
		return ingredientes.get(numero - 1);
	}

	public String decoraTamanho(int tamanho){
		this.pizza.setInfo(tamanho);
		this.pizza.setPreco(tamanho);
		return "molho.bsi";
	}
	
	public String decoraMolho(int mol){
		this.pizza = new PizzaMolho(this.pizza,mol);
		return "queijo.bsi";
	}
	
	public String decoraQueijo(int queijo){
		this.pizza = new PizzaQueijo(this.pizza,queijo);
		return "condimentos.bsi";
	}
		
	public String decoraCondimento(int cond){
		this.pizza = new PizzaCondimentos(this.pizza,cond);
		return "ingredientes.bsi";
	}
		
	public String decoraIngrediente(int ing){
		this.pizza = new PizzaIngredientes(this.pizza,ing);	
		impPizza();
		return "fPedido.bsi";
	}
	
	public String getPizza(){
		String p = " ";
		for(int i = 0;i<6;i++){ 
		     p = p.concat(this.pizza.getIngredientes().get(i));    
		} 
		return p;
	}
	
	public void impPizza(){
		for(int i = 0;i<6;i++){ 
		     System.out.println(this.pizza.getIngredientes().get(i));    
		}  
	}
	
	public double getTotal(){
		return this.pizza.getPreco();
	}
}
