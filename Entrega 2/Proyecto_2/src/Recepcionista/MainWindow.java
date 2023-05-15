package Recepcionista;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class MainWindow extends JFrame implements ActionListener {
    private JButton cancelacionConsumoButton;
    private JButton cancelacionReservaButton;
    private JButton checkInButton;
    private JButton checkOutButton;
    private JButton facturaButton;
    private JButton realizarReservaButton;

    public MainWindow() {
        setTitle("Main Window");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(6, 1, 5, 5)); // Utilizamos GridLayout para apilar los botones

        cancelacionConsumoButton = new JButton("Cancelacion Consumo");
        cancelacionConsumoButton.addActionListener(this);
        panel.add(cancelacionConsumoButton);

        cancelacionReservaButton = new JButton("Cancelacion Reserva");
        cancelacionReservaButton.addActionListener(this);
        panel.add(cancelacionReservaButton);

        checkInButton = new JButton("CheckIn");
        checkInButton.addActionListener(this);
        panel.add(checkInButton);

        checkOutButton = new JButton("CheckOut");
        checkOutButton.addActionListener(this);
        panel.add(checkOutButton);

        facturaButton = new JButton("Factura");
        facturaButton.addActionListener(this);
        panel.add(facturaButton);

        realizarReservaButton = new JButton("Realizar Reserva");
        realizarReservaButton.addActionListener(this);
        panel.add(realizarReservaButton);

        add(panel);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object o = e.getSource();
        if (o == cancelacionConsumoButton) {
            JOptionPane.showMessageDialog(null, "Cancelar");
        } else if (o == checkInButton) {
            dispose(); // Cerrar la ventana actual
            new Checkin(); // Abrir el panel "Realizar Reserva CheckIn"
        }
    }

    public static void main(String[] args) {
        new MainWindow();
    }
}
