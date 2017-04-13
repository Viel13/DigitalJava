package br.com.fiap.bean;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

import br.com.fiap.entity.Consultor;
import br.com.fiap.exception.WebServiceException;
import br.com.fiap.repository.ConsultorRepository;

@ManagedBean
public class ListaConsultorBean {
private List<Consultor> list;
private ConsultorRepository rep;

@PostConstruct
private void init(){
	rep = new ConsultorRepository();
	
	try {
		list = rep.listar();
	} catch (WebServiceException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}

public List<Consultor> getList() {
	return list;
}

public void setList(List<Consultor> list) {
	this.list = list;
}


}
