package com.ipartek.formacion.util;

public enum TipoCurso {
	PROGRACION("Cursos de progracion"),OFIMATICA("Cursos de ofimatica"),DESIGN("Cursos de dise�o grafico");
	
	private String descripcion;
	
	TipoCurso(String descripcion){
		this.descripcion = descripcion;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
}
