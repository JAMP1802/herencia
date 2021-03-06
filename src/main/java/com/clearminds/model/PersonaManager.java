package com.clearminds.model;

import java.io.FileReader;
import java.util.Properties;

import com.clearminds.excepciones.InstanceException;
import com.clearminds.interfaces.ServicioPersona;

public class PersonaManager {

	private ServicioPersona serv;
	
	public static String leerPropiedad(String propiedad) {
		Properties p = new Properties();
		String valor = null;
		try {			
			p.load(new FileReader("config.properties"));
			valor = p.getProperty(propiedad);
			return valor;
		} catch (Exception e) {
			e.printStackTrace();
			return valor;
		} 
	}
	
	public PersonaManager() throws InstanceException {
		
		Properties p = new Properties();
		String valor = leerPropiedad("servicioPersona");
		
		try {
			p.load(new FileReader("config.properties"));
			valor = p.getProperty("servicioPersona");
			Class<?> clase = Class.forName(valor);
			serv = (ServicioPersona) clase.newInstance();
		} catch (Exception e) {
			e.printStackTrace();
			throw new InstanceException("Error al obtener una instancia de Servicio Persona");
		} 
		
	}
	
	public void insertarPersona(Persona persona){
		serv.insertar(persona);
	}
}
