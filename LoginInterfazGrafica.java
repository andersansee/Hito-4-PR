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

class MiInterfazGrafica extends JFrame {

    public MiInterfazGrafica() {
        setTitle("Mi Interfaz Gráfica");
        setSize(400, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);

        String[] opciones = {"Sol"};
        JComboBox<String> opcionesComboBox = new JComboBox<>(opciones);
        opcionesComboBox.setSelectedIndex(0);

        opcionesComboBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String opcionSeleccionada = (String) opcionesComboBox.getSelectedItem();
                JOptionPane.showMessageDialog(null, "Seleccionaste: " + opcionSeleccionada);
            }
        });

        ImageIcon imagen = new ImageIcon("sol.jpg");

        JLabel imagenLabel = new JLabel();
        imagenLabel.setIcon(imagen);

        JCheckBox checkBox = new JCheckBox("Click aquí");

        JTextField textField = new JTextField(20);

        JLabel commentLabel = new JLabel("Save your comment");

        JButton saveButton = new JButton("Guardar");
        saveButton.addActionListener(new ActionListener() {
    }
}
}