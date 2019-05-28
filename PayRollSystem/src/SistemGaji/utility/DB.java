package SistemGaji.utility;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.util.*;


public class DB {
    Connection connection;
    MysqlDataSource ds;
    public Connection getConnection() {
        if(connection == null){
            ds = new MysqlDataSource();
            ds.setDatabaseName("sistemgaji");
            try {
                connection = ds.getConnection("root", "");
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error when try connect to mysql server, "+ "check your configuration");
            }
        }
        return connection;
    }
    
}