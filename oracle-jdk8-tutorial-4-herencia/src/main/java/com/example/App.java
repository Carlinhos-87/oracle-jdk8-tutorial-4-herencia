package com.example;

import java.math.BigDecimal;

public class App {
    public static void main(String[] args) {
        
    /* Ya, en este mismo momento se puede crear una instancia, un objeto, empleado, aunque la clase 
     * empleado esta vacia.
     * Pero empleado hereda de persona, y aunque explicitamente no se vea, tanto la clase Persona
     * como la clase Empleado, tienen un constructor por defecto, sin parametros, que dejara de
     * tener cuando se cree otro constructor */	
    	
    	Empleado empleado1 = new Empleado();
    	
    	empleado1.setNombre("Carlos");
    	empleado1.setPrimerApellido("Mtnez");
    	
    	
    /* Si quisieramos crear un empleado que en el mismo momento de su creacion pudiesemos pasarle
     * todas las propiedades de la clase Persona*/
    	
    	//Empleado empleado2 = new Empleado("Elida", "Almonte", "Garcia", Genero.MUJER);
    	
    	/* El objeto anterior que se le asigna a la variable empleado2, no se puede
    	* construir actualmente tal y como fue construido cuando existia el constructor
    	* que recibia los 4 argumentos que recibe este constructor, PERO en su 
    	* lugar tenemos algo mucho, pero mucho, mejor, que es el patron Builder
    	* que nos permite crear/instanciar cualquier objeto aunque no tengamos 
    	* el constructor explicitamente, ademas que se hace innecesario suministrar
    	* los campos de la clase en orden .*/	
    	
    	Empleado empleado2 = Empleado.builder()
				.nombre("Elida")
				.primerApellido("Almonte")
				.segundoApellido("Garcia")
				.genero(Genero.MUJER)
				.salario(new BigDecimal(3500.50))
				.departamento(Departamento.INFORMATICA)
				.build();
    	
    	System.out.println(empleado2);
    	
    	Empleado empleado3 = new Empleado(new BigDecimal(2500.25), Departamento.RRHH);
    	
    	/* Ejercicio # del Viernes 12 de Junio
    	* 
    	* Al empleado3 agregarle como nombre "Miguel Angel", genero HOMBRE. Mostrar
    	* por la consola la informacion del empleado 3 */
    	
    	empleado3.setNombre("Miguel Angel");
    	empleado3.setGenero(Genero.HOMBRE);
    	
    	/*System.out.println("Nombre del empleado: " + empleado3.getNombre() 
    	+ " , con Genero: " + empleado3.getGenero() + ", un Salario de: " 
    	+ empleado3.getSalario() + ", del Departamento: " + empleado3.getDepartamento());*/
    	
    	System.out.println(empleado3.toString());
    	
    	Empleado empleado4 = Empleado.builder()
    			.nombre("Carlos")
    			.primerApellido("Paino")
    			.segundoApellido("Agueda")
    			.genero(Genero.HOMBRE)
    			.salario(new BigDecimal(4500))
    			.departamento(Departamento.INFORMATICA)
				.build();
    	
    	//Mostrar el horario de comida del empleado4
    	
    	empleado4.muestraHorarioDeComida();
    }
    	
    	
}
