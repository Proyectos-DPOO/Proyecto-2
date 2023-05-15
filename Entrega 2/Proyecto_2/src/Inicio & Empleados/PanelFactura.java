package GUIS;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelFactura extends JPanel implements ActionListener {
    private JTextField habitacionField;
    private JTextField serviciosField;
    private JTextField totalField;
    private JButton actualizarButton;

    public PanelFactura() {
        setLayout(new GridLayout(4, 2));

        JLabel habitacionLabel = new JLabel("Habitación:");
        habitacionField = new JTextField(10);
        add(habitacionLabel);
        add(habitacionField);

        JLabel serviciosLabel = new JLabel("Servicios:");
        serviciosField = new JTextField(10);
        serviciosField.setEditable(false);
        add(serviciosLabel);
        add(serviciosField);

        JLabel totalLabel = new JLabel("Total:");
        totalField = new JTextField(10);
        totalField.setEditable(false);
        add(totalLabel);
        add(totalField);

        actualizarButton = new JButton("Actualizar factura");
        actualizarButton.addActionListener(this);
        add(actualizarButton);

        setPreferredSize(new Dimension(400, 150));
    }

    public void actualizarFactura(int habitacion, String servicios, double total) {
        habitacionField.setText(String.valueOf(habitacion));
        serviciosField.setText(servicios);
        totalField.setText(String.valueOf(total));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Logica para actualizar la factura en caso de que se realice algún cambio
        
    }
}

