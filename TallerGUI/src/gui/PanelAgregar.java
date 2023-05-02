package gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelAgregar extends JPanel {

    private JLabel lbNombre;
    private JLabel lbRaza;
    private JLabel lbEdad;
    private JLabel lbPuntos;
    private JLabel lbImagen;
    private JLabel lbInvisible; 

    private JTextField txtNombre;
    private JTextField txtRaza;
    private JTextField txtEdad;
    private JTextField txtPuntos;
    private JTextField txtImagen;

    private JButton btnExaminar;
    private JButton btnAgregar;
    private JButton btnInvisible;

    public PanelAgregar() {

        lbNombre = new JLabel("Nombre:");
        lbNombre.setPreferredSize(new Dimension(55, 15));
        txtNombre = new JTextField();
        txtNombre.setPreferredSize(new Dimension(100, 25));
        

        lbRaza = new JLabel("Raza:");
        lbRaza.setPreferredSize(new Dimension(55, 15));
        txtRaza = new JTextField();
        txtRaza.setPreferredSize(new Dimension(100, 25));

        lbEdad = new JLabel("Edad:");
        lbEdad.setPreferredSize(new Dimension(55, 15));
        txtEdad = new JTextField();
        txtEdad.setPreferredSize(new Dimension(100, 25));

        lbPuntos = new JLabel("Puntos:");
        lbPuntos.setPreferredSize(new Dimension(55, 15));
        txtPuntos = new JTextField();
        txtPuntos.setPreferredSize(new Dimension(100, 25));

        lbImagen = new JLabel("Imagen:");
        lbImagen.setPreferredSize(new Dimension(55, 15));
        txtImagen = new JTextField();
        txtImagen.setPreferredSize(new Dimension(20, 25));

        btnExaminar = new JButton("Examinar");
        btnExaminar.setPreferredSize(new Dimension(89, 25));
        btnAgregar = new JButton("Agregar Perro");
        btnAgregar.setPreferredSize(new Dimension(150, 25));
        lbInvisible = new JLabel("");
        lbInvisible.setPreferredSize(new Dimension(145, 25));
       
        
        


        setBorder(new TitledBorder("Agregar Perro"));


        add(lbNombre);
        add(txtNombre);
        add(lbRaza);
        add(txtRaza);
        add(lbEdad);
        add(txtEdad);
        add(lbPuntos);
        add(txtPuntos);
        add(lbImagen);
        add(txtImagen);
        add(btnExaminar);
        add(lbInvisible);
        add(btnAgregar);

        setSize(new Dimension(450,250));
        
    }
}
