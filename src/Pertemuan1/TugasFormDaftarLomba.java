/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan1;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Rizqy Yoanda
 */
public class TugasFormDaftarLomba {
    public static void main(String[] args) {
        JFrame j = new JFrame("Jframe Pertemuan1");
        JLabel txt = new JLabel();
        txt.setText("Pendaftaran Lomba");
        txt.setBounds(250, 50, 150, 50);
        j.add(txt);
        
        JLabel nim = new JLabel();
        nim.setText(" NIM");
        nim.setBounds(50, 100, 100, 30);
        j.add(nim);
        
        JLabel namadpn = new JLabel();
        namadpn.setText(" Nama Depan");
        namadpn.setBounds(50, 150, 100, 30);
        j.add(namadpn);
        
        JLabel namablkg = new JLabel();
        namablkg.setText(" Nama Belakang");
        namablkg.setBounds(50, 200, 100, 30);
        j.add(namablkg);

        JLabel email = new JLabel();
        email.setText(" Email");
        email.setBounds(50, 250, 100, 30);
        j.add(email);
        
        JLabel prodi = new JLabel();
        prodi.setText(" Prodi");
        prodi.setBounds(50, 300, 100, 30);
        j.add(prodi);
        
        String[] aprodi = {"TRPL", "TEKOM", "MI"};
        JComboBox cbprodi = new JComboBox(aprodi);
        cbprodi.setBounds(150, 300, 100, 30);
        j.add(cbprodi);
        
        JLabel light = new JLabel();
        light.setText(" light");
        light.setBounds(50, 400, 100, 30);
        j.add(light);
        
        JCheckBox checkBox1 = new JCheckBox("Badminton");  
        checkBox1.setBounds(150,350, 100,50);  
        JCheckBox checkBox2 = new JCheckBox("Futsal", true);  
        checkBox2.setBounds(150,400, 100,50);
        
        j.add(checkBox1);  
        j.add(checkBox2);  
        
        JLabel bp = new JLabel();
        bp.setText(" No.HP");
        bp.setBounds(50, 500, 100, 30);
        j.add(bp);
        
        JTextField nimTxt = new JTextField();
        nimTxt.setBounds(150, 110, 200, 20);
        j.add(nimTxt);
        
        JTextField namadTxt = new JTextField();
        namadTxt.setBounds(150, 160, 200, 20);
        j.add(namadTxt);
        
        JTextField namabTxt = new JTextField();
        namabTxt.setBounds(150, 210, 200, 20);
        j.add(namabTxt);
        
        JTextField emailTxt = new JTextField();
        emailTxt.setBounds(150, 260, 200, 20);
        j.add(emailTxt);
        
        JTextField noHpTxt = new JTextField();
        noHpTxt.setBounds(150, 510, 200, 20);
        j.add(noHpTxt);
        
        JButton registerButton = new JButton();
        registerButton.setText("Daftar");
        registerButton.setBounds(200, 560, 100, 20);
        j.add(registerButton);
        
        j.setSize(800, 800);
        j.setLayout(null);
        j.setVisible(true);
    }
}
