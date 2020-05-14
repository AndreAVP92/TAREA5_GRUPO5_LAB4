package presentacion.vista;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
//import javax.swing.JTable;
import javax.swing.JTextField;
//import javax.swing.table.DefaultTableModel;

import daolmpl.Conexion;
//import entidad.Persona;

public class VentanaPrincipal {
	private JFrame frmAgenda;
//	private JTable tablaPersonas;
	private JButton btnBorrar;
	
//	private DefaultTableModel modelPersonas;
//	private String[] nombreColumnas = {"Nombre y apellido","Telefono"};
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtDni;
	
	public VentanaPrincipal() 
	{
		super();
		initialize();
	}


	public JTextField getTxtNombre() {
		return txtNombre;
	}

	public void setTxtNombre(JTextField txtNombre) {
		this.txtNombre = txtNombre;
	}

	public JTextField getTxtApellido() {
		return txtApellido;
	}

	public void setTxtApellido(JTextField txtApellido) {
		this.txtApellido = txtApellido;
	}
	
	public JTextField getTxtDni() {
		return txtDni;
	}

	public void setTxtDni(JTextField txtDni) {
		this.txtDni = txtDni;
	}
	
	public JButton getBtnAgregar() {
		return btnAgregar;
	}

	
	public void setBtnAgregar(JButton btnAgregar) {
		this.btnAgregar = btnAgregar;
	}

	public void setBtnBorrar(JButton btnBorrar) {
		this.btnBorrar = btnBorrar;
	}

	private JButton btnAgregar;

	
	private void initialize() 
	{
		frmAgenda = new JFrame();
		frmAgenda.setTitle("Agenda");
		frmAgenda.setBounds(100, 100, 514, 474);
		frmAgenda.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAgenda.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(15, 171, 444, 227);
		frmAgenda.getContentPane().add(panel);
		panel.setLayout(null);
		
		JScrollPane spPersonas = new JScrollPane();
		spPersonas.setBounds(15, 30, 383, 126);
		panel.add(spPersonas);
		
		
		btnBorrar = new JButton("Borrar");
		btnBorrar.setBounds(310, 187, 89, 23);
		panel.add(btnBorrar);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBounds(15, 16, 438, 139);
		frmAgenda.getContentPane().add(panel_1);
		
		JLabel label = new JLabel("Nombre");
		label.setBounds(10, 22, 170, 14);
		panel_1.add(label);
		
		JLabel label_1 = new JLabel("Apellido");
		label_1.setBounds(43, 59, 113, 14);
		panel_1.add(label_1);
		
		txtNombre = new JTextField();
		txtNombre.setColumns(10);
		txtNombre.setBounds(184, 19, 164, 20);
		panel_1.add(txtNombre);
		
		txtApellido = new JTextField();
		txtApellido.setColumns(10);
		txtApellido.setBounds(184, 56, 164, 20);
		panel_1.add(txtApellido);
		
		txtDni = new JTextField();
		txtDni.setColumns(10);
		txtDni.setBounds(184, 94, 164, 20);
		panel_1.add(txtDni);
		
		btnAgregar = new JButton("Agregar");
		btnAgregar.setBounds(259, 100, 89, 23);
		panel_1.add(btnAgregar);
	}
	
	public void show()
	{
		this.frmAgenda.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		this.frmAgenda.addWindowListener(new WindowAdapter() 
		{
			@Override
		    public void windowClosing(WindowEvent e) {
		        int confirm = JOptionPane.showOptionDialog(
		             null, "¿Estás seguro que quieres salir de la Agenda?", 
		             "Confirmación", JOptionPane.YES_NO_OPTION,
		             JOptionPane.QUESTION_MESSAGE, null, null, null);
		        if (confirm == 0) {
		        	Conexion.getConexion().cerrarConexion();
		           System.exit(0);
		        }
		    }
		});
		this.frmAgenda.setVisible(true);
	}
	
	public void mostrarMensaje(String mensaje)
	{
		JOptionPane.showMessageDialog(null, mensaje);
	}
}
