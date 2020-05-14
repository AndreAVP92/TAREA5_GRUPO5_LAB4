package negociolmpl;

import dao.PersonaDao;
import daolmpl.PersonaDaolmpl;
import entidad.Persona;
import negocio.PersonaNegocio;

public class PersonaNegociolmpl implements PersonaNegocio {
	
	PersonaDao pdao = new PersonaDaolmpl();
	@Override
	public boolean insert(Persona persona) {
		
		boolean estado=false;
		if(persona.getNombre().trim().length()>0 && persona.getApellido().trim().length()>0 && persona.getDni().trim().length()>0)
		{
			estado=pdao.insert(persona);
		}
		return estado;
	}
}
