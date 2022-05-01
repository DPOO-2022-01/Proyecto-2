package UI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class PActividades extends JPanel implements ActionListener{
	private JPanel panelEditar, panelNueva, panelPrincipal, panelCronometro;
	private JLabel nombreTitulo;
	private JButton btnNueva, btnEditar;
	
	public PActividades() {
		setLayout(new BorderLayout());
		nombreTitulo = new JLabel("No");
		panelNueva = new JPanel();
		panelEditar = new JPanel();
		panelPrincipal = new JPanel();
		panelCronometro = new JPanel();
		iniciarPanelPrincipal();
	}
	
	public void iniciarPanelPrincipal() {
		panelPrincipal.setSize(this.getWidth(), this.getHeight());
		JPanel panelBotones = new JPanel();
		JPanel panelSuperior = new JPanel();
		JPanel panelContenido = new JPanel();
		String[] proyectos = {"Ninguno"};
		JList<String> listaProyectos = new JList<>(proyectos);
		
		panelBotones.setLayout(new BorderLayout());
		btnNueva = new JButton("Nueva Actividad");
		btnEditar = new JButton("Editar Actividad");
		
		btnNueva.addActionListener(this);
		btnEditar.addActionListener(this);
		
		panelBotones.add(btnNueva, BorderLayout.NORTH);
		panelBotones.add(btnEditar, BorderLayout.SOUTH);
		
		panelSuperior.setLayout(new FlowLayout());
		nombreTitulo.setText("Actividades del Proyecto");
		nombreTitulo.setFont(new Font("Open Sans ExtraBold", Font.BOLD, 30));
		panelSuperior.add(nombreTitulo);
		panelSuperior.add(panelBotones);
		
		panelContenido.setLayout(new BorderLayout());
		panelContenido.add(panelSuperior, BorderLayout.NORTH);
		panelContenido.add(listaProyectos, BorderLayout.CENTER);
		
		panelPrincipal.add(panelContenido);
		this.add(panelPrincipal, BorderLayout.CENTER);
		
	}
	
	public void mostrarPanelNueva() {
		panelNueva = new JPanel();
		JPanel panelContenidoNueva = new JPanel();
		JTextField fieldTitulo = new JTextField();
		JLabel ingresarTitulo = new JLabel();
		JLabel nombrePanel = new JLabel();
		JButton bntiniciarActividad = new JButton("Iniciar Actividad");
		JButton btnVolver = new JButton("Volver");
		
		panelNueva.setLayout(new BorderLayout());
		panelContenidoNueva.setLayout(new BoxLayout(panelContenidoNueva, BoxLayout.Y_AXIS));
		
		nombrePanel.setText("Nueva Actividad");
		nombrePanel.setFont(new Font("Open Sans ExtraBold", Font.BOLD, 30));
		ingresarTitulo.setText("Ingresa el título de la actividad a realizar");
		panelContenidoNueva.add(nombrePanel);
		panelContenidoNueva.add(ingresarTitulo);
		panelContenidoNueva.add(fieldTitulo);
		
		JLabel ingresarDescripcion = new JLabel("Ingresa una descripción corta de la actividad");
		JTextField fieldDescripcion = new JTextField();
		
		panelContenidoNueva.add(ingresarDescripcion);
		panelContenidoNueva.add(fieldDescripcion);
		
		JLabel escogerTipoAct = new JLabel("Escoge el tipo de actividad a realizar");
		ButtonGroup grupoTiposActividad = new ButtonGroup();
		JRadioButton tiposActividad = new JRadioButton();
		
		panelContenidoNueva.add(escogerTipoAct);
		//For in que itere el tamaño del array de tipos de actividad, dentro de él, debe haber una variable String que cree el nombre del
		//botón y lo añada al grupo de botones. Después de eso, que el grupo de botones se añada al panelContenido.
		panelNueva.setBackground(Color.LIGHT_GRAY);
		bntiniciarActividad.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//Para hacer un botón de volver es sólo cambiar el visible de los paneles
				MostrarpanelCronometro();
				panelNueva.setVisible(false);
				panelCronometro.setVisible(true);
			}
		});
		
		btnVolver.addActionListener(new ActionListener() {		
			@Override
			public void actionPerformed(ActionEvent e) {
				panelPrincipal.setVisible(true);
				panelNueva.setVisible(false);
			}
		});
		
		panelContenidoNueva.add(bntiniciarActividad);
		panelNueva.add(btnVolver, BorderLayout.SOUTH);
		panelNueva.setBackground(Color.LIGHT_GRAY);
		panelNueva.add(panelContenidoNueva, BorderLayout.CENTER);
		this.add(panelNueva,BorderLayout.CENTER);
	}
	
	public void mostrarPanelEditar() {
		panelEditar = new JPanel();
		JLabel nombrePanel = new JLabel();
		nombrePanel.setText("Modificar Actividad");
		nombrePanel.setFont(new Font("Open Sans ExtraBold", Font.BOLD, 30));
		
		JButton btnVolver = new JButton("Volver");
		JButton btnGuardarActividad = new JButton("Guardar Actividad");
		JPanel panelContenidoEditar = new JPanel();
		JLabel tituloModificar = new JLabel("Ingresa el título de la actividad a modificar");
		JTextField fieldTituloModificar = new JTextField();
		JLabel fechaActividad = new JLabel("Ingresa la nueva fecha en la que se realizó la actividad");
		JTextField fieldFechaNueva = new JTextField();
		JLabel horaInicioFinAct = new JLabel("Indica la hora en la que se realizó la actividad (formato: HH:MM - HH:MM)");
		JTextField fieldHoraNueva = new JTextField();
		
		//Con la lógica para guardar actividad implementarlo en el btn
		btnGuardarActividad.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		btnVolver.addActionListener(new ActionListener() {		
			@Override
			public void actionPerformed(ActionEvent e) {
				panelPrincipal.setVisible(true);
				panelEditar.setVisible(false);
			}
		});
		
		panelContenidoEditar.setLayout(new BoxLayout(panelContenidoEditar, BoxLayout.Y_AXIS));
		panelContenidoEditar.add(nombrePanel);
		panelContenidoEditar.add(tituloModificar);
		panelContenidoEditar.add(fieldTituloModificar);
		panelContenidoEditar.add(fechaActividad);
		panelContenidoEditar.add(fieldFechaNueva);
		panelContenidoEditar.add(horaInicioFinAct);
		panelContenidoEditar.add(fieldHoraNueva);
		
		panelEditar.add(panelContenidoEditar, BorderLayout.CENTER);
		panelEditar.add(btnVolver, BorderLayout.SOUTH);
		panelEditar.add(btnGuardarActividad, BorderLayout.SOUTH);
		this.add(panelEditar, BorderLayout.CENTER);
		
	}
	
	public void MostrarpanelCronometro() {
		panelCronometro = new JPanel();
		panelCronometro.setLayout(new BorderLayout());
		JLabel nombrePanel = new JLabel();
		nombrePanel.setText("Crónometro de Actividad");
		nombrePanel.setFont(new Font("Open Sans ExtraBold", Font.BOLD, 30));
		JLabel tiempoTrans = new JLabel("Tiempo transcurrido");
		tiempoTrans.setFont(new Font("Open Sans ExtraBold", Font.BOLD, 30));
		JLabel temporalTiempo = new JLabel("00:00:00");
		temporalTiempo.setFont(new Font("Open Sans ExtraBold", Font.BOLD, 30));
		
		JButton btnPausar = new JButton("Pausar");
		JButton btnReanudar = new JButton("Reanudar");
		JButton btnTerminarActivdad = new JButton("Terminar Actividad");
		
		JPanel contenidoCronometro = new JPanel();
		contenidoCronometro.setLayout(new BoxLayout(contenidoCronometro, BoxLayout.Y_AXIS));
		
		JPanel panelBotones = new JPanel();
		panelBotones.setLayout(new FlowLayout());
		
		btnTerminarActivdad.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				panelCronometro.setVisible(false);
				panelPrincipal.setVisible(true);
			}
		});
		
		btnPausar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		btnReanudar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		panelBotones.add(btnPausar);
		panelBotones.add(btnReanudar);
		
		contenidoCronometro.add(tiempoTrans);
		contenidoCronometro.add(temporalTiempo);
		contenidoCronometro.add(panelBotones);
		
		panelCronometro.add(nombrePanel, BorderLayout.NORTH);
		panelCronometro.add(contenidoCronometro, BorderLayout.CENTER);
		panelCronometro.add(btnTerminarActivdad, BorderLayout.SOUTH);
		this.add(panelCronometro, BorderLayout.CENTER);
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnNueva) {
			panelPrincipal.setVisible(false);
			mostrarPanelNueva();
			panelNueva.setVisible(true);
			
		}
		if (e.getSource() == btnEditar) {
			panelPrincipal.setVisible(false);
			mostrarPanelEditar();
			panelEditar.setVisible(true);
		}
	}
	
	
}
