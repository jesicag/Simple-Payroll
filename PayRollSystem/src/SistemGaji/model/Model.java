package SistemGaji.model;

import SistemGaji.utility.DB;
import SistemGaji.controller.Pay;
import java.sql.*;
import java.util.*;
import static java.util.Collections.list;
import javax.swing.JOptionPane;


public class Model {
    Connection connection;
    Pay pay;
    Pay employee;
    List<Pay> listPay;
    
    public Model() {
        connection = new DB().getConnection();        
    }
    
    public Pay findById(int id) {
        String query = "SELECT * FROM pay WHERE ID=?";
        PreparedStatement statement = null;
        int ID = 0;
        try {
            statement = connection.prepareStatement(query);
            statement.setInt(1, id);
            ResultSet rs = statement.executeQuery();
            if(rs.next()){
                  pay = new Pay(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),
                  rs.getInt(5),rs.getInt(6),rs.getInt(7),rs.getInt(8),rs.getInt(9),rs.getInt(10),
                  rs.getInt(11));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error when retrieve data Pegawai"+ex.getMessage());
        }finally{
            try {
                if(statement != null)statement.close(); 
            } catch (Exception e) { }}
        return pay;
    }
    
    public List<Pay> findAll() {
        listPay=new ArrayList<Pay>();
        String query = "SELECT * FROM pay";
        PreparedStatement statement = null;
        int ID = 0;
        try {
            statement = connection.prepareStatement(query);
            ResultSet rs = statement.executeQuery();
            while(rs.next()){
                  pay = new Pay(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),
                  rs.getInt(5),rs.getInt(6),rs.getInt(7),rs.getInt(8),rs.getInt(9),rs.getInt(10),
                  rs.getInt(11));
                  listPay.add(pay);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error when retrieve data Pegawai"+ex.getMessage());
        }finally{
            try {
                if(statement != null)statement.close(); 
            } catch (Exception e) { }}
        return listPay;
    }
    
    public Connection getConnection(){
        return connection;
    }
    
    public boolean delete(int ID){
        String query = "DELETE From pay WHERE ID=?";
        PreparedStatement statement = null;
        try{
            connection.setAutoCommit(false);
            statement = connection.prepareStatement(query);
            statement.setInt(1, ID);
            connection.setAutoCommit(false);
            if (statement.executeUpdate() == 1)
                connection.commit();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error when delete data \n Error: "+e.getMessage());
            try {
                connection.rollback(); statement.close();
            } catch (Exception ex) { }
            return false;
        }finally{
            try {
                if(statement != null)statement.close(); 
            } catch (Exception e) { }}
        return true;
    }
    
    public boolean insertEmployee (Pay a){
        String query = " INSERT INTO pay ("
                +"FirstName, "
                +"LastName, "
                +"PhoneNumber, "
                +"HourWork, "
                +"BasicPay, "
                +"Payrollno, "
                +"Overtime, "
                +"Tax, "
                +"Grosspay, "
                +"NetPay "
                +") VALUES (?,?,?,?,?,?,?,?,?,?)";
        
        PreparedStatement statement = null;
        try{
            connection.setAutoCommit(false);            
            statement = connection.prepareStatement(query);
            for(int i=0; i<10;i++)
                statement.setObject(i+1, a.getObject(i+1)); 
            if(statement.executeUpdate()==1)                
            connection.commit();
        }catch(SQLException e){
        JOptionPane.showMessageDialog(null, "Error when insert data \n Error: "+e.getMessage());
        }finally{
            try {if(statement != null)statement.close(); 
            } catch (Exception e) { }}
        return true;
    }
    
    public boolean updateEmployee (Pay a){
        String query = "UPDATE pay SET "
                +"`FirstName`=?,"
                +"`LastName`=?,"
                +"`PhoneNumber`=?,"
                +"`HourWork`=?,"
                +"`BasicPay`=?,"
                +"`Payrollno`=?,"
                +"`Overtime`=?,"
                +"`Tax`=?,"
                +"`Grosspay`=?,"
                +"`NetPay`=?"
                + " where id=?";
        PreparedStatement statement = null;
        try {            
            connection.setAutoCommit(false);            
            statement = connection.prepareStatement(query);
            for(int i=1; i<=10;i++)statement.setObject(i, a.getObject(i)); 
            statement.setInt(11, a.getID());
            if(statement.executeUpdate()==1)                
            connection.commit();
        } catch (SQLException e) { 
            JOptionPane.showMessageDialog(null, "Error when update data \n Error: "+e.getMessage());
            try {
                connection.rollback();
                 statement.close(); } catch (Exception ex) { }
            return  false;
        }finally{try {if(statement != null)statement.close(); } catch (Exception e) { }}
        return true;
    }
}