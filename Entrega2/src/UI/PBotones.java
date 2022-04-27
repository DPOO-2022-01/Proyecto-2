package UI;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;

public class PBotones extends JPanel implements Observer{
	private JButton descripcion;
	private JButton participantes;
	private JButton tiposActividad;
	private JButton actividades;
	private JComboBox<String> nombreProyecto;
	private ArrayList<String> listaProyectos;
	
	public PBotones() {
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		//Creación de componentes
		descripcion = new JButton("Descripción");
		participantes = new JButton("Participantes");
		tiposActividad = new JButton("Tipos de Actividad");
		actividades = new JButton("Actividades");
		nombreProyecto = new JComboBox<>();
		
		add(nombreProyecto);
		add(descripcion);
		add(participantes);
		add(tiposActividad);
		add(actividades);
	}

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		
	}
}
