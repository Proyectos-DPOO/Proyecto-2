package Recepcionista;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Cama extends JPanel implements ActionListener {
    public Cama() {
        setLayout(new GridLayout(0, 1)); 
        setSize(400, 400);

        JButton sencillaButton = new JButton("Sencilla");
        sencillaButton.addActionListener(this);
        add(sencillaButton);

        JButton dobleButton = new JButton("Doble");
        dobleButton.addActionListener(this);
        add(dobleButton);

        JButton queenButton = new JButton("Queen");
        queenButton.addActionListener(this);
        add(queenButton);

        JButton kingButton = new JButton("King");
        kingButton.addActionListener(this);
        add(kingButton);

        JButton kidButton = new JButton("Kid");
        kidButton.addActionListener(this);
        add(kidButton);
    }

    public void actionPerformed(ActionEvent e) {
        JFrame frame = new JFrame("Buscar y Añadir");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        BuscarAnadir buscarAnadirPanel = new BuscarAnadir();
        frame.getContentPane().add(buscarAnadirPanel);
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Cama camaPanel = new Cama();
        frame.getContentPane().add(camaPanel);
        frame.pack();
        frame.setVisible(true);
    }
}
