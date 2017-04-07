package br.com.fiap.bean;

import javax.faces.bean.ManagedBean;
@ManagedBean

public class LoginBean {
private String login;
private String senha;






public LoginBean(String login, String senha) {
	super();
	this.login = login;
	this.senha = senha;
}

public LoginBean(){}

public String getLogin() {
	return login;
}

public void setLogin(String login) {
	this.login = login;
}

public String getSenha() {
	return senha;
}

public void setSenha(String senha) {
	this.senha = senha;
}

public void logar(){
	System.out.println(login + " " + senha);
}


}
