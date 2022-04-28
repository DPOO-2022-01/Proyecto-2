package UI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class FramePrincipal extends JFrame {
	
	//Atributos
	JLabel lblTitulo;
	PTipoActividad pTipoActividad;
	
	//Constructor
	public FramePrincipal() {
		
		setLayout(new BorderLayout());
		setSize(1200, 800);
		setLocationRelativeTo(null);
		setTitle("Project Manager");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		iniciarComponentes();
		
	}
	
	private void iniciarComponentes() {
		pTipoActividad = new PTipoActividad();
		pTipoActividad.setBackground(Color.cyan);//Solo pa ver si funciona jsjjs, el color es horrible.
		PBotones botones = new PBotones();
		lblTitulo = new JLabel ("�Qu� har�s hoy en tu proyecto?");
		lblTitulo.setFont(new Font("Open Sans ExtraBold", Font.BOLD, 30));
		
		add(botones, BorderLayout.WEST);
		add(pTipoActividad, BorderLayout.CENTER);
		add(lblTitulo,BorderLayout.NORTH);
		
		// TODO Auto-generated method stub
		
	}

	public static void main(String[] args) {
		FramePrincipal framePrincipal = new FramePrincipal();
		framePrincipal.setVisible(true);
	}
}
