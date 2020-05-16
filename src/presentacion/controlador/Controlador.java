package presentacion.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import negocio.PersonaNegocio;
import presentacion.vista.PanelAgregarPersonas;
//import presentacion.vista.PanelEliminarPersonas;
import presentacion.vista.PanelModificarPersonas;
import presentacion.vista.VentanaPrincipal;
import entidad.Persona;

public class Controlador implements ActionListener
{

	private VentanaPrincipal ventanaPrincipal;
	private PersonaNegocio pNeg;
	private ArrayList<Persona> personasEnTabla;
	private PanelAgregarPersonas pnlIngresoPersonas;
	//private PanelEliminarPersonas pnlEliminarPersonas;
	private PanelModificarPersonas pnlModificarPersonas;
	
		//Constructor
		public Controlador(VentanaPrincipal vista, PersonaNegocio pNeg)
		{
			this.ventanaPrincipal = vista;
			this.pNeg = pNeg;
			
			
			//Instancio los paneles
			this.pnlIngresoPersonas = new PanelAgregarPersonas();
		//	this.pnlEliminarPersonas = new PanelEliminarPersonas();
			this.pnlModificarPersonas = new PanelModificarPersonas();
			
			//Eventos menu del Frame principal llamado Ventana
			this.ventanaPrincipal.getMenuAgregar().addActionListener(a->EventoClickMenu_AbrirPanel_AgregarPersona(a));
	//		this.ventanaPrincipal.getMenuEliminar().addActionListener(a->EventoClickMenu_AbrirPanel_EliminarPersona(a));
			this.ventanaPrincipal.getMenuModificar().addActionListener(a->EventoClickMenu_AbrirPanel_ModificarPersona(a));
		}
		
		//EventoClickMenu abrir PanelAgregarPersonas
		public void  EventoClickMenu_AbrirPanel_AgregarPersona(ActionEvent a)
		{		
			ventanaPrincipal.getContentPane().removeAll();
			ventanaPrincipal.getContentPane().add(pnlIngresoPersonas);
			ventanaPrincipal.getContentPane().repaint();
			ventanaPrincipal.getContentPane().revalidate();
		}
		
		private void EventoClickBoton_AgregarPesona_PanelAgregarPersonas(ActionEvent a) {
			
			//TERMINAR FUNCION
		
		}
		
		//EventoClickMenu abrir PanelEliminarPersonas
	/*	public void EventoClickMenu_AbrirPanel_EliminarPersona(ActionEvent a)
		{		
			ventanaPrincipal.getContentPane().removeAll();
			ventanaPrincipal.getContentPane().add(pnlEliminarPersonas);
			ventanaPrincipal.getContentPane().repaint();
			ventanaPrincipal.getContentPane().revalidate();
		} */
		
		//EventoClickMenu abrir PanelModificarPersonas
		public void EventoClickMenu_AbrirPanel_ModificarPersona(ActionEvent a)
		{		
			ventanaPrincipal.getContentPane().removeAll();
			ventanaPrincipal.getContentPane().add(pnlModificarPersonas);
			ventanaPrincipal.getContentPane().repaint();
			ventanaPrincipal.getContentPane().revalidate();
		}

		public void inicializar()
		{
			this.ventanaPrincipal.setVisible(true);
		}
		
		
		@Override
		public void actionPerformed(ActionEvent e) { }
		
}
