package Administrador;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelTarifasHabitaciones extends JPanel {
	
	
	private JLabel lbTipo;
    private JLabel lbFechaI;
    private JLabel lbFechaF;
    private JLabel lbDias;
    private JLabel lbAdicionales;

    private JTextField txtTipo;
    private JTextField txtFechaI;
    private JTextField txtFechaF;
    private JTextField txtDias;
    private JTextField txtAdicionales;

    private JButton btnCargar;

    public PanelTarifasHabitaciones() {

        lbTipo = new JLabel("Tipo de Habitación:");
        lbTipo.setPreferredSize(new Dimension(125, 15));
        String[] opciones = { "Estándar", "Suite", "Suite Doble" };
        JComboBox<String> lstTipo = new JComboBox<String>(opciones);
        lstTipo.setPreferredSize(new Dimension(100, lstTipo.getPreferredSize().height));
        

        lbFechaI = new JLabel("Fecha Inicio:");
        lbFechaI.setPreferredSize(new Dimension(125, 15));
        txtFechaI = new JTextField();
        txtFechaI.setPreferredSize(new Dimension(100, 25));

        lbFechaF = new JLabel("Fecha Fin:");
        lbFechaF.setPreferredSize(new Dimension(125, 15));
        txtFechaF = new JTextField();
        txtFechaF.setPreferredSize(new Dimension(100, 25));

        lbDias = new JLabel("Nueva Tarifa:");
        lbDias.setPreferredSize(new Dimension(125, 15));
        txtDias = new JTextField();
        txtDias.setPreferredSize(new Dimension(100, 25));
       

        btnCargar = new JButton("Cambiar Tarifa");
        btnCargar.setPreferredSize(new Dimension(129, 25));
       
        
        


        setBorder(new TitledBorder("Tarifas Habitaciones"));


        add(lbTipo);
        add(lstTipo);
        add(lbFechaI);
        add(txtFechaI);
        add(lbFechaF);
        add(txtFechaF);
        add(lbDias);
        add(txtDias);
        add(btnCargar);
        
        btnCargar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Obtener los valores de los componentes de la interfaz de usuario
                String tipo = (String) lstTipo.getSelectedItem();
                String fechaI = txtFechaI.getText();
                String fechaF = txtFechaF.getText();
                String tarifa = txtDias.getText();
                
                
                // Crear una instancia de la clase File y pasarle la ruta del archivo CSV
                File archivo = new File("C:\\Users\\57314\\Documents\\Trabajos java\\Proyecto_2\\data\\tarifas_habitaciones.csv");
                
                try {
                    // Abrir el archivo para escribir usando la clase PrintWriter
                    PrintWriter writer = new PrintWriter(new FileWriter(archivo, true));
                    
                    // Escribir los valores en formato CSV
                    writer.println(tipo + "," + fechaI + "," + fechaF + "," + tarifa);
                    
                    // Cerrar el archivo
                    writer.close();
                    
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        });


     //   setSize(new Dimension(300,250));
        
    }
}


