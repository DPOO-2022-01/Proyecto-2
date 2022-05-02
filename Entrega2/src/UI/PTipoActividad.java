package UI;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;

public class PTipoActividad extends JPanel{
	
	public static final Dimension CELLSZ = new Dimension(25, 40);
	private JList<String> listTipoActividad;
	private String[] tiposActividad;
	private JPanel north = new JPanel(new BorderLayout());
	private JLabel nombrePrincipal;
	
	
	public PTipoActividad() {
		setLayout(new BorderLayout());
		nombrePrincipal = new JLabel("Tipos de Actividades del Proyecto");
		nombrePrincipal.setFont(new Font("Open Sans ExtraBold", Font.BOLD, 30));
		listTipoActividad = new JList<>(tiposActividad);
		
		north.add(nombrePrincipal, BorderLayout.WEST);
		add(listTipoActividad, BorderLayout.CENTER);
	}
	
}
