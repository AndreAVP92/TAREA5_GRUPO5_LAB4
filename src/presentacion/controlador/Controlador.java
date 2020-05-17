package presentacion.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultListModel;

import negocio.PersonaNegocio;
import presentacion.vista.PanelAgregarPersonas;
import presentacion.vista.PanelEliminarPersonas;
import presentacion.vista.PanelModificarPersonas;
import presentacion.vista.PanelListarPersonas;
import presentacion.vista.VentanaPrincipal;
import entidad.Persona;

public class Controlador implements ActionListener
{

	private VentanaPrincipal ventanaPrincipal;
	private PersonaNegocio pNeg;
	
	
	private List<Persona> personasEnTabla;
	
	
	
	private DefaultListModel<Persona> listModel = new DefaultListModel<Persona>();
	
	private PanelAgregarPersonas pnlIngresoPersonas;
	private PanelEliminarPersonas pnlEliminarPersonas;
	private PanelModificarPersonas pnlModificarPersonas;
	private PanelListarPersonas pnlListarPersonas;
	
		//Constructor
		public Controlador(VentanaPrincipal vista, PersonaNegocio pNeg)
		{
			this.ventanaPrincipal = vista;
			this.pNeg = pNeg;
			
			
			//Instancio los paneles
			this.pnlIngresoPersonas = new PanelAgregarPersonas();
			this.pnlEliminarPersonas = new PanelEliminarPersonas();
			this.pnlModificarPersonas = new PanelModificarPersonas();
			this.pnlListarPersonas = new PanelListarPersonas();
			
			//Eventos menu del Frame principal llamado Ventana
			this.ventanaPrincipal.getMenuAgregar().addActionListener(a->EventoClickMenu_AbrirPanel_AgregarPersona(a));
			this.ventanaPrincipal.getMenuEliminar().addActionListener(a->EventoClickMenu_AbrirPanel_EliminarPersona(a));
			this.ventanaPrincipal.getMenuModificar().addActionListener(a->EventoClickMenu_AbrirPanel_ModificarPersona(a));
			this.ventanaPrincipal.getMenuListar().addActionListener(a->EventoClickMenu_AbrirPanel_ListarPersona(a));
			
			//Eventos click on Paneles
			
		}
		
		//EVENTOS ABRIR PANELES
		
		//EventoClickMenu abrir PanelAgregarPersonas
		public void  EventoClickMenu_AbrirPanel_AgregarPersona(ActionEvent a)
		{		
			ventanaPrincipal.getContentPane().removeAll();
			ventanaPrincipal.getContentPane().add(pnlIngresoPersonas);
			ventanaPrincipal.getContentPane().repaint();
			ventanaPrincipal.getContentPane().revalidate();
		}
		
		//EventoClickMenu abrir PanelEliminarPersonas
				public void EventoClickMenu_AbrirPanel_EliminarPersona(ActionEvent a)
				{		
					ventanaPrincipal.getContentPane().removeAll();
					llenarDatos();
					pnlEliminarPersonas.setDefaultListModel(listModel);
					ventanaPrincipal.getContentPane().add(pnlEliminarPersonas);
					ventanaPrincipal.getContentPane().repaint();
					ventanaPrincipal.getContentPane().revalidate();
					//this.refrescarTabla();
				} 
		
		//EventoClickMenu abrir PanelModificarPersonas
		public void EventoClickMenu_AbrirPanel_ModificarPersona(ActionEvent a)
		{		
			ventanaPrincipal.getContentPane().removeAll();
			ventanaPrincipal.getContentPane().add(pnlModificarPersonas);
			ventanaPrincipal.getContentPane().repaint();
			ventanaPrincipal.getContentPane().revalidate();
		}
		
		public void EventoClickMenu_AbrirPanel_ListarPersona(ActionEvent a)
		{		
			ventanaPrincipal.getContentPane().removeAll();
			ventanaPrincipal.getContentPane().add(pnlListarPersonas);
			ventanaPrincipal.getContentPane().repaint();
			ventanaPrincipal.getContentPane().revalidate();
		}
		
		
	private void refrescarTabla()
		{
			this.personasEnTabla = pNeg.readAll();
			
			
		}


public void llenarDatos() {
		
	refrescarTabla();

		if (!personasEnTabla.isEmpty()) {
			
			for (Persona p : personasEnTabla)
			{
				listModel.addElement(p);
				
			}
			
		}
		
	}
		
		
		public void inicializar()
		{
			this.ventanaPrincipal.setVisible(true);
		}
		
		
		@Override
		public void actionPerformed(ActionEvent e) { }
		
}
