package gui;


import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;


import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class VentanaExposicion extends JFrame {
    
	private PanelTiposdePerro panelTiposdePerro;
	private PanelDatosPerro panelDatosPerro;
	private PanelBusqueda panelBusqueda;
	private PanelConsultas panelConsultas;
	private PanelPuntos panelPuntos;
	private PanelAgregar panelAgregar;
	
    public VentanaExposicion() {
    	
    	panelTiposdePerro = new PanelTiposdePerro();
    	
		panelBusqueda = new PanelBusqueda(this);
		
		panelDatosPerro = new PanelDatosPerro();
		
		panelAgregar = new PanelAgregar();
		
		panelConsultas = new PanelConsultas(this);
		
		panelPuntos = new PanelPuntos(this);
    	
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        JPanel panel = new JPanel(new GridLayout(3, 1));


        JPanel fila1 = new JPanel(new GridLayout(1, 3));
        JPanel fila2 = new JPanel(new GridLayout(1, 2));
        JPanel fila3 = new JPanel(new GridLayout(1, 1));


        fila1.add(panelTiposdePerro);
        fila1.add(panelDatosPerro);
        fila1.add(panelBusqueda);

        
        fila2.add(panelAgregar);
        fila2.add(panelConsultas);


        fila3.add(panelPuntos);


        panel.add(fila1);
        panel.add(fila2);
        panel.add(fila3);

        
        getContentPane().add(panel);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
		setTitle("Exposición Canina");

        
        setSize(new Dimension(800,625));
    }
    
    public static void main(String[] args) {
        new VentanaExposicion();
    }



}