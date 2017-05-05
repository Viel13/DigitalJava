package br.com.fiap.bean;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import br.com.fiap.bo.ConsultorBO;
import br.com.fiap.entity.Consultor;
import br.com.fiap.exception.DBException;

@ManagedBean
public class ConsultorBean {

	private Consultor consultor;

	private ConsultorBO bo;
	
	
	
	@PostConstruct //
	private void init(){
		consultor = new Consultor();
		bo = new ConsultorBO();
		
	}
	
	
	
	public Consultor getConsultor() {
		return consultor;
	}

	public void setConsultor(Consultor consultor) {
		this.consultor = consultor;
	}
	
	public void cadastrar(){
		FacesMessage msg;
		try {
			bo.cadastrar(consultor);
			msg = new FacesMessage("Cadastrado com sucesso");
			msg.setSeverity(FacesMessage.SEVERITY_INFO);
		} catch (DBException e) {
			e.printStackTrace();
			msg = new FacesMessage("cago");
			msg.setSeverity(FacesMessage.SEVERITY_ERROR);
		}
		FacesContext.getCurrentInstance().addMessage(null, msg);
	}
}
