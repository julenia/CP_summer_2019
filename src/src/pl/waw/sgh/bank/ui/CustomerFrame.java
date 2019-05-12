package src.pl.waw.sgh.bank.ui;

import javax.swing.*;

public class CustomerFrame {

    public static void main(String[] args) {
        JFrame customerFrame = new JFrame("Customer");
        CustomerUI customerUI = new CustomerUI();
        customerFrame.add(customerUI.getMainPanel());
        customerFrame.pack();
        customerFrame.setVisible(true);

    }
}
