package presentacion.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import negocio.PersonaNegocio;
import presentacion.vista.PanelModificarPersonas;
import presentacion.vista.PanelAgregarPersonas;
import presentacion.vista.VentanaPrincipal;
import entidad.Persona;

public class Controlador implements ActionListener
{

	private VentanaPrincipal ventanaPrincipal;
	private PanelModificarPersonas pnlModificarPersonas;
	private PersonaNegocio pNeg;
	private ArrayList<Persona> personasEnTabla;
	private PanelAgregarPersonas pnlIngresoPersonas;
	
		//Constructor
	
		public Controlador(VentanaPrincipal vista, PersonaNegocio pNeg)
		{
			this.ventanaPrincipal = vista;
			this.pNeg = pNeg;
	
			//Instancio los paneles
			this.pnlIngresoPersonas = new PanelAgregarPersonas();
			this.pnlModificarPersonas = new PanelModificarPersonas();
			
	
			//Eventos menu del Frame principal llamado Ventana
		//	this.ventanaPrincipal.getMenuAgregar().addActionListener(a->EventoClickMenu_AbrirPanel_AgregarPersona(a));
		//	this.ventanaPrincipal.getMenuModificar().addActionListener(a->EventoClickMenu_AbrirPanel_ModificarPersona(a));
			

		}
		
		//EventoClickMenu abrir PanelAgregarPersonas
		public void  EventoClickMenu_AbrirPanel_AgregarPersona(ActionEvent a)
		{		
			ventanaPrincipal.getContentPane().removeAll();
			ventanaPrincipal.getContentPane().add(pnlIngresoPersonas);
			ventanaPrincipal.getContentPane().repaint();
			ventanaPrincipal.getContentPane().revalidate();
		}
		
		//Evento abrir el PanelModificarPersona
		public void  EventoClickMenu_AbrirPanel_ModificarPersona(ActionEvent a)
		{		
			ventanaPrincipal.getContentPane().removeAll();
			ventanaPrincipal.getContentPane().add(pnlModificarPersonas);
			ventanaPrincipal.getContentPane().repaint();
			ventanaPrincipal.getContentPane().revalidate();
		}
		
		//EventoClickBoton modificar persona en PanelModificarPersonas
		private void EventoClickBoton_ModificarPesona_PanelModificarPersonas(ActionEvent a) {
			
			String nombre = this.pnlModificarPersonas.getTxtNombre().getText();
			String apellido = this.pnlModificarPersonas.getTxtApellido().getText();
			String dni = this.pnlModificarPersonas.getTxtDni().getText();
			Persona nuevaPersona = new Persona(dni,nombre,apellido);
			
			boolean estado = pNeg.update(nuevaPersona);
			String mensaje;
			if(estado==true)
			{
				mensaje="Persona modificada con exito";
				this.pnlModificarPersonas.getTxtNombre().setText("");
				this.pnlModificarPersonas.getTxtApellido().setText("");
				this.pnlModificarPersonas.getTxtDni().setText("");
			}
			else
				mensaje="Persona no agregada, complete todos los campos";
			
			this.pnlModificarPersonas.mostrarMensaje(mensaje);
		//	this.refrescarTabla();
		}
		
		public void inicializar()
		{
			this.ventanaPrincipal.setVisible(true);
		}
		
		
		@Override
		public void actionPerformed(ActionEvent e) { }
		
}
