// import javax.swing.*;

// public class Main extends JFrame {
//     JTabbedPane tp;

//     public Main () {
//         super("Main");
//         setSize(700,540);
//         // setLayout(null);

//         tp = new JTabbedPane();

//         // INISIALISASI PANEL
//         Panel_Dashboard pnl_Dashboard = new Panel_Dashboard();
//         Panel_Input pnl_Input = new Panel_Input();
//         Panel_About pnl_About = new Panel_About();

//         tp.addTab("Dashboard", pnl_Dashboard);
//         tp.addTab("Input", pnl_Input);
//         tp.addTab("About", pnl_About);

//         add(tp);

//         setLocationRelativeTo(null);
//         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         setVisible(true);
//     }

//     public static void main(String[] args) {
//         new Main();
//     }
// }

// import javax.swing.*;
// import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;

// public class Main extends JFrame {
//     JTabbedPane tp;
//     JPanel loginPanel;
//     JTextField txtUsername;
//     JPasswordField txtPassword;
//     JButton btnLogin;

//     public Main() {
//         super("Main");
//         setSize(400, 200);
//         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         setLocationRelativeTo(null);

//         // Buat panel login
//         createLoginPanel();

//         // Tambahkan panel login ke frame utama
//         add(loginPanel);
//         setVisible(true);
//     }

//     private void createLoginPanel() {
//         loginPanel = new JPanel(null);

//         JLabel labelUsername = new JLabel("Username:");
//         labelUsername.setBounds(20, 30, 100, 30);
//         txtUsername = new JTextField();
//         txtUsername.setBounds(100, 30, 160, 30);

//         JLabel labelPassword = new JLabel("Password:");
//         labelPassword.setBounds(20, 70, 100, 30);
//         txtPassword = new JPasswordField();
//         txtPassword.setBounds(100, 70, 160, 30);

//         btnLogin = new JButton("Login");
//         btnLogin.setBounds(150, 110, 80, 30);

//         loginPanel.add(labelUsername);
//         loginPanel.add(txtUsername);
//         loginPanel.add(labelPassword);
//         loginPanel.add(txtPassword);
//         loginPanel.add(btnLogin);

//         btnLogin.addActionListener(new ActionListener() {
//             @Override
//             public void actionPerformed(ActionEvent e) {
//                 String username = txtUsername.getText();
//                 String password = new String(txtPassword.getPassword());

//                 // Contoh username dan password yang benar
//                 String correctUsername = "Juan";
//                 String correctPassword = "1701";

//                 if (username.equals(correctUsername) && password.equals(correctPassword)) {
//                     // Login berhasil, alihkan ke tabbed pane
//                     remove(loginPanel);
//                     createTabbedPane();
//                     add(tp);
//                     revalidate();
//                     repaint();
//                 } else {
//                     // Login gagal, tampilkan pesan
//                     JOptionPane.showMessageDialog(Main.this, "Login Gagal", "Error", JOptionPane.ERROR_MESSAGE);
//                 }
//             }
//         });
//     }

//     private void createTabbedPane() {
//         tp = new JTabbedPane();

//         // INISIALISASI PANEL
//         Panel_Dashboard pnl_Dashboard = new Panel_Dashboard();
//         Panel_Input pnl_Input = new Panel_Input();
//         Panel_About pnl_About = new Panel_About();

//         tp.addTab("Dashboard", pnl_Dashboard);
//         tp.addTab("Input", pnl_Input);
//         tp.addTab("About", pnl_About);
//     }

//     public static void main(String[] args) {
//         new Main();
//     }
// }

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame {
    JTabbedPane tp;
    JPanel loginPanel;
    JTextField txtUsername;
    JPasswordField txtPassword;
    JButton btnLogin;

    public Main() {
        super("Main");
        setSize(400, 200); // Ukuran untuk panel login
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Buat panel login
        createLoginPanel();

        // Tambahkan panel login ke frame utama
        add(loginPanel);
        setVisible(true);
    }

    private void createLoginPanel() {
        loginPanel = new JPanel(null);

        JLabel labelUsername = new JLabel("Username:");
        labelUsername.setBounds(20, 30, 100, 30);
        txtUsername = new JTextField();
        txtUsername.setBounds(100, 30, 160, 30);

        JLabel labelPassword = new JLabel("Password:");
        labelPassword.setBounds(20, 70, 100, 30);
        txtPassword = new JPasswordField();
        txtPassword.setBounds(100, 70, 160, 30);

        btnLogin = new JButton("Login");
        btnLogin.setBounds(150, 110, 80, 30);

        loginPanel.add(labelUsername);
        loginPanel.add(txtUsername);
        loginPanel.add(labelPassword);
        loginPanel.add(txtPassword);
        loginPanel.add(btnLogin);

        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = txtUsername.getText();
                String password = new String(txtPassword.getPassword());

                // Contoh username dan password yang benar
                String correctUsername = "Juan";
                String correctPassword = "1701";

                if (username.equals(correctUsername) && password.equals(correctPassword)) {
                    // Login berhasil, alihkan ke tabbed pane
                    remove(loginPanel);
                    createTabbedPane();
                    add(tp);
                    // Ubah ukuran frame menjadi lebih besar
                    setSize(700, 540);
                    setLocationRelativeTo(null); // Pusatkan frame setelah mengubah ukurannya
                    revalidate();
                    repaint();
                } else {
                    // Login gagal, tampilkan pesan
                    JOptionPane.showMessageDialog(Main.this, "Login Gagal", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }

    private void createTabbedPane() {
        tp = new JTabbedPane();

        // INISIALISASI PANEL
        Panel_Dashboard pnl_Dashboard = new Panel_Dashboard();
        Panel_Input pnl_Input = new Panel_Input();
        Panel_About pnl_About = new Panel_About();

        tp.addTab("Dashboard", pnl_Dashboard);
        tp.addTab("Input", pnl_Input);
        tp.addTab("About", pnl_About);

        add(tp);
    }

    public static void main(String[] args) {
        new Main();
    }
}
