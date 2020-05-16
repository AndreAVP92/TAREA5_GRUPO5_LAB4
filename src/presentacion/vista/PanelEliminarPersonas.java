package presentacion.vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Font;

public class PanelEliminarPersonas extends JPanel {

	private JButton btnEliminar;
	
	
	public PanelEliminarPersonas() {
		setLayout(null);
		this.setBounds(100, 100, 514, 455);
		
		JLabel lblEliminarUsu = new JLabel("Eliminar Usuarios");
		lblEliminarUsu.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblEliminarUsu.setBounds(182, 33, 123, 16);
		add(lblEliminarUsu);
		
		JList list = new JList();
		list.setBounds(65, 89, 389, 240);
		add(list);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.setBounds(192, 363, 97, 25);
		add(btnEliminar);

	}


	public JButton getBtnEliminar() {
		return btnEliminar;
	}


	public void setBtnEliminar(JButton btnEliminar) {
		this.btnEliminar = btnEliminar;
	}
	
	public void mostrarMensaje(String mensaje)
	{
		JOptionPane.showMessageDialog(null, mensaje);
	}
	
	
}
