package UI;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class FramePrincipal extends JFrame {
	
	//Atributos
	
	
	//Constructor
	public FramePrincipal() {
		
		setLayout(new BorderLayout());
		setSize(1200, 800);
		setLocationRelativeTo(null);
		setTitle("Project Manager");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		PBotones botones = new PBotones();
		add(botones, BorderLayout.WEST);
		
	}
	
	public static void main(String[] args) {
		FramePrincipal framePrincipal = new FramePrincipal();
		framePrincipal.setVisible(true);
	}
}
