package com.example;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;




@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
@SuperBuilder


/* Si la clase no participa en la herencia, se anota con la anotacion
 * @Builder, pero si participa en la herencia se anota con @SuperBuilder
 * 
 * Recordar que el patron Builder es un patron factoria, creacional, es
 * decir, que sirve para crear o instanciar objetos sin necesidad de 
 * utilizar el operador new ni tener los constructores explicitamente*/

public class Persona {
	
	private String nombre;
	private String primerApellido;
	private String segundoApellido;
	private Genero genero;
	
	
}
