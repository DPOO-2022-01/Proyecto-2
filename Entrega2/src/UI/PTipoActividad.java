package UI;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;

public class PTipoActividad extends JPanel{
	
	private JPanel panelPrincipal;
	private JLabel nombrePrincipal;
	
	
	public PTipoActividad() {
		setLayout(new BorderLayout());
		nombrePrincipal = new JLabel("Titulo");
		panelPrincipal = new JPanel();
		iniciarPanelTipoActividad();
		
	}

	private void iniciarPanelTipoActividad() {
		panelPrincipal.setSize(this.getWidth(), this.getHeight());
		JPanel panelSuperior = new JPanel();
		JPanel panelContenido = new JPanel();
		String[] tipoActividad = {"Ninguno"};
		JList<String> listTipoActividad = new JList<>(tipoActividad);
		
		panelSuperior.setLayout(new BorderLayout());
		nombrePrincipal.setText("Tipos de Actividades del Proyecto");
		nombrePrincipal.setFont(new Font("Open Sans ExtraBold", Font.BOLD, 30));
		panelSuperior.add(nombrePrincipal);
		
		panelContenido.setLayout(new BorderLayout());
		panelContenido.add(panelSuperior, BorderLayout.NORTH);
		panelContenido.add(listTipoActividad, BorderLayout.CENTER);
		
		panelPrincipal.add(panelContenido);
		this.add(panelPrincipal, BorderLayout.CENTER);
		
		
	}
	
}
