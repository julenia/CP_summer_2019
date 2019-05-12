package src.pl.waw.sgh.bank.ui;

import com.sun.java.swing.plaf.windows.WindowsLookAndFeel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FirstWindow {

    public static void main(String[] args) {

        try {
            UIManager.setLookAndFeel(new WindowsLookAndFeel());
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }


        JFrame frame = new JFrame("First Window");
        frame.setSize(800, 500 );
        //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        //frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        //frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        LayoutManager layoutManager=new FlowLayout();
        frame.setLayout(layoutManager);
        JPanel mainPanel = new JPanel();
        mainPanel.add(new JLabel("Hello, what's your name: "));
        JTextField nameField = new JTextField(50);
        mainPanel.add(nameField);
        JButton okButton= new JButton("OK");
        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Hello "+nameField.getText());
            }
        });

        mainPanel.add(okButton);
        frame.add(mainPanel);


        frame.setVisible(true);
    }
}
