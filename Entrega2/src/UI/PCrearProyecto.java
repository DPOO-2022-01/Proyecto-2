package UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PCrearProyecto extends JPanel {

    private VentanaPrincipal padre;
    private JLabel labelNombre;
    private JLabel label;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JTextField textNombre;
    private JTextField text;
    private JTextField text1;
    private JTextField text2;
    private JTextField text3;
    private JButton agregarParticipante;
    private JScrollPane scrollBar;

    private Font principalFont;
    private Font secondaryFont;

    public PCrearProyecto(VentanaPrincipal padre) {
        this.padre = padre;
        beginComponents();
        setVisible(true);
    }

    private void beginComponents() {
        this.setBackground(new Color(100, 140, 241));

        principalFont = new Font("Open Sans ExtraBold", Font.BOLD, 24);
        secondaryFont = new Font("Bahnschrift Light", Font.PLAIN, 14);

        agregarParticipante = new JButton("Crear proyecto");
        agregarParticipante.setPreferredSize(new Dimension(200, 30));
        addFncButton();

        //agregarDescripcion.setHorizontalAlignment(SwingConstants.LEFT);
        //agregarDescripcion.setAlignmentX(Component.LEFT_ALIGNMENT);

        labelNombre = new JLabel("Crea tu proyecto! ");
        labelNombre.setPreferredSize(new Dimension(450, 60));
        labelNombre.setBackground(Color.WHITE);
        labelNombre.setOpaque(true);
        labelNombre.setFont(principalFont);
        labelNombre.setForeground(new Color(91, 190, 247));
        

        label = new JLabel("Ingresa el nombre de tu proyecto:");
        label.setPreferredSize(new Dimension(50, 80));
        label.setBackground(Color.WHITE);
        label.setOpaque(true);
        label.setFont(secondaryFont);
        
        label1 = new JLabel("Ingresa una descripción corta de tu proyecto:");
        label1.setPreferredSize(new Dimension(50, 80));
        label1.setBackground(Color.WHITE);
        label1.setOpaque(true);
        label1.setFont(secondaryFont);
        
        label2 = new JLabel("Ingresa la fecha estimada de finalización (no es obligatorio):");
        label2.setPreferredSize(new Dimension(50, 80));
        label2.setBackground(Color.WHITE);
        label2.setOpaque(true);
        label2.setFont(secondaryFont);
        
        
        label3 = new JLabel("Ingresa los tipos de actividad que tendrá tu proyecto (separados por coma): ");
        label3.setPreferredSize(new Dimension(50, 80));
        label3.setBackground(Color.WHITE);
        label3.setOpaque(true);
        label3.setFont(secondaryFont);
        
        
        
        text=new JTextField();
        text.setPreferredSize(new Dimension(50,20));
        text.setBackground(Color.WHITE);
        text.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        text.setOpaque(true);
        
        text1=new JTextField();
        text1.setPreferredSize(new Dimension(50,20));
        text1.setBackground(Color.WHITE);
        text1.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        text1.setOpaque(true);
        
        text2=new JTextField();
        text2.setPreferredSize(new Dimension(50,20));
        text2.setBackground(Color.WHITE);
        text2.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        text2.setOpaque(true);
        
        text3=new JTextField();
        text3.setPreferredSize(new Dimension(50,20));
        text3.setBackground(Color.WHITE);
        text3.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        text3.setOpaque(true);
        
        
        
        
   

        //scrollBar = new JScrollPane(label, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                //JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        //scrollBar.setPreferredSize(new Dimension(650, 250));

        Box horizontalBox = Box.createHorizontalBox();
        horizontalBox.setPreferredSize(new Dimension(650, 70));
        horizontalBox.setBackground(Color.white);
        horizontalBox.setOpaque(true);
        
        horizontalBox.add(Box.createRigidArea(new Dimension(20, 0)));
        horizontalBox.add(labelNombre);
        
        add(horizontalBox);
        
       // Box horizontalB = Box.createHorizontalBox();
        //horizontalB.setPreferredSize(new Dimension(300, 20));
        //horizontalB.setBackground(Color.white);
        //horizontalB.setOpaque(true);
        
        //horizontalB.add(Box.createRigidArea(new Dimension(20, 0)));
        //horizontalB.add(label);
        //horizontalB.add(text);
        
        
        

        //add(horizontalB);
        //add(label);
        
        //add(text);
        
        
        
        
        Box horizontal = Box.createVerticalBox();
        horizontal.setPreferredSize(new Dimension(650, 300));
        horizontal.setBackground(Color.white);
        horizontal.setOpaque(true);
        horizontal.add(label);
        horizontal.add(text);
        horizontal.add(label1);
        horizontal.add(text1);
        horizontal.add(label2);
        horizontal.add(text2);
        horizontal.add(label3);
        horizontal.add(text3);
        
       
        //add(label1);
        //add(text);
        add(horizontal);
        add(agregarParticipante);
        
        
        
        
        
        
        //add(agregarDescripcion);
    }

    //public JTextField getTextNombre() {
        //return textNombre;
    //}

    private void addFncButton() {
        agregarParticipante.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
            	padre.begin();
                
            }

        });
    }
}
