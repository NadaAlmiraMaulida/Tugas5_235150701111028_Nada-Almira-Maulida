

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormPendaftaran extends JFrame {
    private JTextField namaField, tanggalLahirField, nomorPendaftaranField, noTelpField, alamatField, emailField;
    private JButton submitButton;

    public FormPendaftaran() {
        setTitle("Form Pendaftaran Mahasiswa Baru");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(7, 2, 5, 5));

        
        setLocationRelativeTo(null);

     
        getContentPane().setBackground(new Color(255, 182, 193)); 

        JLabel namaLabel = new JLabel("Nama Lengkap:");
        namaField = new JTextField();

        JLabel tanggalLahirLabel = new JLabel("Tanggal Lahir:");
        tanggalLahirField = new JTextField();

        JLabel nomorPendaftaranLabel = new JLabel("Nomor Pendaftaran:");
        nomorPendaftaranField = new JTextField();

        JLabel noTelpLabel = new JLabel("No. Telp:");
        noTelpField = new JTextField();

        JLabel alamatLabel = new JLabel("Alamat:");
        alamatField = new JTextField();

        JLabel emailLabel = new JLabel("E-mail:");
        emailField = new JTextField();

        submitButton = new JButton("Submit");
        submitButton.addActionListener(new SubmitAction());

       
        Color labelColor = Color.BLACK; 
        Color fieldColor = Color.WHITE;
        Color buttonColor = new Color(255, 105, 180); 
        Color buttonTextColor = Color.WHITE;

        namaLabel.setForeground(labelColor);
        tanggalLahirLabel.setForeground(labelColor);
        nomorPendaftaranLabel.setForeground(labelColor);
        noTelpLabel.setForeground(labelColor);
        alamatLabel.setForeground(labelColor);
        emailLabel.setForeground(labelColor);

        namaField.setBackground(fieldColor);
        tanggalLahirField.setBackground(fieldColor);
        nomorPendaftaranField.setBackground(fieldColor);
        noTelpField.setBackground(fieldColor);
        alamatField.setBackground(fieldColor);
        emailField.setBackground(fieldColor);

        submitButton.setBackground(buttonColor);
        submitButton.setForeground(buttonTextColor);

        
        add(namaLabel);
        add(namaField);
        add(tanggalLahirLabel);
        add(tanggalLahirField);
        add(nomorPendaftaranLabel);
        add(nomorPendaftaranField);
        add(noTelpLabel);
        add(noTelpField);
        add(alamatLabel);
        add(alamatField);
        add(emailLabel);
        add(emailField);
        add(new JLabel());
        add(submitButton);

        setVisible(true);
    }

    private class SubmitAction implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (namaField.getText().isEmpty() || tanggalLahirField.getText().isEmpty() ||
                nomorPendaftaranField.getText().isEmpty() || noTelpField.getText().isEmpty() ||
                alamatField.getText().isEmpty() || emailField.getText().isEmpty()) {

                JOptionPane.showMessageDialog(FormPendaftaran.this, "Semua kolom harus diisi!", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                int response = JOptionPane.showConfirmDialog(FormPendaftaran.this, "Apakah anda yakin data yang Anda isi sudah benar?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
                if (response == JOptionPane.YES_OPTION) {
                    JFrame dataFrame = new JFrame("Data Mahasiswa");
                    dataFrame.setSize(400, 300);
                    dataFrame.setLayout(new BorderLayout());

                  
                    dataFrame.setLocationRelativeTo(null);

            
                    dataFrame.getContentPane().setBackground(new Color(255, 182, 193)); 

                    JPanel dataPanel = new JPanel(new GridBagLayout());
                    dataPanel.setBackground(new Color(255, 182, 193)); 
                    GridBagConstraints gbc = new GridBagConstraints();
                    gbc.insets = new Insets(5, 5, 5, 5);
                    gbc.anchor = GridBagConstraints.WEST;

                    
                    JPanel whiteBoxPanel = new JPanel(new GridBagLayout());
                    whiteBoxPanel.setBackground(Color.WHITE);
                    whiteBoxPanel.setBorder(BorderFactory.createBevelBorder(1)); 

                    Font dataFont = new Font("Arial", Font.BOLD, 12);

                    gbc.gridx = 0;
                    gbc.gridy = 0;
                    JLabel namaLabel = new JLabel("Nama:");
                    namaLabel.setFont(dataFont);
                    whiteBoxPanel.add(namaLabel, gbc);
                    gbc.gridx = 1;
                    JLabel namaData = new JLabel(namaField.getText());
                    namaData.setForeground(Color.darkGray);
                    whiteBoxPanel.add(namaData, gbc);

                    gbc.gridx = 0;
                    gbc.gridy = 1;
                    JLabel tanggalLahirLabel = new JLabel("Tanggal Lahir:");
                    tanggalLahirLabel.setFont(dataFont);
                    whiteBoxPanel.add(tanggalLahirLabel, gbc);
                    gbc.gridx = 1;
                    JLabel tanggalLahirData = new JLabel(tanggalLahirField.getText());
                    tanggalLahirData.setForeground(Color.darkGray);
                    whiteBoxPanel.add(tanggalLahirData, gbc);

                    gbc.gridx = 0;
                    gbc.gridy = 2;
                    JLabel nomorPendaftaranLabel = new JLabel("No. Pendaftaran:");
                    nomorPendaftaranLabel.setFont(dataFont);
                    whiteBoxPanel.add(nomorPendaftaranLabel, gbc);
                    gbc.gridx = 1;
                    JLabel nomorPendaftaranData = new JLabel(nomorPendaftaranField.getText());
                    nomorPendaftaranData.setForeground(Color.darkGray);
                    whiteBoxPanel.add(nomorPendaftaranData, gbc);

                    gbc.gridx = 0;
                    gbc.gridy = 3;
                    JLabel noTelpLabel = new JLabel("No. Telp:");
                    noTelpLabel.setFont(dataFont);
                    whiteBoxPanel.add(noTelpLabel, gbc);
                    gbc.gridx = 1;
                    JLabel noTelpData = new JLabel(noTelpField.getText());
                    noTelpData.setForeground(Color.darkGray);
                    whiteBoxPanel.add(noTelpData, gbc);

                    gbc.gridx = 0;
                    gbc.gridy = 4;
                    JLabel alamatLabel = new JLabel("Alamat:");
                    alamatLabel.setFont(dataFont);
                    whiteBoxPanel.add(alamatLabel, gbc);
                    gbc.gridx = 1;
                    JLabel alamatData = new JLabel(alamatField.getText());
                    alamatData.setForeground(Color.darkGray);
                    whiteBoxPanel.add(alamatData, gbc);

                    gbc.gridx = 0;
                    gbc.gridy = 5;
                    JLabel emailLabel = new JLabel("E-mail:");
                    emailLabel.setFont(dataFont);
                    whiteBoxPanel.add(emailLabel, gbc);
                    gbc.gridx = 1;
                    JLabel emailData = new JLabel(emailField.getText());
                    emailData.setForeground(Color.darkGray);
                    whiteBoxPanel.add(emailData, gbc);

                    dataPanel.add(whiteBoxPanel);

                   
                    dataFrame.add(dataPanel, BorderLayout.CENTER);

                    dataFrame.setVisible(true);
                }
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new FormPendaftaran());
    }
}

