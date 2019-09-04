package com.ssi.wp;
import java.sql.*;

public class DataEntry {
	public static void main(String[] args) {
        try {
            //step-1 (Driver-Loading)
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver Loaded");
            //step-2 (Connection Establishment)
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/wp", "root", "root");
            System.out.println("Connected Successfully");
            //step-3 (Define SQL Statement)
            System.out.println("SENDING SQL TO DB......");
            String sql="INSERT INTO EMP VALUES(189,'ABC',30000,'SALESMAN')";
           
           
            		
           
           //step-4 (Send the SQL statement to DB)
            Statement stmt=con.createStatement();
            int n=stmt.executeUpdate(sql);
            sql="UPDATE 'EMP' SET 'SALARY'='9000' WHERE 'JOB'=SALESMAN";
            
             n=stmt.executeUpdate(sql);
             sql="DELETE FROM EMP WHERE 'SALARY'=30000";
            
             n=stmt.executeUpdate(sql);
            
            
            
            //step-5 (Close the Database Connection)
            con.close();
            System.out.println(n+" Row Added");
            
            
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }

}
