package presentacion.vista;


import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import java.awt.Font;

public class VentanaPrincipal extends JFrame {


	private JMenu MenuPersonas;
	private JMenuItem MenuAgregar;
	private JMenuItem MenuModificar;
	private JMenuItem MenuEliminar;
	private JMenuItem MenuListar;
	
	public VentanaPrincipal() {
		setTitle("Programa");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 783, 494);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu MenuPersonas = new JMenu("Personas");
		MenuPersonas.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		menuBar.add(MenuPersonas);
		
		JMenuItem MenuAgregar = new JMenuItem("Agregar");
		MenuAgregar.setFont(new Font("Segoe UI", Font.BOLD, 15));
		MenuPersonas.add(MenuAgregar);
		
		JMenuItem MenuModificar = new JMenuItem("Modificar");
		MenuModificar.setFont(new Font("Segoe UI", Font.BOLD, 15));
		MenuPersonas.add(MenuModificar);
		
		JMenuItem MenuEliminar = new JMenuItem("Eliminar");
		MenuEliminar.setFont(new Font("Segoe UI", Font.BOLD, 15));
		MenuPersonas.add(MenuEliminar);
		
		JMenuItem MenuListar = new JMenuItem("Listar");
		MenuListar.setFont(new Font("Segoe UI", Font.BOLD, 15));
		MenuPersonas.add(MenuListar);
	}

	public JMenu getMenuPersonas() {
		return MenuPersonas;
	}

	public void setMenuPersonas(JMenu menuPersonas) {
		MenuPersonas = menuPersonas;
	}

	public JMenuItem getMenuAgregar() {
		return MenuAgregar;
	}

	public void setMenuAgregar(JMenuItem menuAgregar) {
		MenuAgregar = menuAgregar;
	}

	public JMenuItem getMenuModificar() {
		return MenuModificar;
	}

	public void setMenuModificar(JMenuItem menuModificar) {
		MenuModificar = menuModificar;
	}

	public JMenuItem getMenuEliminar() {
		return MenuEliminar;
	}

	public void setMenuEliminar(JMenuItem menuEliminar) {
		MenuEliminar = menuEliminar;
	}

	public JMenuItem getMenuListar() {
		return MenuListar;
	}

	public void setMenuListar(JMenuItem menuListar) {
		MenuListar = menuListar;
	}
	
}
