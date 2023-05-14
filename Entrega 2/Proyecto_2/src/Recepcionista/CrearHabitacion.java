package Recepcionista;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CrearHabitacion extends JFrame implements ActionListener {
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JButton guardarButton;

    public CrearHabitacion() {
        setTitle("Crear Habitación");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(0, 1)); // Utilizamos GridLayout con una columna para apilar los JLabels

        JLabel numeroLabel = new JLabel("Numero de Reserva:");
        add(numeroLabel);

        textField1 = new JTextField(20); // 20 caracteres de ancho
        add(textField1);

        JLabel personaLabel = new JLabel("Numero de personas:");
        add(personaLabel);

        textField2 = new JTextField(20); // 20 caracteres de ancho
        add(textField2);

        JLabel camaLabel = new JLabel("Numero de camas:");
        add(camaLabel);

        textField3 = new JTextField(20); // 20 caracteres de ancho
        add(textField3);

        JLabel precioLabel = new JLabel("Precio:");
        add(precioLabel);

        textField4 = new JTextField(20); // 20 caracteres de ancho
        add(textField4);

        guardarButton = new JButton("Guardar");
        guardarButton.addActionListener(this);
        add(guardarButton);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new CrearHabitacion();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == guardarButton) {
            guardarDatosEnCSV();
        }
    }

    private void guardarDatosEnCSV() {
        String numeroReserva = textField1.getText();
        String numeroPersonas = textField2.getText();
        String numeroCamas = textField3.getText();
        String precio = textField4.getText();

        // Crear la carpeta .data si no existe
        File dataFolder = new File(".data");
        if (!dataFolder.exists()) {
            dataFolder.mkdir();
        }

        String filePath = ".data/crear habitacion.csv";

        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write("Numero de Reserva,Numero de personas,Numero de camas,Precio\n");
            writer.write(numeroReserva + "," + numeroPersonas + "," + numeroCamas + "," + precio + "\n");
            System.out.println("Datos guardados en el archivo crear habitacion.csv");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


