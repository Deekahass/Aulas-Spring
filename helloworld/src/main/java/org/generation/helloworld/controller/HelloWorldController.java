package org.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {
	
	@GetMapping
	public String helloWorld() {
		return "Hello World!!!";
	}
	
	@GetMapping("/bsm")
	public String bsm() {
	    return "BSMs\r\n"
	    	+ "*Atenção para Detalhes\r\n"	
	    	+ "*Comunicação"
	    	+ "*Comunicação não violenta\r\n "
	    	+ "*Mentalidade de Crescimento\r\n "
	        + "*Orientação ao Futuro\r\n"
	        + "*Persistência\r\n"
	        + "*Proatividade\r\n"
	        + "*Responsabilidade Pessoal\r\n"
	        + "*Trabalho em Equipe\r\n" ;      
	}

	@GetMapping("/objetivo")
	public String objetivo() {
		return "BSMs\r\n"
			+ "*Melhorar meu desepenho na comunicação\r\n"
			+ "*Aprender mais sobre o Spring\r\n"
			+ "*Revisar O bloco I nas partes que tenho dúvida\r\n"
			+ "*Reunião sobre o Projeto Integrador\r\n"
			+ "*Treinar meu Pitch e mostra pro meu grupo\r\n"
			+ "*Fazer o Feedback com o grupo";
				
	}
}
