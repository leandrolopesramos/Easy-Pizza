package br.edu.ifba.mobile.pizzaria;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "login") 
public class Login {

	private String username;
    private String password;
 
    public String getNome() {
        return "Login Easy Pizza:";
    }
    
    public String getUsername() {
        return username;
    }
 
    public void setUsername(String username) {
		System.out.println("Pizza usuario setado");
        this.username = username;
    }
 
    public String getPassword() {
        return password;
    }
 
    public void setPassword(String password) {
		System.out.println("Pizza senha setada");
        this.password = password;
    }   
    
    public String login() {
        String log = null;
        
        if(username != null && username.equals("wesley_safadaum") && password != null && password.equals("ciroc")) {
            log = "menu.bsi";
        } else {
            log = "login.bsi";
        }    
        
        username=null;
        return log;
    }  
}
