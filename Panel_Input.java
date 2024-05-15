import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Panel_Input extends JPanel {
    JLabel labelJudul, labelNama, labelNim, labelGender, labelAngkatan, labelAlamat, labelBahasa;
    JTextField txtNama, txtNim, txtAlamat;
    JRadioButton rbPria, rbPerempuan;
    ButtonGroup genderGroup;
    JComboBox<String> Angkatancmb ;
    JCheckBox cbJava, cbPhyton, cbKotlin, cbpp;
    JButton btnSubmit, btnBatal, btnHapus;
    DefaultTableModel tableModel;
    JTable dataTable;

    public Panel_Input() {
        // super("Input Data");
        setSize(700, 540);
        setLayout(null);

        // Label untuk judul
        labelJudul = new JLabel("INPUT DATA MAHASISWA");
        labelJudul.setBounds(280, 20, 180, 30);

        // Label dan field untuk Nama
        labelNama = new JLabel("Nama ");
        labelNama.setBounds(20, 80, 100, 30);
        txtNama = new JTextField();
        txtNama.setBounds(100, 80, 380, 30);

        // Label dan field untuk NIM
        labelNim = new JLabel("NIM ");
        labelNim.setBounds(20, 120, 100, 30);
        txtNim = new JTextField();
        txtNim.setBounds(100, 120, 380, 30);

        // Label untuk Gender dan radio button
        labelGender = new JLabel("Gender ");
        labelGender.setBounds(20, 160, 100, 30);
        rbPria = new JRadioButton("Laki-Laki");
        rbPria.setBounds(100, 160, 120, 30);
        rbPerempuan = new JRadioButton("perempuan");
        rbPerempuan.setBounds(200, 160, 120, 30);
        genderGroup = new ButtonGroup();
        genderGroup.add(rbPria);
        genderGroup.add(rbPerempuan);

        // Label untuk Angkatan dan JList
        labelAngkatan = new JLabel("Angkatan ");
        labelAngkatan.setBounds(20, 200, 100, 30);
        String[] angkatan = {"Pilih Angkatan --","2020", "2021", "2022", "2023", "2024"};
        Angkatancmb = new JComboBox<>(angkatan);
        Angkatancmb.setBounds(100, 200, 380, 30);

        // Label dan field untuk Alamat
        labelAlamat = new JLabel("Alamat ");
        labelAlamat.setBounds(20, 240, 100, 30);
        txtAlamat = new JTextField();
        txtAlamat.setBounds(100, 240, 380, 30);

        // Label untuk Bahasa dan checkbox
        labelBahasa = new JLabel("Bahasa ");
        labelBahasa.setBounds(20, 280, 100, 30);

        cbJava = new JCheckBox("Java");
        cbJava.setBounds(100, 280, 100, 30);

        cbPhyton = new JCheckBox("Phyton");
        cbPhyton.setBounds(180, 280, 100, 30);

        cbKotlin = new JCheckBox("Kotlin");
        cbKotlin.setBounds(260, 280, 100, 30);

        cbpp = new JCheckBox("C++");
        cbpp.setBounds(340, 280, 100, 30);

        // Button untuk submit data
        btnSubmit = new JButton("Submit");
        btnSubmit.setBounds(500, 80, 100, 50);

        btnBatal = new JButton("Batal");
        btnBatal.setBounds(500, 150, 100, 50);

        btnHapus = new JButton("Hapus");
        btnHapus.setBounds(500, 220, 100, 50);

        // Tabel untuk menampilkan output data
        tableModel = new DefaultTableModel();
        dataTable = new JTable(tableModel);

        // Menambahkan tabel ke dalam JScrollPane
        JScrollPane tableScrollPane = new JScrollPane(dataTable);

        // Mengatur scroll bar baik dalam arah horizontal maupun vertikal
        tableScrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        tableScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        tableScrollPane.setBounds(20, 370, 650, 120);
        tableModel.addColumn("Nama");
        tableModel.addColumn("NIM");
        tableModel.addColumn("Gender");
        tableModel.addColumn("Angkatan");
        tableModel.addColumn("Alamat");
        tableModel.addColumn("Bahasa");

        // Tambahkan semua komponen ke frame
        add(labelJudul);
        add(labelNama);
        add(txtNama);
        add(labelNim);
        add(txtNim);
        add(labelGender);
        add(rbPria);
        add(rbPerempuan);
        add(labelAngkatan);
        add(Angkatancmb);
        add(labelAlamat);
        add(txtAlamat);
        add(labelBahasa);
        add(cbJava);
        add(cbPhyton);
        add(cbKotlin);
        add(cbpp);
        add(btnSubmit);
        add(btnBatal);
        add(btnHapus);
        add(tableScrollPane);

        // Handler untuk tombol submit
        btnSubmit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Ambil data dari input
                String nama = txtNama.getText();
                String nim = txtNim.getText();
                String gender = rbPria.isSelected() ? "Male" : "Female";
                String angkatan = (String) Angkatancmb.getSelectedItem();
                String alamat = txtAlamat.getText();
                ArrayList<String> bahasaList = new ArrayList<>();
                if (cbJava.isSelected()) {
                    bahasaList.add("Java");
                }
                if (cbPhyton.isSelected()) {
                    bahasaList.add("Phyton");
                }
                if (cbKotlin.isSelected()) {
                    bahasaList.add("Kotlin,");
                }
                if (cbpp.isSelected()) {
                    bahasaList.add("C++,");
                }

                // Gabungkan bahasa-bahasa dari ArrayList menjadi satu string dengan koma sebagai pemisah
                // StringBuilder bahasaBuilder = new StringBuilder();
                // for (String bahasa : bahasaList) {
                //     if (bahasaBuilder.length() > 0) {
                //         bahasaBuilder.append(", ");
                //     }
                //     bahasaBuilder.append(bahasa);
                // }
                // String bahasa = bahasaBuilder.toString();

                String bahasa = String.join(", ", bahasaList);



                // Masukkan data ke dalam tabel
                tableModel.addRow(new Object[]{nama, nim, gender, angkatan, alamat, bahasa});

                // Kosongkan setiap Inputan
                txtNama.setText("");
                txtNim.setText("");
                txtAlamat.setText("");
                genderGroup.clearSelection();
                Angkatancmb.setSelectedIndex(0);
                cbJava.setSelected(false);
                cbPhyton.setSelected(false);           
                cbKotlin.setSelected(false);           
                cbpp.setSelected(false);           
            }
        });

        // Handler untuk tombol batal
        btnBatal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Mengosongkan field input
                txtNama.setText("");
                txtNim.setText("");
                txtAlamat.setText("");
                genderGroup.clearSelection();
                Angkatancmb.setSelectedIndex(0);
                cbJava.setSelected(false);
                cbPhyton.setSelected(false);
                cbKotlin.setSelected(false);           
                cbpp.setSelected(false);       
            }
        });

        // Handler untuk tombol hapus
        btnHapus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Ambil indeks baris yang dipilih
                int selectedRow = dataTable.getSelectedRow();
                // Hapus baris yang dipilih jika ada
                if (selectedRow != -1) {
                    tableModel.removeRow(selectedRow);
                } else {
                    JOptionPane.showMessageDialog(null, "Pilih baris yang ingin dihapus.");
                }
            }
        });

        // setLocationRelativeTo(null);
        // setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Panel_Input();
    }
}
