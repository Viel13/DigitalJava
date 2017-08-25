package br.com.fiap.bean;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

import org.primefaces.model.chart.AxisType;
import org.primefaces.model.chart.CategoryAxis;
import org.primefaces.model.chart.LineChartModel;
import org.primefaces.model.chart.LineChartSeries;
import org.primefaces.model.chart.PieChartModel;

import br.com.fiap.bo.ClienteBO;

@ManagedBean
public class GraficoBean {

	private PieChartModel pizza;
	private LineChartModel linha;
	private ClienteBO bo;
	
	@PostConstruct
	private void init(){
		pizza = new PieChartModel();
		bo = new ClienteBO();
		pizza.set("�timo", bo.contarPorRating(5) 
						+ bo.contarPorRating(4));
		pizza.set("Regular", bo.contarPorRating(3));
		pizza.set("Ruim", bo.contarPorRating(1) 
						+ bo.contarPorRating(2));
		pizza.setShowDataLabels(true);
		pizza.setLegendPosition("e");
		
		//Carregar as informa��es do gr�fico de linha
		linha = new LineChartModel();
		linha.setLegendPosition("e");
		linha.getAxes().put(AxisType.X, new CategoryAxis("Mes"));
		
		LineChartSeries serie = new LineChartSeries();
		serie.setLabel("Cliente");
		for (int i =1; i<=12; i++){
			serie.set(i, bo.contarPorMes(i));
		}
		
		linha.addSeries(serie);
	}

	public PieChartModel getPizza() {
		return pizza;
	}

	public void setPizza(PieChartModel pizza) {
		this.pizza = pizza;
	}

	public LineChartModel getLinha() {
		return linha;
	}

	public void setLinha(LineChartModel linha) {
		this.linha = linha;
	}
	
}
