package com.example;

public class Persona {
	
	private String nombre;
	private String primerApellido;
	private String segundoApellido;
	private Genero genero;
	
	public Persona() {
		super();
		// TODO Auto-generated constructor stub
		
	}

	public Persona(String nombre, String primerApellido, String segundoApellido, Genero genero) {
		super();
		this.nombre = nombre;
		this.primerApellido = primerApellido;
		this.segundoApellido = segundoApellido;
		this.genero = genero;
	}


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPrimerApellido() {
		return primerApellido;
	}

	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}

	public String getSegundoApellido() {
		return segundoApellido;
	}

	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}
	
	//Metodo que muestra el horario de comida de una persona 
	public void muestraHorarioDeComida() {
		System.out.println("Una persona come entre las 13:00 y las 16:00");
	}
}
