package presentacion.vista;


import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import java.awt.Font;

public class VentanaPrincipal extends JFrame {


	private JMenu menuPersonas;
	private JMenuItem menuEliminar;
	private JMenuItem menuAgregar;
	private JMenuItem menuModificar;
	private JMenuItem menuListar;
	
	public VentanaPrincipal() {
		setTitle("Programa");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 783, 494);
		
		menuPersonas = new JMenu("Personas");
		menuPersonas.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		
		menuAgregar = new JMenuItem("Agregar");
		menuAgregar.setFont(new Font("Segoe UI", Font.BOLD, 15));
		menuPersonas.add(menuAgregar);
		
		menuModificar = new JMenuItem("Modificar");
		menuModificar.setFont(new Font("Segoe UI", Font.BOLD, 15));
		menuPersonas.add(menuModificar);
		
		menuEliminar = new JMenuItem("Eliminar");
		menuEliminar.setFont(new Font("Segoe UI", Font.BOLD, 15));
		menuPersonas.add(menuEliminar);
		
		menuListar = new JMenuItem("Listar");
		menuListar.setFont(new Font("Segoe UI", Font.BOLD, 15));
		menuPersonas.add(menuListar);
	}

	public JMenu getMenuPersonas() {
		return menuPersonas;
	}

	public void setMenuPersonas(JMenu MenuPersonas) {
		menuPersonas = MenuPersonas;
	}

	public JMenuItem getMenuAgregar() {
		return menuAgregar;
	}

	public void setMenuAgregar(JMenuItem MenuAgregar) {
		menuAgregar = MenuAgregar;
	}

	public JMenuItem getMenuModificar() {
		return menuModificar;
	}

	public void setMenuModificar(JMenuItem MenuModificar) {
		menuModificar = MenuModificar;
	}

	public JMenuItem getMenuEliminar() {
		return menuEliminar;
	}

	public void setMenuEliminar(JMenuItem MenuEliminar) {
		menuEliminar = MenuEliminar;
	}

	public JMenuItem getMenuListar() {
		return menuListar;
	}

	public void setMenuListar(JMenuItem MenuListar) {
		menuListar = MenuListar;
	}
	
}
