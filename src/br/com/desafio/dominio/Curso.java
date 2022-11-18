package br.com.desafio.dominio;

public class Curso extends Conteudo {
	
	private int cargaHoraria;
	

	
	public Curso(String titulo, String descricao, int cargaHoraria) {
		super(titulo, descricao);
		this.cargaHoraria = cargaHoraria;
	}


	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	@Override
	public String toString() {
		return "Curso [titulo=" + titulo + ", descricao=" + descricao + ", cargaHoraria=" + cargaHoraria + "]";
	}

	@Override
	public double calcularXp() {
		return XP_PADRAO * cargaHoraria;
	}

	
}
