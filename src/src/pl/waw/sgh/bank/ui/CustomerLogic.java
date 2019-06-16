package src.pl.waw.sgh.bank.ui;

import src.pl.waw.sgh.bank.Account;
import src.pl.waw.sgh.bank.Bank;
import src.pl.waw.sgh.bank.Customer;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class CustomerLogic extends CustomerUI {

    private Bank bank = new Bank("My BANK");

    // Currently displayed customer
    private Customer curCustomer;

    private JFrame mainWindow;

    private JPopupMenu ctxMenu;

    public CustomerLogic(JFrame mainWindow) {
        super();
        this.mainWindow = mainWindow;
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                curCustomer.setFirstName(textFieldFirstName.getText());
                curCustomer.setLastName(textFieldLastName.getText());
                curCustomer.setEmail(textFieldEmail.getText());
            }
        });
        prevButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Customer prevCust = bank.prevCustomer(curCustomer);
                if (prevCust!=null) {
                    displayCustomer(prevCust);
                } else {
                    prevButton.setEnabled(false);
                    nextButton.setEnabled(true);
                }
            }
        });
        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Customer nextCust = bank.nextCustomer(curCustomer);
                if (nextCust!=null) {
                    displayCustomer(nextCust);
                } else {
                    nextButton.setEnabled(false);
                    prevButton.setEnabled(true);
                }
            }
        });
        newButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Customer cust = bank.newCustomer("",
                        "",
                        "");
                textFieldID.setText(cust.getCustomerID().toString());
                displayCustomer(cust);
            }
        });

        // Account Table Logic

        ctxMenu = new JPopupMenu("Operations on accounts");
        JMenuItem newCheckingAcc = new JMenuItem("New Checking Account");
        newCheckingAcc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Account newAcc = bank.newCheckingAccount(curCustomer, "USD");
                accTableModel.addRow(newAcc);
            }
        });
        ctxMenu.add(newCheckingAcc);
        JMenuItem newSavingsAcc = new JMenuItem("New Savings Account");
        newSavingsAcc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Account newAcc = bank.newSavingsAccount(curCustomer, "USD");
                accTableModel.addRow(newAcc);
            }
        });
        ctxMenu.add(newSavingsAcc);
        JMenuItem delAcc = new JMenuItem("Delete Account");
        delAcc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int[] selRows = accTable.getSelectedRows();
                for (Integer row : selRows) {
                    Account accToDel = accTableModel.getAccountByRow(row);
                    bank.deleteAccount(accToDel);
                }
                displayCustomer(curCustomer);
            }
        });
        ctxMenu.add(delAcc);


        // Mouse Listener
        accTable.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                if (e.isPopupTrigger()) {
                    ctxMenu.show(e.getComponent(), e.getX(), e.getY());
                }
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        });
    }

    private void displayCustomer(Customer c) {
        if (c==null) {
            c= bank.newCustomer("",
                    "",
                    "");
        }
        curCustomer = c;
        accTableModel.clearTable();
        accTableModel.addRows(bank.findAccountByCustomer(curCustomer));
        textFieldID.setText(c.getCustomerID().toString());
        textFieldEmail.setText(c.getEmail());
        textFieldFirstName.setText(c.getFirstName());
        textFieldLastName.setText(c.getLastName());
    }


    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
        displayCustomer(bank.findFirstCustomer());
    }
}
