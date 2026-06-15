/* Herencia: 
 * 
 * Es el mecanismo principal de Java para la reutilizacion del
 * codigo.
 * 
 * Es un mecanismo mediante el cual una clase hereda todos los elementos
 * que son publicos de otra clase, excepto los constructores que no
 * se heredan
 * 
 * Todas las clases heredan de la clase Object, pero una clase solamente
 * puede heredar de otra, no de mas de una a la vez, porque Java, a 
 * diferencia de lenguajes como C++ no permite la herencia multiple de 
 * clases.
 * 
 * Y como en la naturaleza una clase puede heredar propiedades y metodos 
 * de sus ancestros y puede mejorar alguno de los elementos que ha 
 * heredado */

package com.example;

import java.math.BigDecimal;

public class Empleado extends Persona {

	private BigDecimal salario;
	private Departamento departamento;
	
	public Empleado() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Empleado(String nombre, String primerApellido, String segundoApellido, Genero genero) {
		super(nombre, primerApellido, segundoApellido, genero);
		// TODO Auto-generated constructor stub
	}
	
	public Empleado(BigDecimal salario, Departamento departamento) {
		super();
		this.salario = salario;
		this.departamento = departamento;
	}
	
	/*Generar un constructor que permita instanciar un empleado con los campos de Persona
	 * y los propios de Empleado*/
	
	public Empleado(String nombre, String primerApellido, String segundoApellido, Genero genero, BigDecimal salario,
			Departamento departamento) {
		super(nombre, primerApellido, segundoApellido, genero);
		this.salario = salario;
		this.departamento = departamento;
	}

	public BigDecimal getSalario() {
		return salario;
	}

	
	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	@Override
	public String toString() {
		return "Empleado [salario=" + salario + ", departamento=" + departamento + ", getNombre()=" + getNombre()
				+ ", getPrimerApellido()=" + getPrimerApellido() + ", getSegundoApellido()=" + getSegundoApellido()
				+ ", getGenero()=" + getGenero() + "]";
	}

	@Override
	public void muestraHorarioDeComida() {
		// TODO Auto-generated method stub
		System.out.println("Un empleado come entre las 14:00 y las 15:30 horas");
	}

	
	
}
