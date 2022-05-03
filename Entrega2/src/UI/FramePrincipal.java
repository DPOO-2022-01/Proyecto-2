package UI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Controller.Controlador;
import Logic.Cronometro;
import Logic.Proyecto;

public class FramePrincipal extends JFrame {
	
	//Atributos
	private JLabel lblTitulo;
	private Controlador controlador;
	private String nombreProyecto;
	private Cronometro cronometro;
	private PActividades actividades;
	
	//Constructor
	public FramePrincipal() {
		controlador = new Controlador();
		setLayout(new BorderLayout());
		setSize(1200, 800);
		setLocationRelativeTo(null);
		setTitle("Project Manager");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.cronometro = new Cronometro();
		
		actividades = new PActividades(this);
		cronometro.addObserver(actividades);		
		add(actividades, BorderLayout.CENTER);
		
		PReporteDetallado detallado = new PReporteDetallado(this);
		//add(detallado, BorderLayout.CENTER);
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
