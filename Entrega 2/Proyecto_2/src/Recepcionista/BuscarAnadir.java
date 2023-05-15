package Recepcionista;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BuscarAnadir extends JFrame implements ActionListener {
    private JButton buscarButton;
    private JButton anadirButton;

    public BuscarAnadir() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        buscarButton = new JButton("Buscar habitaciones con este tipo de cama");
        panel.add(buscarButton);

        anadirButton = new JButton("Añadir cama a la reserva");
        panel.add(anadirButton);

        add(panel);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Manejar eventos de botones aquí
    }

    public static void main(String[] args) {
        new BuscarAnadir();
    }
}
