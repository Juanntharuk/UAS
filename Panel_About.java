import javax.swing.*;

public class Panel_About extends JPanel {
    JLabel labelJudul, labelLogo;
    JButton backButton;

    public Panel_About() {
        // super("Tentang Kami");
        setSize(700, 540);
        setLayout(null);
        // getContentPane().setBackground(new Color(184, 134, 11));


        // // Judul atau label untuk frame Dashboard
        // labelJudul = new JLabel("Selamat datang di situs resmi Universitas Nusa Nipa");
        // labelJudul.setBounds(130, 80, 480, 30);
        // labelJudul.setFont(new Font("Arial", Font.BOLD, 18));

        // add(labelJudul);

        // Contoh informasi data (jumlah data)
        // labelLogo = new JLabel("Jumlah Data: 10");
        // labelLogo.setBounds(50, 80, 200, 30);
        // add(labelLogo);

        // setLocationRelativeTo(null);
        // setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Panel_Dashboard();
    }
}
