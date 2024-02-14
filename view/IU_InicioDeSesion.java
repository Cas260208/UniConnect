package view;
import javax.swing.*;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

import model.Modulo_Autenticacion.Autenticacion;

import java.awt.*;

public class IU_InicioDeSesion {
    public static void main(String[] args) {
        JFrame frame = new JFrame("VORADA - Inicio de sesión");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setBackground(Color.decode("#F8EEFF")); // Color de fondo pastel
        frame.add(panel);
        placeComponents(panel);

        // imagen 
        ImageIcon imageIcon = new ImageIcon("view\\image\\Logo-Vorada.png");
        Image image = imageIcon.getImage();
        Image scaledImage = image.getScaledInstance(200, 200,  java.awt.Image.SCALE_SMOOTH);
        imageIcon = new ImageIcon(scaledImage);

        // Crea un JLabel con la imagen y añádelo al panel
        JLabel imageLabel = new JLabel(imageIcon);
        panel.add(imageLabel);
        frame.setVisible(true);
    }

    private static void placeComponents(JPanel panel) {
        panel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gbc.fill = GridBagConstraints.HORIZONTAL;

        JLabel userLabel = new JLabel("Correo electrónico o número telefónico");
        userLabel.setForeground(Color.decode("#000000")); // Color de texto pastel
        panel.add(userLabel, gbc);

        JTextField userText = new JTextField(20);
        panel.add(userText, gbc);

        JLabel passwordLabel = new JLabel("Contraseña");
        passwordLabel.setForeground(Color.decode("#000000")); // Color de texto pastel
        panel.add(passwordLabel, gbc);

        JPasswordField passwordText = new JPasswordField(20);
        panel.add(passwordText, gbc);

        JCheckBox rememberMe = new JCheckBox("Recuérdame");
        rememberMe.setForeground(Color.decode("#5271FF")); // Color de texto pastel
        panel.add(rememberMe, gbc);

        JButton loginButton = new JButton("Iniciar sesión");
        loginButton.setBackground(Color.decode("#CA76CD")); // Color de botón pastel
        panel.add(loginButton, gbc);

        JLabel registerPrompt = new JLabel("¿Aún no tienes cuenta?");
        registerPrompt.setForeground(Color.decode("#000000")); // Color de texto pastel
        panel.add(registerPrompt, gbc);

        JButton registerButton = new JButton("REGÍSTRATE");
        registerButton.setBackground(Color.decode("#91CDC2")); // Color de botón pastel
        panel.add(registerButton, gbc);
    }
}
