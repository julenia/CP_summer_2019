package src.pl.waw.sgh.bank.ui;
import src.pl.waw.sgh.bank.Bank;
import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.*;

public class CustomerFrame {

    static final String DAT_FILE = "bank.dat";

    public static void main(String[] args) {
        JFrame customerFrame = new JFrame("Customer");
        CustomerLogic custLogic = new CustomerLogic(customerFrame);

        try {
            FileInputStream fis = new FileInputStream(DAT_FILE);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Bank bank = (Bank) ois.readObject();
            custLogic.setBank(bank);
        } catch (ClassNotFoundException | IOException fe) {
            JOptionPane.showMessageDialog(customerFrame, "No Data file found, new bank created");
        }
        customerFrame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        //CustomerUI customerUI = new CustomerUI();
        //customerFrame.add(customerUI.getMainPanel());
        customerFrame.add(custLogic.getMainPanel());
        customerFrame.pack();
        customerFrame.setVisible(true);
        customerFrame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                try {
                    FileOutputStream fos = new FileOutputStream(DAT_FILE);
                    ObjectOutputStream oos = new ObjectOutputStream(fos);
                    oos.writeObject(custLogic.getBank());
                    oos.close();
                } catch (FileNotFoundException e1) {
                    e1.printStackTrace();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
                super.windowClosing(e);
            }
        });
    }
}