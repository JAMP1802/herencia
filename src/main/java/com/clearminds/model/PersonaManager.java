package com.clearminds.model;

import com.clearminds.impl.ServicioPersonaArchivos;
import com.clearminds.impl.ServicioPersonaBDD;
import com.clearminds.interfaces.ServicioPersona;

public class PersonaManager {

	private ServicioPersona serv;
	
	public PersonaManager() {
		serv = new ServicioPersonaBDD();
	}
	
	public void insertarPersona(Persona persona){
		serv = new ServicioPersonaArchivos();
		serv.insertar(persona);
	}
}
