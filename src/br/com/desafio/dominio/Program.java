package br.com.desafio.dominio;

import java.time.LocalDate;

public class Program {

	public static void main(String[] args) {
		Bootcamp bootcamp = new Bootcamp();
		
		Curso curso1 = new Curso("curso java", "descricao curso java", 3);
		Curso curso2 = new Curso("curso js", "descricao curso js", 4);
		Mentoria mentoria = new Mentoria("mentoria de java", "descrição mentoria java", LocalDate.now());
		
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descrição Bootcamp Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		Dev devCristian = new Dev();
		devCristian.setNome("Cristian");
		devCristian.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos Inscritos" + devCristian.getConteudosInscritos());
		devCristian.progredir();
		System.out.println("Conteudos Concluidos" + devCristian.getConteudosConcluidos());
		
		
		Dev devCamila = new Dev();
		devCamila.setNome("Camila");
		devCamila.inscreverBootcamp(bootcamp);
		devCamila.progredir();
		System.out.println("Conteudos Inscritos" + devCamila.getConteudosInscritos());
		System.out.println("Conteudos Concluidos" + devCamila.getConteudosConcluidos());
	}

}
