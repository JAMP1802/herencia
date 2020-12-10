package com.clearminds.model;

import com.clearminds.excepciones.InstanceException;
import com.clearminds.impl.ServicioPersonaArchivos;
import com.clearminds.interfaces.ServicioPersona;

public class PersonaManager {

	private ServicioPersona serv;
	
	
	public PersonaManager() throws InstanceException {
		try {
			Class<?> clase = Class.forName("com.clearminds.impl.ServicioPersonaBDD");
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
