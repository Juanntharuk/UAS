import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JPanel {
    private JTextField txtUsername;
    private JPasswordField txtPassword;
    private JButton btnLogin;

    public Login() {
        // super("Login");
        setSize(400, 200);
        setLayout(null);
        // setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel labelUsername = new JLabel("Username:");
        labelUsername.setBounds(50, 30, 100, 30);
        txtUsername = new JTextField();
        txtUsername.setBounds(150, 30, 150, 30);

        JLabel labelPassword = new JLabel("Password:");
        labelPassword.setBounds(50, 70, 100, 30);
        txtPassword = new JPasswordField();
        txtPassword.setBounds(150, 70, 150, 30);

        btnLogin = new JButton("Login");
        btnLogin.setBounds(150, 110, 80, 30);

        add(labelUsername);
        add(txtUsername);
        add(labelPassword);
        add(txtPassword);
        add(btnLogin);

        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = txtUsername.getText();
                String password = new String(txtPassword.getPassword());

                // Contoh username dan password yang benar
                String correctUsername = "Juan";
                String correctPassword = "1701";

                if (username.equals(correctUsername) && password.equals(correctPassword)) {
                    // Login berhasil, buka dashboard
                    dispose(); // Tutup frame login
                    new Panel_Dashboard(); // Buka frame dashboard
                } else {
                    // Login gagal, tampilkan pesan
                    JOptionPane.showMessageDialog(Login.this, "Login Gagal", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }

            private void dispose() {
                // TODO Auto-generated method stub
                throw new UnsupportedOperationException("Unimplemented method 'dispose'");
            }
        });

        // setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Login();
    }
}
