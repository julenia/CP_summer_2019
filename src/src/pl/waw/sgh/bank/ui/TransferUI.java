package src.pl.waw.sgh.bank.ui;

import javax.swing.*;

public class TransferUI {
    private JTextPane transferTextPane;
    private JPanel mainPanel;
    private JTextField toAccValue;
    private JTextField AmountToTransfetValue;
    private JButton OKButton;
    private JTextField fromAccValue;
    private JLabel toAccLabel;
    private JLabel amountToTransferLabel;


    public JPanel getMainPanel() {
        return mainPanel;
    }

    public void setMainPanel(JPanel mainPanel) {
        this.mainPanel = mainPanel;
    }
}
