package view;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IU_Mensajeria extends JFrame {
    // Componentes de la interfaz de usuario
    private JTextArea mensajesArea;
    private JTextField mensajeCampo;
    private JButton enviarBtn;

    public IU_Mensajeria() {
        // Configuración de la ventana
        setTitle("Mensajería");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Componentes de la interfaz
        mensajesArea = new JTextArea();
        mensajesArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(mensajesArea);
        add(scrollPane, BorderLayout.CENTER);

        mensajeCampo = new JTextField();
        add(mensajeCampo, BorderLayout.SOUTH);

        enviarBtn = new JButton("Enviar");
        enviarBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Lógica para enviar el mensaje
                String mensaje = mensajeCampo.getText();
                mensajesArea.append("Yo: " + mensaje + "\n");
                mensajeCampo.setText("");
            }
        });
        add(enviarBtn, BorderLayout.EAST);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                IU_Mensajeria ventana = new IU_Mensajeria();
                ventana.setVisible(true);
            }
        });
    }
}
