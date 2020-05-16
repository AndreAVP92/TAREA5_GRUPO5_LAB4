package presentacion.vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class PanelModificarPersonas extends JPanel {
	private JTextField txtNombre;
	private JTextField txtDni;
	private JLabel lblApellido;
	private JTextField txtApellido;

	public PanelModificarPersonas() {
		setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(150, 301, 57, 20);
		add(lblNombre);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(211, 298, 98, 26);
		add(txtNombre);
		txtNombre.setColumns(10);
		
		JLabel lblDni = new JLabel("DNI");
		lblDni.setBounds(15, 301, 30, 20);
		add(lblDni);
		
		txtDni = new JTextField();
		txtDni.setColumns(10);
		txtDni.setBounds(45, 298, 87, 26);
		add(txtDni);
		
		lblApellido = new JLabel("Apellido");
		lblApellido.setBounds(322, 301, 70, 20);
		add(lblApellido);
		
		txtApellido = new JTextField();
		txtApellido.setColumns(10);
		txtApellido.setBounds(384, 298, 98, 26);
		add(txtApellido);

	}

	public void mostrarMensaje(String mensaje) {
		// TODO Auto-generated method stub
		
	}
	
	public JTextField getTxtNombre() {
		return txtNombre;
	}
	
	public JTextField getTxtApellido() {
		return txtApellido;
	}
	
	public JTextField getTxtDni() {
		return txtDni;
	}
}
