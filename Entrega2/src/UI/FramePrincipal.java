package UI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Controller.Controlador;
import Logic.Proyecto;

public class FramePrincipal extends JFrame {
	
	//Atributos
	private JLabel lblTitulo;
	private Controlador controlador;
	private String nombreProyecto;
	
	//Constructor
	public FramePrincipal() {
		controlador = new Controlador();
		setLayout(new BorderLayout());
		setSize(1200, 800);
		setLocationRelativeTo(null);
		setTitle("Project Manager");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		PActividades actividades = new PActividades();
		add(actividades, BorderLayout.CENTER);
		
		//iniciarComponentes();
		
	}

	public String getNombreProyecto() {
		return nombreProyecto;
	}

	public Controlador getControlador() {
		return controlador;
	}


	public static void main(String[] args) {
		FramePrincipal framePrincipal = new FramePrincipal();
		framePrincipal.setVisible(true);
	}
}
