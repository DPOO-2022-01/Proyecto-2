package UI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PCuenta extends JPanel{

	private JPanel panelPrincipal;
	private JLabel nombrePrincipal;
	
	
	public PCuenta() {
		setLayout(new BorderLayout());
		nombrePrincipal = new JLabel("Titulo");
		panelPrincipal = new JPanel();
		iniciarPanelCuenta();
	}

	private void iniciarPanelCuenta() {
		panelPrincipal.setSize(this.getWidth(), this.getHeight());
		Color color = new Color(88, 144, 234);
		JPanel panelSuperior = new JPanel();
		JPanel panelInferior = new JPanel();
		JPanel panelContenido = new JPanel();
		JLabel ingresarNombre = new JLabel("Ingresa tu nombre completo: ");
		JTextField fieldNombre = new JTextField();
		JLabel ingresarCorreo = new JLabel("Ingresa tu correo: ");
		JTextField fieldCorreo = new JTextField();
		JLabel ingresarProyecto = new JLabel("¿Tienes ya un proyecto?");
		JButton btnSiProyecto = new JButton("Sí");
		JButton btnNoProyecto = new JButton("No");
		
		panelSuperior.setLayout(new BorderLayout());
		nombrePrincipal.setText("Ingresa a ProyectManajer");
		nombrePrincipal.setFont(new Font("Open Sans ExtraBold", Font.BOLD, 30));
		panelSuperior.add(nombrePrincipal);
		panelInferior.setLayout(new BorderLayout());
		panelInferior.add(btnSiProyecto, BorderLayout.WEST);
		panelInferior.add(btnNoProyecto, BorderLayout.EAST);
		panelContenido.setLayout(new BoxLayout(panelContenido, BoxLayout.Y_AXIS));
		
		panelContenido.add(panelSuperior, BorderLayout.NORTH);
		panelContenido.add(ingresarNombre);
		panelContenido.add(fieldNombre);
		panelContenido.add(ingresarCorreo);
		panelContenido.add(fieldCorreo);
		panelContenido.add(ingresarProyecto);
		panelContenido.add(panelInferior);
		
		panelPrincipal.add(panelContenido);
		this.add(panelPrincipal, BorderLayout.CENTER);
		
		
	}

}
