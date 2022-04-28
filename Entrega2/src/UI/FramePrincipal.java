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
		PBotones botones = new PBotones();
		lblTitulo = new JLabel ("¿Qué harás hoy en tu proyecto?");
		lblTitulo.setFont(new Font("Open Sans ExtraBold", Font.BOLD, 30));
		
		add(botones, BorderLayout.WEST);
		add(lblTitulo,BorderLayout.NORTH);
		
		// TODO Auto-generated method stub
		
	}
	

	public static void main(String[] args) {
		FramePrincipal framePrincipal = new FramePrincipal();
		framePrincipal.setVisible(true);
	}
}
