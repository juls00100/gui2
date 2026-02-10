/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;


public class config {
    //Connection Method to SQLITE
public static Connection connectDB() {
        Connection con = null;
        try {
            Class.forName("org.sqlite.JDBC"); // Load the SQLite JDBC driver
            con = DriverManager.getConnection("jdbc:sqlite:aes.db"); // Establish connection
            System.out.println("Connection Successful");
        } catch (Exception e) {
            System.out.println("Connection Failed: " + e);
        }
        return con;
    }
public int addRecord(String sql, Object... values) {
    try (Connection conn = this.connectDB(); // Use the connectDB method
         PreparedStatement pstmt = conn.prepareStatement(sql)) {

        // Loop through the values and set them in the prepared statement dynamically
        for (int i = 0; i < values.length; i++) {
            if (values[i] instanceof Integer) {
                pstmt.setInt(i + 1, (Integer) values[i]); // If the value is Integer
            } else if (values[i] instanceof Double) {
                pstmt.setDouble(i + 1, (Double) values[i]); // If the value is Double
            } else if (values[i] instanceof Float) {
                pstmt.setFloat(i + 1, (Float) values[i]); // If the value is Float
            } else if (values[i] instanceof Long) {
                pstmt.setLong(i + 1, (Long) values[i]); // If the value is Long
            } else if (values[i] instanceof Boolean) {
                pstmt.setBoolean(i + 1, (Boolean) values[i]); // If the value is Boolean
            } else if (values[i] instanceof java.util.Date) {
                pstmt.setDate(i + 1, new java.sql.Date(((java.util.Date) values[i]).getTime())); // If the value is Date
            } else if (values[i] instanceof java.sql.Date) {
                pstmt.setDate(i + 1, (java.sql.Date) values[i]); // If it's already a SQL Date
            } else if (values[i] instanceof java.sql.Timestamp) {
                pstmt.setTimestamp(i + 1, (java.sql.Timestamp) values[i]); // If the value is Timestamp
            } else {
                pstmt.setString(i + 1, values[i].toString()); // Default to String for other types
            }
        }

        pstmt.executeUpdate();
        JOptionPane.showMessageDialog(null, "Record added successfully!");
        return 1;
    } catch (SQLException e) {
        System.out.println("Error adding record: " + e.getMessage());
        return 0;
    }
    
    
}
    public boolean authenticate(String sql, Object ... values) {
        try (Connection conn = connectDB();
        PreparedStatement pstmt = conn.prepareStatement(sql)) {

        for (int i=0; i < values.length; i++) {
        pstmt.setObject(i+1, values[i]);
        }
        try (ResultSet rs = pstmt.executeQuery()) {
        if (rs.next()) {
        return true;
        }
        }

        } catch (SQLException e) {
        System.out.println("Login Error: "+ e.getMessage());

        }
        return false;
    }
    
    public void displayData(String sql, javax.swing.JTable table) {
        try (Connection con = connectDB();
        PreparedStatement pstmt = con.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery()) {
        // This line automatically maps the Resultset to your JTable
        table.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException e) {
        System.out.println("Error displaying data: "+ e.getMessage());

        }
    }

    public java.sql.ResultSet getData(String sql) throws java.sql.SQLException {
    java.sql.Connection conn = connectDB(); // Uses your existing connection method
    java.sql.Statement stmt = conn.createStatement();
    java.sql.ResultSet rs = stmt.executeQuery(sql);
    return rs;
}
    private static String currentName;
    private static String currentEmail;
    private static String currentType;

    private static String currentID;
    
    public static void setSession(String id, String name, String email, String type) {
        currentID = id;
        currentName = name;
        currentEmail = email;
        currentType = type;
    }
    public static String getID() { return currentID; }
    public static String getName() { return currentName; }
    public static String getEmail() { return currentEmail; }
    public static String getType() { return currentType; }
    
    public int getCount(String sql) {
        int count = 0;
        try (Connection conn = connectDB();
             java.sql.Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            if (rs.next()) {
                count = rs.getInt(1);
            }
        } catch (SQLException e) {
            System.out.println("Error fetching count: " + e.getMessage());
        }
        return count;
    }
    
    public int updateRecord(String sql, Object... values) { 
        try (java.sql.Connection conn = connectDB(); 
                java.sql.PreparedStatement pstmt = conn.prepareStatement(sql)) { 
            for (int i = 0; i < values.length; i++) { 
                pstmt.setObject(i + 1, values[i]); } 
            return pstmt.executeUpdate(); 
        } catch 
                (java.sql.SQLException e) { 
            System.out.println("Update Error: " + e.getMessage()); 
        return 0; } 
    }
    public java.util.List getQuestionList(String sql) { 
        java.util.List list = new java.util.ArrayList(); 
        try (java.sql.Connection conn = connectDB(); 
                java.sql.PreparedStatement pstmt = conn.prepareStatement(sql); 
                java.sql.ResultSet rs = pstmt.executeQuery()) { 
            while (rs.next()) { list.add(rs.getString(1)); 
            } 
        } catch (
                java.sql.SQLException e) { 
            System.out.println("Error: " + e.getMessage()); 
        } return list; 
    
    }
    
    public void deleteRecord(String sql, Object... values) { 
        try (Connection conn = connectDB(); 
                PreparedStatement pstmt = conn.prepareStatement(sql)) { 
            for (int i = 0; i < values.length; i++) { 
                pstmt.setObject(i + 1, values[i]); } 
            pstmt.executeUpdate(); 
            JOptionPane.showMessageDialog(null, "Record deleted successfully!"); 
        } catch (SQLException e) 
        { 
            System.out.println("Error deleting record: " + e.getMessage()); 
        } 
    }

    public void updateRecordOnly(String sql, Object... values) { 
        try (Connection conn = connectDB(); 
                PreparedStatement pstmt = conn.prepareStatement(sql)) { 
            for (int i = 0; i < values.length; i++) { 
                pstmt.setObject(i + 1, values[i]); } 
            pstmt.executeUpdate(); 
            JOptionPane.showMessageDialog(null, "Record updated successfully!"); 
        } catch (SQLException e) { 
            System.out.println("Error updating record: " + e.getMessage()); 
        } 
    }
}

