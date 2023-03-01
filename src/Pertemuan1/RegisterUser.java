/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan1;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Rizqy Yoanda
 */
public class RegisterUser {
    public static void main(String[] args) {
        JFrame j = new JFrame("Jframe Pertemuan1");
        JLabel name = new JLabel();
        name.setText(" Nama :");
        name.setBounds(50, 100, 100, 30);
        j.add(name);
        
        JLabel username = new JLabel();
        username.setText(" Username :");
        username.setBounds(50, 150, 100, 30);
        j.add(username);

        JLabel password = new JLabel();
        password.setText(" Password :");
        password.setBounds(50, 200, 100, 30);
        j.add(password);
        
        JLabel email = new JLabel();
        email.setText(" Email :");
        email.setBounds(50, 250, 100, 30);
        j.add(email);
        
        JLabel noHp = new JLabel();
        noHp.setText(" No.HP :");
        noHp.setBounds(50, 300, 100, 30);
        j.add(noHp);
        
        JTextField nameTxt = new JTextField();
        nameTxt.setBounds(150, 100, 200, 30);
        j.add(nameTxt);
        
        JTextField usernameTxt = new JTextField();
        usernameTxt.setBounds(150, 150, 200, 30);
        j.add(usernameTxt);
        
        JPasswordField passwordTxt = new JPasswordField();
        passwordTxt.setBounds(150, 200, 200, 30);
        j.add(passwordTxt);
        
        JTextField emailTxt = new JTextField();
        emailTxt.setBounds(150, 250, 200, 30);
        j.add(emailTxt);
        
        JTextField noHpTxt = new JTextField();
        noHpTxt.setBounds(150, 300, 200, 30);
        j.add(noHpTxt);
        
        JButton registerButton = new JButton();
        registerButton.setText("Register");
        registerButton.setBounds(200, 350, 100, 20);
        j.add(registerButton);
        
        j.setSize(800, 800);
        j.setLayout(null);
        j.setVisible(true);
    }
}
