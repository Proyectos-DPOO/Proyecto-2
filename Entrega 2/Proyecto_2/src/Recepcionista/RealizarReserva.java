package Recepcionista;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class RealizarReserva extends JFrame implements ActionListener {
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JButton guardarButton;

    public RealizarReserva() {
        setTitle("Crear Reserva");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(0, 1)); // Utilizamos GridLayout con una columna para apilar los JLabels

        JLabel personaLabel = new JLabel("Numero de personas:");
        add(personaLabel);

        textField2 = new JTextField(20); // 20 caracteres de ancho
        add(textField2);

        JLabel camaLabel = new JLabel("Numero de camas:");
        add(camaLabel);

        textField3 = new JTextField(20); // 20 caracteres de ancho
        add(textField3);

        JLabel precioLabel = new JLabel("Precio estimado:");
        add(precioLabel);

        textField4 = new JTextField(20); // 20 caracteres de ancho
        add(textField4);

        guardarButton = new JButton("Verificar");
        guardarButton.addActionListener(this);
        add(guardarButton);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new RealizarReserva();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == guardarButton) {
            buscarHabitacion();
        }
		
    }

    private void buscarHabitacion() {
        String numeroPersonas = textField2.getText();
        String numeroCamas = textField3.getText();
        String precio = textField4.getText();

        try (BufferedReader reader = new BufferedReader(new FileReader("crear habitacion.csv"))) {
            String line;
            boolean habitacionEncontrada = false;

            // Iterar sobre cada línea del archivo
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");

                // Comparar los datos de la línea con los datos ingresados
                if (data.length == 3 && data[0].equals(numeroPersonas) && data[1].equals(numeroCamas)
                        && data[2].equals(precio)) {
                    habitacionEncontrada = true;
                    break;
                }
            }

            if (habitacionEncontrada) {
                System.out.println("TRUE - Habitación encontrada y marcada como ocupada");
            } else {
                System.out.println("FALSE - No existe una habitación con esos requerimientos");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}




