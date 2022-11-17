package br.com.desafio.dominio;

import java.time.LocalDate;

public class Program {

	public static void main(String[] args) {
		Curso curso = new Curso();
		curso.setTitulo("curso java");
		curso.setDescricao("descrição curso java");
		curso.setCargaHoraria(8);

		System.out.println(curso);
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("mentoria");
		mentoria.setDescricao("mentoria java");
		mentoria.setData(LocalDate.now());
		
		System.out.println(mentoria);
	}

}
