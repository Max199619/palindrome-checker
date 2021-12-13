package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {

    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    JLabel title = new JLabel("", SwingConstants.CENTER);
    JLabel original_word = new JLabel();
    JLabel reversed_word = new JLabel();
    JLabel end_info = new JLabel("", SwingConstants.CENTER);
    JTextField word = new JTextField();
    JTextField reversed = new JTextField();
    JButton check = new JButton();

    public GUI(){
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(500,500);
        frame.setFocusable(true);



        panel.setLayout(null);
        panel.add(title);
        panel.add(original_word);
        panel.add(word);
        panel.add(reversed_word);
        panel.add(reversed);
        panel.add(check);
        panel.add(end_info);

        frame.add(panel);

        title.setText("PALINDROME CHECKER");
        original_word.setText("Input word:");
        reversed_word.setText("Reversed:");
        check.setText("Check");

        title.setBounds(0,15,480,65);
        title.setFont(new Font("Serif",Font.PLAIN, 30));
        original_word.setBounds(20,90,100,30);
        original_word.setFont(new Font("Times New Roman",Font.BOLD, 15));
        word.setBounds(150,90,300,30);
        word.setFont(new Font("Times New Roman",Font.PLAIN, 15));
        reversed_word.setBounds(20,130,100,30);
        reversed_word.setFont(new Font("Times New Roman",Font.BOLD, 15));
        reversed.setBounds(150,130,300,30);
        reversed.setFont(new Font("Times New Roman",Font.PLAIN, 15));
        check.setBounds(115,175,250,110);
        end_info.setBounds(20,300,400, 75);
        end_info.setFont(new Font("Times New Roman",Font.ITALIC, 20));

        check.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        reversed.setText(reverseString(word.getText()));
        if(reversed.getText().equals(word.getText())){
            end_info.setForeground(Color.GREEN);
            end_info.setText("It is a palindrome");
        }
        else{
            end_info.setForeground(Color.RED);
            end_info.setText("Not a palindrome");

        }
    }

    public String reverseString(String str){
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        return sb.toString();
    }


}
