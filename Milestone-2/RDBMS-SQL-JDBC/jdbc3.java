/*
 * Write a java program that connects to oracle database, 
 * queries the inbuilt table “emp” and displays the first two columns 
 * (empno using column index and ename using column name ) of all the rows.
 */

import java.sql.*;  
class jdbc3{  
    public static void main(String args[]){  
        try{  
            Class.forName("oracle.jdbc.driver.OracleDriver");  

            Connection con=DriverManager.getConnection(  
                    "jdbc:oracle:thin:@localhost:1521:xe","XE","XE");
                    
            Statement stmt=con.createStatement();
            
            ResultSet rs = stmt.executeQuery("SELECT * from emp");
            while(rs.next()) {
                System.out.println(rs.getInt(1)+" "+rs.getString("first_name"));
            }
            con.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }  
}  