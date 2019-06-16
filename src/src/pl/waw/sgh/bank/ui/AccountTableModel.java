package src.pl.waw.sgh.bank.ui;

import src.pl.waw.sgh.bank.Account;


import javax.swing.table.DefaultTableModel;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class AccountTableModel extends DefaultTableModel {

    private static String[] cols = { "ID", "Type", "Currency", "Balance" };

    private List<Account> accList = new ArrayList<>();

    public AccountTableModel() {
        super(cols, 0);
    }

    public Account getAccountByRow(int row) {
        return accList.get(row);
    }

    public void clearTable() {
        accList.clear();
        dataVector.clear();
        fireTableDataChanged();
    }

    public void addRows(List<Account> acs) {
        for (Account ac : acs)
            addRow(ac);
    }

    public void addRow(Account acc) {
        accList.add(acc);
        addRow(getVectorFromAccount(acc));
        fireTableDataChanged();
    }

    public Vector getVectorFromAccount(Account acc) {
        Vector vc = new Vector();
        vc.add(acc.getAccountID());
        vc.add(acc.getClass().getSimpleName().replace("Account", ""));
        vc.add(acc.getCurrency());
        vc.add(acc.getBalance());
        return vc;
    }

    @Override
    public void setValueAt(Object o, int row, int col) {
        super.setValueAt(o, row, col);
        Account acc = accList.get(row);
        switch (col) {
            case 2:
                acc.setCurrency(o.toString());
                break;
            case 3:
                acc.setBalance((BigDecimal)o);
        }
    }

    @Override
    public boolean isCellEditable(int row, int col) {
        if (col<2) return false;
        else return true;
    }

    @Override
    public Class<?> getColumnClass(int col) {
        switch (col) {
            case 0:
                return Integer.class;
            case 3:
                return BigDecimal.class;
            default:
                return String.class;
        }
    }
}