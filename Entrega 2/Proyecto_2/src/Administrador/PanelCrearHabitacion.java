package Administrador;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.*;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;



public class PanelCrearHabitacion extends JPanel {

    private JLabel lbTipo;
    private JLabel lbId;
    private JLabel lbCamas;
    private JLabel lbDias;
    private JLabel lbAdicionales;

    // private JCalendar dateChooser;

    private JTextField txtId;
    private JTextField txtFechaF;
    private JTextField txtDias;
    private JTextField txtAdicionales;

    private JButton btnCargar;
    private JButton btnCrear;

    public PanelCrearHabitacion() {

        lbTipo = new JLabel("Tipo de Habitación:");
        lbTipo.setPreferredSize(new Dimension(125, 15));
        String[] opciones = { "Estándar", "Suite", "Suite Doble" };
        JComboBox<String> lstTipo = new JComboBox<String>(opciones);
        lstTipo.setPreferredSize(new Dimension(100, lstTipo.getPreferredSize().height));

        lbId = new JLabel("Identificador:");
        lbId.setPreferredSize(new Dimension(125, 15));
        txtId = new JTextField();
        txtId.setPreferredSize(new Dimension(100, 25));

        lbCamas = new JLabel("Tipo de camas:");
        lbCamas.setPreferredSize(new Dimension(125, 15));
        String[] opciones2 = { "Sencilla (1)","Doble(2)", "Sencillas (2)", "Doble y sencilla (3)","Sencillas (3)","Doble y sencillas (4)", "Dobles (4)", "Sencillas (4)" };
        JComboBox<String> lstCamas = new JComboBox<String>(opciones2);
        lstCamas.setPreferredSize(new Dimension(100, lstCamas.getPreferredSize().height));

       
        lbAdicionales = new JLabel("Adicionales:");
        lbAdicionales.setPreferredSize(new Dimension(125, 15));
        String[] opciones3 = { "Ninguno","Balcón", "Vista", "Cocina" };
        JComboBox<String> lstAdicionales = new JComboBox<String>(opciones3);
        lstAdicionales.setPreferredSize(new Dimension(100, lstAdicionales.getPreferredSize().height));

        btnCrear = new JButton("Crear Habitación");
        btnCrear.setPreferredSize(new Dimension(149, 25));
        
        btnCargar = new JButton("Cargar Archivo");
        btnCargar.setPreferredSize(new Dimension(149, 25));
        btnCargar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                int resultado = fileChooser.showOpenDialog(null);
              
            }
        });

        setBorder(new TitledBorder("Crear Habitación"));

        add(lbId);
        add(txtId);
        add(lbTipo);
        add(lstTipo);
        
        add(lbCamas);
        add(lstCamas);

        add(lbAdicionales);
        add(lstAdicionales);

        add(btnCrear);
        add(btnCargar);
        
        btnCrear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Obtener los valores de los componentes de la interfaz de usuario
                String tipo = (String) lstTipo.getSelectedItem();
                String id = txtId.getText();
                String camas = (String) lstCamas.getSelectedItem();
                String adicionales = (String) lstAdicionales.getSelectedItem();
                
                // Crear una instancia de la clase File y pasarle la ruta del archivo CSV
                File archivo = new File("C:\\Users\\57314\\Documents\\Trabajos java\\Proyecto_2\\data\\habitaciones_creadas.csv");
                
                try {
                    // Abrir el archivo para escribir usando la clase PrintWriter
                    PrintWriter writer = new PrintWriter(new FileWriter(archivo, true));
                    
                    // Escribir los valores en formato CSV
                    writer.println(id + "," + tipo + "," + camas + "," + adicionales);
                    
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
