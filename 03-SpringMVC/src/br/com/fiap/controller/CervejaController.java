package br.com.fiap.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.fiap.model.Cerveja;

@Controller
@RequestMapping("/cerveja")
public class CervejaController {

	private static List<Cerveja> lista = new ArrayList<>();
	
	@GetMapping("cadastrar")
	public String abrirForm(){
		return "cerveja/cadastro";
	}
	
	@PostMapping("cadastrar")
	public ModelAndView processarForm(Cerveja cerveja){
		lista.add(cerveja);
		ModelAndView retorno = new ModelAndView("cerveja/sucesso");
		retorno.addObject("cerva", cerveja);
		return retorno;
	}
	
	@PostMapping("cadastrar")
	public ModelAndView listarForm(Cerveja cerveja){
		ModelAndView retorno = new ModelAndView("cerveja/listar");
		retorno.addAllObjects()
	}
	
	
}
