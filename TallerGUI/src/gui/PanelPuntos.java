package gui;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.JTable;

public class PanelPuntos extends JPanel implements ActionListener {
	
    private JButton btnOp1;
    private JButton btnOp2;

    private VentanaExposicion padre;

    public PanelPuntos(VentanaExposicion papa) {
        padre = papa;

        setBorder(new TitledBorder("Puntos de Extensión"));

        btnOp1 = new JButton("Opción 1");
        btnOp1.setPreferredSize(new Dimension(200, 30));
        btnOp1.addActionListener(this);

        btnOp2 = new JButton("Opción 2");
        btnOp2.setPreferredSize(new Dimension(200, 30));
        btnOp2.addActionListener(this);




        setLayout(new FlowLayout());

        add(btnOp1);
        add(btnOp2);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
