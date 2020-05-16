package presentacion.vista;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JLabel;

public class PanelListarPersonas extends JPanel {
	
	private JTable table;
	private DefaultTableModel modelPersonas;
	private String[] nombreColumnas = {"Nombre","Apellido","Dni"};
	/**
	 * Create the panel.
	 */

	 public PanelListarPersonas() {
			
			super();
			initialize();
	}
	 
	 private void initialize() 
	 {
			
		this.setBounds(100, 100, 514, 455);
		this.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 444, 227);
		this.add(panel);
		panel.setLayout(null);
		
		JScrollPane spPersonas = new JScrollPane();
		spPersonas.setBounds(15, 30, 383, 126);
		panel.add(spPersonas);
		
		modelPersonas = new DefaultTableModel(null,nombreColumnas);
		table = new JTable(modelPersonas);
		
		table.getColumnModel().getColumn(0).setPreferredWidth(103);
		table.getColumnModel().getColumn(0).setResizable(false);
		table.getColumnModel().getColumn(1).setPreferredWidth(100);
		table.getColumnModel().getColumn(1).setResizable(false);
		
		spPersonas.setViewportView(table);
		
	
	}
	
		public void show()
		{
			this.setVisible(true);
		}
}
