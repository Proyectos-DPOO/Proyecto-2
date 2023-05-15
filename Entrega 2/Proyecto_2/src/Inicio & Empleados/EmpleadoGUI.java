package GUIS;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EmpleadoGUI extends JFrame implements ActionListener {
    private JPanel mainPanel;
    
    
    private JPanel habitacionPanel;
    
    private JPanel serviciosPanel;
    
    private JPanel facturaPanel;
    private JLabel habitacionLabel;
    
    private JTextField habitacionField;
    private JCheckBox spaCheckBox;
    private JCheckBox comidaCheckBox;
    private JCheckBox licorCheckBox;
    private JButton generarFacturaButton;
    private JTextArea facturaTextArea;

    public EmpleadoGUI() {
        setTitle("Empleado");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(800, 600));

        // Panel para el número de habitación
        habitacionPanel = new JPanel();
        habitacionPanel.setLayout(new FlowLayout());
        habitacionLabel = new JLabel("Número de habitación:");
        habitacionField = new JTextField(5);
        habitacionPanel.add(habitacionLabel);
        habitacionPanel.add(habitacionField);

        // Panel para los servicios
        serviciosPanel = new JPanel();
        serviciosPanel.setLayout(new GridLayout(3, 1));
        spaCheckBox = new JCheckBox("Spa ($50)");
        comidaCheckBox = new JCheckBox("Comida ($25)");
        licorCheckBox = new JCheckBox("Licor ($10)");
        serviciosPanel.add(spaCheckBox);
        serviciosPanel.add(comidaCheckBox);
        serviciosPanel.add(licorCheckBox);

        // Botón para generar la factura final
        generarFacturaButton = new JButton("Generar factura");
        generarFacturaButton.addActionListener(this);

        // Panel para la factura
        facturaPanel = new JPanel();
        facturaPanel.setLayout(new BorderLayout());
        facturaTextArea = new JTextArea();
        facturaTextArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(facturaTextArea);
        facturaPanel.add(scrollPane, BorderLayout.CENTER);

        // Panel principal que contiene todos los demás paneles
        mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(3, 1));
        mainPanel.add(habitacionPanel);
        mainPanel.add(serviciosPanel);
        mainPanel.add(generarFacturaButton);

        // Agregamos el panel principal a la ventana
        add(mainPanel);
        pack();
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == generarFacturaButton) {
            // Obtenemos el número de habitación y los servicios seleccionados
            int habitacion = Integer.parseInt(habitacionField.getText());
            boolean spa = spaCheckBox.isSelected();
            boolean comida = comidaCheckBox.isSelected();
            boolean licor = licorCheckBox.isSelected();

            // Calculamos el total de la factura
            int total = 0;
            String servicios = "";
            if (spa) {
                total += 50;
                servicios += "Spa ($50)\n";
            }
            if (comida) {
                total += 25;
                servicios += "Comida ($25)\n";
            }
            if (licor) {
                total += 10;
                servicios += "Licor ($10)\n";
            }

            // Mostramos la factura generada
            facturaTextArea.setText("Factura para habitación " + habitacion + ":\n\n" + servicios + "\nTotal: $" + total);
        }
    }

    public static void main(String[] args) {
        EmpleadoGUI empleadoGUI = new EmpleadoGUI();
    }
}
