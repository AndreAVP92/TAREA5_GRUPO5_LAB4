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


public class VentanaPrincipal {
	private JFrame frmRegistro;
	private JButton btnAceptar;
	private JTextField textNombre;
	private JTextField textApellido;
	private JTextField textDni;

	public VentanaPrincipal() 
	{
		super();
		initialize();
	}
	
	public JTextField getTextNombre() {
		return textNombre;
	}
	
	public void setTextNombre(JTextField textNombre) {
		this.textNombre = textNombre;
	}

	public JTextField getTextApellido() {
		return textApellido;
	}

	public JButton getBtnAceptar() {
		return btnAceptar;
	}
	
	public void setBtnAceptar(JButton btnAceptar) {
		this.btnAceptar = btnAceptar;
	}

	public void setTextApellido(JTextField textApellido) {
		this.textApellido = textApellido;
	}

	public JTextField getTextDni() {
		return textDni;
	}

	public void setTextDni(JTextField textDni) {
		this.textDni = textDni;
	}

	private void initialize() 
	{
		frmRegistro = new JFrame();
		frmRegistro.setTitle("Programa");
		frmRegistro.setBounds(100, 100, 517, 353);
		frmRegistro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmRegistro.getContentPane().setLayout(null);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(66, 222, 116, 23);
		frmRegistro.getContentPane().add(btnAceptar);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(66, 59, 56, 16);
		frmRegistro.getContentPane().add(lblNombre);
		
		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setBounds(66, 117, 56, 16);
		frmRegistro.getContentPane().add(lblApellido);
		
		JLabel lblDni = new JLabel("Dni");
		lblDni.setBounds(66, 176, 56, 16);
		frmRegistro.getContentPane().add(lblDni);
		
		textNombre = new JTextField();
		textNombre.setBounds(214, 56, 163, 22);
		frmRegistro.getContentPane().add(textNombre);
		textNombre.setColumns(10);
		
		textApellido = new JTextField();
		textApellido.setBounds(214, 114, 163, 22);
		frmRegistro.getContentPane().add(textApellido);
		textApellido.setColumns(10);
		
		textDni = new JTextField();
		textDni.setBounds(214, 173, 116, 22);
		frmRegistro.getContentPane().add(textDni);
		textDni.setColumns(10);
	}
	
	public void show()
	{
		this.frmRegistro.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		this.frmRegistro.addWindowListener(new WindowAdapter() 
		{
			@Override
		    public void windowClosing(WindowEvent e) {
		        int confirm = JOptionPane.showOptionDialog(
		             null, "¿Estás seguro que quieres salir de la Agenda?", 
		             "Confirmación", JOptionPane.YES_NO_OPTION,
		             JOptionPane.QUESTION_MESSAGE, null, null, null);
		        if (confirm == 0) {		        	
		           System.exit(0);
		           Conexion.getConexion().cerrarConexion();
		        }
		    }
		});
		this.frmRegistro.setVisible(true);
	}
	
	public void mostrarMensaje(String mensaje)
	{
		JOptionPane.showMessageDialog(null, mensaje);
	}
}
