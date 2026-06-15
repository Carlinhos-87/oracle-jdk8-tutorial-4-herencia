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
@ToString (callSuper = true)
@EqualsAndHashCode (callSuper = true)
@SuperBuilder

public class Empleado extends Persona {

	private BigDecimal salario;
	private Departamento departamento;
	
	
}
