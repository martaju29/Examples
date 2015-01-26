package com.hello;

import com.person.Persona;

public class HelloWorld {
	
	
	
	public static void main(String[] args){
		System.out.println("Hello,  World");
		
		Persona persona = new Persona();
		persona.setNombre("Andrew");
		persona.setApellido("Woods");
		persona.setEdad(30);
		
		System.out.println("I'm " + persona.getNombre() + " " + persona.getApellido()+", " + persona.getEdad());
	}

}
