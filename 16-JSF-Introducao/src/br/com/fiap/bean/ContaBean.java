package br.com.fiap.bean;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class ContaBean {
private int n1;
private int n2;

public int getN1() {
	return n1;
}
public void setN1(int n1) {
	this.n1 = n1;
}
public int getN2() {
	return n2;
}
public void setN2(int n2) {
	this.n2 = n2;
}

public void calculo(){
	int total = n1 * n2;
	System.out.println(String.valueOf(total));
	
}


}
