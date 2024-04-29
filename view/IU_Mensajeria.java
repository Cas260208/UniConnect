package view;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IU_Mensajeria extends JFrame {
    private JTextArea mensajesArea;
    private JTextField mensajeCampo;
    private JButton enviarBtn;

public IU_Mensajeria() {
    // Configuración de la ventana
    setTitle("Mensajería");
    setSize(300, 200);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // Componentes de la interfaz
    mensajesArea = new JTextArea();
    mensajeCampo = new JTextField();
    enviarBtn = new JButton("Enviar");

    // Diseño de la interfaz
    JPanel panel = new JPanel();
    panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
    panel.add(new JScrollPane(mensajesArea));
    panel.add(mensajeCampo);
    panel.add(enviarBtn);

    // Agregar panel a la ventana
    add(panel);
}

public static void main(String[] args) {
    SwingUtilities.invokeLater(() -> {
        IU_Mensajeria ventana = new IU_Mensajeria();
        ventana.setVisible(true);
    });
}    
}
