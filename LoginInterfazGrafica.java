import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginInterfazGrafica extends JFrame {

    public LoginInterfazGrafica() {
        setTitle("Inicio de Sesión");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JLabel label = new JLabel("Contraseña:");
        JTextField passwordField = new JPasswordField();

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        JButton aceptarButton = new JButton("Aceptar");
        JButton cancelarButton = new JButton("Cancelar");

        aceptarButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String password = passwordField.getText();
                if (password.equals("damocles")) {
                    dispose();
                    new MiInterfazGrafica();
                } else {
                    JOptionPane.showMessageDialog(null, "Contraseña incorrecta", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        cancelarButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        panel.add(aceptarButton);
        panel.add(cancelarButton);

        add(label, BorderLayout.NORTH);
        add(passwordField, BorderLayout.CENTER);
        add(panel, BorderLayout.SOUTH);

        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new LoginInterfazGrafica();
            }
        });
    }
}
