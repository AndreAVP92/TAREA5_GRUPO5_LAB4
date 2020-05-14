package presentacion.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import java.util.ArrayList;
import negocio.PersonaNegocio;
import presentacion.vista.VentanaPrincipal;
import entidad.Persona;

public class Controlador implements ActionListener
{
		private VentanaPrincipal ventanaPrincipal;
		private PersonaNegocio pNeg;
//		private ArrayList<Persona> personasEnTabla;
		
		public Controlador(VentanaPrincipal vista, PersonaNegocio pNeg)
		{
			this.ventanaPrincipal = vista;
			this.pNeg = pNeg;
			this.ventanaPrincipal.getBtnAgregar().addActionListener(a->ventanaAgregarPersona(a));
//			this.ventanaPrincipal.getBtnBorrar().addActionListener(s->borrarPersona(s));
		}
		
		
		private void ventanaAgregarPersona(ActionEvent a) {
			String nombre = ventanaPrincipal.getTxtNombre().getText();
			String apellido = ventanaPrincipal.getTxtApellido().getText();
			String dni = ventanaPrincipal.getTxtDni().getText();
			Persona nuevaPersona = new Persona(nombre, apellido, dni);
			
			boolean estado = pNeg.insert(nuevaPersona);
			String mensaje;
			if(estado==true)
			{
				mensaje="Persona agregada con exito";
				ventanaPrincipal.getTxtNombre().setText("");
				ventanaPrincipal.getTxtApellido().setText("");
				ventanaPrincipal.getTxtDni().setText("");
			}
			else
				mensaje="Persona no agregada, complete todos los campos";
			
			this.ventanaPrincipal.mostrarMensaje(mensaje);
//			this.refrescarTabla();
		
		}

		public void inicializar()
		{
//			this.refrescarTabla();
			this.ventanaPrincipal.show();
		}
		
		@Override
		public void actionPerformed(ActionEvent e) { }
		
}
