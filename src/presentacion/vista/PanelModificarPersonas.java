package presentacion.vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JList;

public class PanelModificarPersonas extends JPanel {
	private JTextField txtNombre;
	private JTextField txtDni;
	private JLabel lblApellido;
	private JTextField txtApellido;

	public PanelModificarPersonas() {
		setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(171, 303, 57, 20);
		add(lblNombre);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(232, 300, 98, 26);
		add(txtNombre);
		txtNombre.setColumns(10);
		
		JLabel lblDni = new JLabel("DNI");
		lblDni.setBounds(39, 303, 30, 20);
		add(lblDni);
		
		txtDni = new JTextField();
		txtDni.setColumns(10);
		txtDni.setBounds(69, 300, 87, 26);
		add(txtDni);
		
		lblApellido = new JLabel("Apellido");
		lblApellido.setBounds(343, 303, 70, 20);
		add(lblApellido);
		
		txtApellido = new JTextField();
		txtApellido.setColumns(10);
		txtApellido.setBounds(405, 300, 98, 26);
		add(txtApellido);
		
		JButton btnModificar = new JButton("Modificar");
		btnModificar.setBounds(518, 293, 115, 41);
		add(btnModificar);
		
		JList list = new JList();
		list.setBounds(39, 40, 579, 240);
		add(list);
		
		JLabel lblModificar = new JLabel("Seleccione la persona a modificar:");
		lblModificar.setBounds(39, 16, 327, 20);
		add(lblModificar);

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
