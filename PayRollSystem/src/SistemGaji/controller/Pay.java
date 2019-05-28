package SistemGaji.controller;
import javax.swing.*;

public class Pay {
    private int ID;
    private String FirstName;
    private String LastName;
    private String Phone;
    private int HourWork;
    private int BasicPay;
    private int PayrollNo;
    private int OverTime;
    private int Tax;
    private int GrossPay;
    private int NetPay;

    public Pay(int ID, String FirstName, String LastName, String Phone, int HourWork, int BasicPay, int PayrollNo, int OverTime, int Tax, int GrossPay, int NetPay) {
        this.ID = ID;
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Phone = Phone;
        this.HourWork = HourWork;
        this.BasicPay = BasicPay;
        this.PayrollNo = PayrollNo;
        this.OverTime = OverTime;
        this.Tax = Tax;
        this.GrossPay = GrossPay;
        this.NetPay = NetPay;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    
    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public int getHourWork() {
        return HourWork;
    }

    public void setHourWork(int HourWork) {
        this.HourWork = HourWork;
    }

    public int getBasicPay() {
        return BasicPay;
    }

    public void setBasicPay(int BasicPay) {
        this.BasicPay = BasicPay;
    }

    public int getPayrollNo() {
        return PayrollNo;
    }

    public void setPayrollNo(int PayrollNo) {
        this.PayrollNo = PayrollNo;
    }

    public int getOverTime() {
        return OverTime;
    }

    public void setOverTime(int OverTime) {
        this.OverTime = OverTime;
    }

    public int getTax() {
        return Tax;
    }

    public void setTax(int Tax) {
        this.Tax = Tax;
    }

    public int getGrossPay() {
        return GrossPay;
    }

    public void setGrossPay(int GrossPay) {
        this.GrossPay = GrossPay;
    }

    public int getNetPay() {
        return NetPay;
    }

    public void setNetPay(int NetPay) {
        this.NetPay = NetPay;
    }

   
        public Object getObject(int index) {
        switch(index){
            case 0: return ID;
            case 1: return FirstName;
            case 2: return LastName;
            case 3: return Phone;
            case 4: return HourWork;
            case 5: return BasicPay;
            case 6: return PayrollNo;
            case 7: return OverTime;
            case 8: return Tax;
            case 9: return GrossPay;
            case 10: return NetPay;
            default: return null;
            
        }
    }
    
}