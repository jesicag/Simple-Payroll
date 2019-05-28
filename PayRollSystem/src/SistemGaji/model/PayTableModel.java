package SistemGaji.model;

import SistemGaji.controller.Pay;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class PayTableModel extends AbstractTableModel{
    List<Pay> listPay;
    String[] header = {"ID","FirstName","LastName", "Phone", "HourWork","BasicPay",
        "PayrollNo","OverTime","Tax", "GrossPay","NetPay"};

    public PayTableModel() {
        listPay = new ArrayList<Pay>();
    }

    public PayTableModel(List<Pay> listPay) {
        this.listPay = listPay;
    }

    public void setListPay(List<Pay> listPay) {
        this.listPay = listPay;
    }
    
    public int getRowCount() {
        return listPay.size();
    }

    public int getColumnCount() {
        return 11;
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        return listPay.get(rowIndex).getObject(columnIndex);
    }

    @Override
    public String getColumnName(int column) {
        return header[column];
    }

}