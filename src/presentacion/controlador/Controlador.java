package presentacion.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

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
			this.pnlModificarPersonas.getBtnModificar().addActionListener();
			 this.pnlEliminarPersonas.getBtnEliminar().addActionListener(s->EventoClickBoton_BorrarPesona_PanelEliminarPersonas(s));
			
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
			llenarDatos();
			pnlModificarPersonas.setDefaultListModel(listModel);
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
				mensaje="Persona no modificada, todos los campos deben estar completos";
			
			this.pnlModificarPersonas.mostrarMensaje(mensaje);
			this.llenarDatos();
			pnlModificarPersonas.setDefaultListModel(listModel);
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
		
		listModel.removeAllElements();
	
		refrescarTabla();

		if (!personasEnTabla.isEmpty()) {
			
			for (Persona p : personasEnTabla)
			{
				listModel.addElement(p);
				
		}}}
	
	public void EventoClickBoton_BorrarPesona_PanelEliminarPersonas(ActionEvent s)
		{
			boolean estado=false;
			int filasSeleccionadas = this.pnlEliminarPersonas.getList().getSelectedIndex();
	
			estado = pNeg.delete(this.personasEnTabla.get(filasSeleccionadas));
		
			if(estado==true)
			{
			String mensaje="Persona eliminada con exito";
			mostrarMensaje(mensaje);
		}
	
	this.llenarDatos();
	this.pnlEliminarPersonas.setDefaultListModel(listModel);
	
		}

	public void mostrarMensaje(String mensaje)
	{
		JOptionPane.showMessageDialog(null, mensaje);
	}
		
		public void inicializar()
		{
			
			this.ventanaPrincipal.setLocationRelativeTo(null);
			this.ventanaPrincipal.setVisible(true);
		}
		
		
		@Override
		public void actionPerformed(ActionEvent e) { }
		
}
