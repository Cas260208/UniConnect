package view;
import javax.swing.*;
import java.awt.*;



public class IU_Autenticacion extends JFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame("VORADA - Registro");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setBackground(Color.decode("#D8BFD8")); // Color de fondo pastel
        frame.add(panel);
        placeComponents(panel);

        frame.setVisible(true);
    }

    private static void placeComponents(JPanel panel) {
        panel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gbc.fill = GridBagConstraints.HORIZONTAL;

        JLabel nameLabel = new JLabel("Nombre");
        nameLabel.setForeground(Color.decode("#ADD8E6")); // Color de texto pastel
        panel.add(nameLabel, gbc);

        JTextField nameText = new JTextField(20);
        panel.add(nameText, gbc);

        JLabel surnameLabel = new JLabel("Apellido");
        surnameLabel.setForeground(Color.decode("#ADD8E6")); // Color de texto pastel
        panel.add(surnameLabel, gbc);

        JTextField surnameText = new JTextField(20);
        panel.add(surnameText, gbc);

        JLabel emailLabel = new JLabel("Correo electrónico o número telefónico");
        emailLabel.setForeground(Color.decode("#ADD8E6")); // Color de texto pastel
        panel.add(emailLabel, gbc);

        JTextField emailText = new JTextField(20);
        panel.add(emailText, gbc);

        JLabel passwordLabel = new JLabel("Contraseña");
        passwordLabel.setForeground(Color.decode("#ADD8E6")); // Color de texto pastel
        panel.add(passwordLabel, gbc);

        JPasswordField passwordText = new JPasswordField(20);
        panel.add(passwordText, gbc);

        JLabel birthdateLabel = new JLabel("Fecha de nacimiento");
        birthdateLabel.setForeground(Color.decode("#ADD8E6")); // Color de texto pastel
        panel.add(birthdateLabel, gbc);

        JComboBox<String> dayComboBox = new JComboBox<>();
        JComboBox<String> monthComboBox = new JComboBox<>();
        JComboBox<String> yearComboBox = new JComboBox<>();
        // Agrega los días, meses y años a los JComboBox aquí
        panel.add(dayComboBox, gbc);
        panel.add(monthComboBox, gbc);
        panel.add(yearComboBox, gbc);

        JLabel genderLabel = new JLabel("Sexo");
        genderLabel.setForeground(Color.decode("#ADD8E6")); // Color de texto pastel
        panel.add(genderLabel, gbc);

        JRadioButton femaleButton = new JRadioButton("Mujer");
        femaleButton.setForeground(Color.decode("#90EE90")); // Color de texto pastel
        panel.add(femaleButton, gbc);

        JRadioButton maleButton = new JRadioButton("Hombre");
        maleButton.setForeground(Color.decode("#90EE90")); // Color de texto pastel
        panel.add(maleButton, gbc);

        JRadioButton otherButton = new JRadioButton("Otra(o)");
        otherButton.setForeground(Color.decode("#90EE90")); // Color de texto pastel
        panel.add(otherButton, gbc);

        JButton registerButton = new JButton("REGÍSTRATE");
        registerButton.setBackground(Color.decode("#FFB6C1")); // Color de botón pastel
        panel.add(registerButton, gbc);

        JLabel loginPrompt = new JLabel("¿Ya tienes cuenta?");
        loginPrompt.setForeground(Color.decode("#ADD8E6")); // Color de texto pastel
        panel.add(loginPrompt, gbc);

        JButton loginButton = new JButton("INICIA SESIÓN");
        loginButton.setBackground(Color.decode("#FFB6C1")); // Color de botón pastel
        panel.add(loginButton, gbc);
    }
}

