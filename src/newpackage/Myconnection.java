package newpackage;


import java.sql.*;
import javax.swing.*;

public class Myconnection {
    Connection conn=null;   
    public static Connection ConnectDb() { 
        try{
            Class.forName("com.mysql.jdbc.Driver");         // Εισαγωγή του connector
            Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/paper" , "root", "123456789"); //Eγκαθίδρυση σύνδεσης. Προσοχή καθώς πρέπει να δίνεται τα δικά σας στοιχεία.
            JOptionPane.showMessageDialog(null, "Connection to MySQL server/paperDB Established Successfully!"); //Μήνυμα επιτυχούς σύνδεσης
            return conn;
           }
        catch(Exception e){ // η κλήση της getConnection του DriverManager πετάει throwable για αυτό χρειάζεται η catch
        JOptionPane.showMessageDialog(null,e); // Η οποία θα εκτυπώνει ενα default μήνυμα λάθους.
        return null;
        }
    }
    static PreparedStatement getConnection(final String query) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

