package com.clearminds.model;

public class Persona {

	private String nombre;
	private int edad;
	private String correo;
	
	public Persona(String nombre, int edad, String correo) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.correo = correo;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", correo=" + correo + "]";
	}
	
	
}
