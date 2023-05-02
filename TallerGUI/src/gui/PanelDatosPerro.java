package gui;

import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelDatosPerro extends JPanel {

    private JLabel lbNum1;
    private JLabel lbNum2;
    private JLabel lbNum3;
    private JLabel lbNum4;
    private JLabel lbInvisible; 

    private JTextField txtNum1;
    private JTextField txtNum2;
    private JTextField txtNum3;
    private JTextField txtNum4;
    

    public PanelDatosPerro() {
    	
    	

        lbNum1 = new JLabel("Nombre:");
        lbNum1.setPreferredSize(new Dimension(55, 18));

        txtNum1 = new JTextField();
        txtNum1.setPreferredSize(new Dimension(55, 18));
        txtNum1.setText("Tarzán");

        lbNum2 = new JLabel("Edad:");
        lbNum2.setPreferredSize(new Dimension(55, 18));

        txtNum2 = new JTextField();
        txtNum2.setPreferredSize(new Dimension(55, 18));
        txtNum2.setText("137 meses");   

        lbNum3 = new JLabel("Raza:");
        lbNum3.setPreferredSize(new Dimension(55, 18));

        txtNum3 = new JTextField();
        txtNum3.setPreferredSize(new Dimension(55, 18));
        txtNum3.setText("Gosque");

        lbNum4 = new JLabel("Puntos:");
        lbNum4.setPreferredSize(new Dimension(55, 18));

        txtNum4 = new JTextField();
        txtNum4.setPreferredSize(new Dimension(55, 18));
        txtNum4.setText("100");

        setBorder(new TitledBorder("Datos Perro"));



        add(lbNum1);
        add(txtNum1);
        add(lbNum3);
        add(txtNum3);
        add(lbNum2);
        add(txtNum2);
        add(lbNum4);
        add(txtNum4);


        JPanel panelBotones = new JPanel();
    	panelBotones.setLayout(new GridLayout(2, 2));
    	ImageIcon icono = new ImageIcon("C:\\Users\\57314\\Documents\\Trabajos java\\TallerGUI\\FotoPerro.png"); // Cambiar por la ruta de tu imagen
    	JButton boton1 = new JButton(icono);
    	 boton1.setPreferredSize(new Dimension(100, 100));
    	panelBotones.add(boton1);

    	add(panelBotones);
    	

    	

        
    }
}












