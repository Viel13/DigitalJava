package br.com.fiap.bean;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import br.com.fiap.entity.Consultor;
import br.com.fiap.exception.WebServiceException;
import br.com.fiap.repository.ConsultorRepository;

@ManagedBean
public class ConsultorBean {

		private Consultor consultor;
		private ConsultorRepository rep;
		
		//metodo de incializacao do bena
		@PostConstruct
		private void init(){
			consultor = new Consultor();
			rep = new ConsultorRepository();
		}
		
		//metodos para o clique do botao
		public void cadastrar(){
			FacesMessage msg;
			try {
				rep.cadastrar(consultor);
				msg = new FacesMessage("Cadastro Realizado!");
			} catch (WebServiceException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				msg = new FacesMessage("Erro fudeu");
			}
			// addiciona a mensagem na tela;
			FacesContext.getCurrentInstance().addMessage(null, msg);
		}
		
		public void listar(){
			try {
				rep.listar();
			} catch (WebServiceException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		public Consultor getConsultor() {
			return consultor;
		}

		public void setConsultor(Consultor consultor) {
			this.consultor = consultor;
		}
	
}
