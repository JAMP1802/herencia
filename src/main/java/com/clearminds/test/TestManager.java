package com.clearminds.test;

import com.clearminds.excepciones.InstanceException;
import com.clearminds.model.Persona;
import com.clearminds.model.PersonaManager;

public class TestManager {

	public static void main(String[] args) {
		PersonaManager personaManager;
		try {
			personaManager = new PersonaManager();
			personaManager.insertarPersona(new Persona("Jonathan", 24, "jonathan@mail.com"));
		} catch (InstanceException e) {
			e.printStackTrace();
		}
		
	}
}
