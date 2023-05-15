package Recepcionista;

import java.awt.BorderLayout;
import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
        JFrame ventana = new JFrame();
        ventana.setSize(800, 400);

        ventana.setLayout(new BorderLayout());

        MainWindow mainWindow = new MainWindow();
        ventana.add(mainWindow, BorderLayout.NORTH);

        RealizarReserva realizarReserva = new RealizarReserva();
        ventana.add(realizarReserva, BorderLayout.EAST);

        Cama cama = new Cama();
        ventana.add(cama, BorderLayout.CENTER);

        BuscarAnadir buscarAnadir = new BuscarAnadir();
        ventana.add(buscarAnadir, BorderLayout.WEST);

        ventana.setVisible(true);
    }
}
