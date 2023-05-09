package GUIS;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class InicioSesion extends JFrame implements ActionListener {
    private JTextField nombreUsuario;
    private JPasswordField contrasenia;
    private JButton botonIniciarSesion;
    private JButton botonCrearUsuario;
    private JTextField nuevoNombreUsuario;
    private JPasswordField nuevaContrasenia;
    private JTextField nuevoCorreoElectronico;

    public InicioSesion() {
        // Config de la ventana principal
        setTitle("Inicio de sesión");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Panel para el formulario de inicio de sesión
        JPanel panelInicioSesion = new JPanel(new GridLayout(3, 2));
        JLabel etiquetaNombreUsuario = new JLabel("Nombre de usuario:");
        nombreUsuario = new JTextField();
        JLabel etiquetaContrasenia = new JLabel("Contraseña:");
        contrasenia = new JPasswordField();
        botonIniciarSesion = new JButton("Iniciar sesión");
        botonIniciarSesion.addActionListener(this);
        panelInicioSesion.add(etiquetaNombreUsuario);
        panelInicioSesion.add(nombreUsuario);
        panelInicioSesion.add(etiquetaContrasenia);
        panelInicioSesion.add(contrasenia);
        panelInicioSesion.add(new JLabel());
        panelInicioSesion.add(botonIniciarSesion);

        // Panel para el formulario de creación de usuario
        JPanel panelCrearUsuario = new JPanel(new GridLayout(4, 2));
        JLabel etiquetaNuevoNombreUsuario = new JLabel("Nuevo nombre de usuario:");
        nuevoNombreUsuario = new JTextField();
        JLabel etiquetaNuevaContrasenia = new JLabel("Nueva contraseña:");
        nuevaContrasenia = new JPasswordField();
        JLabel etiquetaNuevoCorreoElectronico = new JLabel("Correo electrónico:");
        nuevoCorreoElectronico = new JTextField();
        botonCrearUsuario = new JButton("Crear usuario");
        botonCrearUsuario.addActionListener(this);
        panelCrearUsuario.add(etiquetaNuevoNombreUsuario);
        panelCrearUsuario.add(nuevoNombreUsuario);
        panelCrearUsuario.add(etiquetaNuevaContrasenia);
        panelCrearUsuario.add(nuevaContrasenia);
        panelCrearUsuario.add(etiquetaNuevoCorreoElectronico);
        panelCrearUsuario.add(nuevoCorreoElectronico);
        panelCrearUsuario.add(new JLabel());
        panelCrearUsuario.add(botonCrearUsuario);

        // Paneles de pestañas para los formularios
        JTabbedPane pestanas = new JTabbedPane();
        pestanas.addTab("Iniciar sesión", panelInicioSesion);
        pestanas.addTab("Crear usuario", panelCrearUsuario);
        add(pestanas, BorderLayout.CENTER);

        setVisible(true);
    }

    // Evento 
    public void actionPerformed(ActionEvent evento) {
        if (evento.getSource() == botonIniciarSesion) {
            // Lógica para iniciar sesión con el nombre de usuario y contraseña ingresados
            // ...
        } else if (evento.getSource() == botonCrearUsuario) {
            // Lógica para crear un nuevo usuario con los valores ingresados
            // ...
        }
    }

    public static void main(String[] args) {
        new InicioSesion();
    }
}
