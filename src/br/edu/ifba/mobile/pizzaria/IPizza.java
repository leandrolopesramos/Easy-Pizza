package br.edu.ifba.mobile.pizzaria;

import java.util.List;

public interface IPizza {
	
		public void setInfo(int x);
	
		public List<String> getIngredientes();
		
		public void setPreco(int x);
		
		public double getPreco();
	
}
