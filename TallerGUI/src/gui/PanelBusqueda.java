package gui;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PanelBusqueda extends JPanel implements ActionListener {
	
    private JButton btnRaza;
    private JButton btnPuntos;
    private JButton btnEdad;
    private JButton btnBusqueda;

    private VentanaExposicion padre;

    public PanelBusqueda(VentanaExposicion papa) {
        padre = papa;

        setBorder(new TitledBorder("Búsqueda y ordenamientos"));

        btnRaza = new JButton("Ordenar por Raza");
        btnRaza.setPreferredSize(new Dimension(220, 30));
        btnRaza.addActionListener(this);

        btnPuntos = new JButton("Ordenar por Puntos");
        btnPuntos.setPreferredSize(new Dimension(220, 30));
        btnPuntos.addActionListener(this);

        btnEdad = new JButton("Ordenar por Edad");
        btnEdad.setPreferredSize(new Dimension(220, 30));
        btnEdad.addActionListener(this);

        btnBusqueda = new JButton("Buscar Perro");
        btnBusqueda.setPreferredSize(new Dimension(220, 30));
        btnBusqueda.addActionListener(this);

        setLayout(new FlowLayout());

        add(btnRaza);
        add(btnPuntos);
        add(btnEdad);
        add(btnBusqueda);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
