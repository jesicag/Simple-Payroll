package SistemGaji.controller;

import SistemGaji.view.SistemGaji;
import SistemGaji.model.Model;
import SistemGaji.model.PayTableModel;
import com.sun.javafx.image.impl.IntArgb;
import java.util.List;
import javax.swing.JOptionPane;

public class Controller {
    
    SistemGaji view;
    Model model;

    public Controller(SistemGaji view) {
        this.view = view;
        model = new Model();
    }
    
   public void  insert(){
        if(model.insertEmployee(getPay(true))){
                                JOptionPane.showMessageDialog(view, "Data inserted successfully");
                                findAll();
        }
    }
    
    public void findAll(){        
        view.setTableModel(new PayTableModel());
        List<Pay> pay = model.findAll();
        view.getTableModel().setListPay(pay);
        view.getTabel1().setModel(view.getTableModel());
    }
    
    public void findById(int id){        
        Pay pay =  model.findById(id);
        setPay(pay);
    }
    
    public void  update(){
        if(model.updateEmployee(getPay(false))){
                                JOptionPane.showMessageDialog(view, "Data updated successfully");
                                findAll();
        }
    }
    
    public void  delete(int id){
        if(model.delete(id)){
            JOptionPane.showMessageDialog(view, "Data deleted successfully ");
            findAll();
            reset();
        }
    }

    public Pay getPay(boolean insert){
        Pay pay;
        int grossPay = Integer.parseInt(view.getTFbasic().getText()) * Integer.parseInt( view.getTFhour().getText()) 
                + (Integer.parseInt( view.getTFovertime().getText()) *  Integer.parseInt(view.getTFbasic().getText()) );
        int netPay = grossPay - Integer.parseInt(view.getTFtax().getText());
        if(insert){
          pay = new Pay(0, view.getTFfname().getText(), view.getTFlname().getText(),
                  view.getTFphone().getText(),Integer.parseInt( view.getTFhour().getText()),
                  Integer.parseInt(view.getTFbasic().getText()),Integer.parseInt( view.getTFpayrollno().getText()),
                  Integer.parseInt( view.getTFovertime().getText()), Integer.parseInt(view.getTFtax().getText()),
                  grossPay,netPay);                        
        }
        else{
          pay = new Pay(Integer.parseInt(view.getTFid().getText()), view.getTFfname().getText(),
                  view.getTFlname().getText(), view.getTFphone().getText(),
                  Integer.parseInt( view.getTFhour().getText()),Integer.parseInt(view.getTFbasic().getText()),
                  Integer.parseInt( view.getTFpayrollno().getText()),Integer.parseInt( view.getTFovertime().getText()), 
                  Integer.parseInt(view.getTFtax().getText()),grossPay,netPay);            
        }        
        return pay;
    }
    
    public void setPay(Pay pay){
        view.getTFid().setText(pay.getID()+"");
        view.getTFfname().setText(pay.getFirstName());
        view.getTFlname().setText(pay.getLastName());
        view.getTFphone().setText(pay.getPhone()+"");
        view.getTFhour().setText(pay.getHourWork()+"");
        view.getTFbasic().setText(pay.getBasicPay()+"");
        view.getTFpayrollno().setText(pay.getPayrollNo()+"");
        view.getTFovertime().setText(pay.getOverTime()+"");
        view.getTFtax().setText(pay.getTax()+"");
        view.getTFgross().setText(pay.getGrossPay()+"");
        view.getTFnet().setText(pay.getNetPay()+"");
    }
    
    public void reset(){
        view.getTFid().setText("");
        view.getTFfname().setText("");
        view.getTFlname().setText("");
        view.getTFphone().setText("");
        view.getTFhour().setText("");
        view.getTFbasic().setText("");
        view.getTFpayrollno().setText("");
        view.getTFovertime().setText("");
        view.getTFtax().setText("");
        view.getTFgross().setText("");
        view.getTFnet().setText("");
    }
    
    
}