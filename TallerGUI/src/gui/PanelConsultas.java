package gui;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.JTable;

public class PanelConsultas extends JPanel implements ActionListener {
	
    private JButton btnGanador;
    private JButton btnMenorPuntaje;
    private JButton btnViejo;

    private VentanaExposicion padre;

    public PanelConsultas(VentanaExposicion papa) {
        padre = papa;

        setBorder(new TitledBorder("Consultas Exposición"));

        btnGanador = new JButton("Ganador");
        btnGanador.setPreferredSize(new Dimension(200, 30));
        btnGanador.addActionListener(this);

        btnMenorPuntaje = new JButton("Menor Puntaje");
        btnMenorPuntaje.setPreferredSize(new Dimension(200, 30));
        btnMenorPuntaje.addActionListener(this);

        btnViejo = new JButton("Más Viejo");
        btnViejo.setPreferredSize(new Dimension(200, 30));
        btnViejo.addActionListener(this);



        setLayout(new FlowLayout());

        add(btnGanador);
        add(btnMenorPuntaje);
        add(btnViejo);
        

    }
    
    

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
