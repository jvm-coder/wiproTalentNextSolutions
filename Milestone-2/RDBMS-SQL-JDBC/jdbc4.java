/*
 * Modify the above program to display all the rows where 
 * sal is greater than 1000 and less than 2000. 
 * Display the columns ename, job, sal and comm. 
 */

import java.sql.*;  
class jdbc4{  
    public static void main(String args[]){  
        try{  
            Class.forName("oracle.jdbc.driver.OracleDriver");  

            Connection con=DriverManager.getConnection(  
                    "jdbc:oracle:thin:@localhost:1521:xe","XE","XE");
                    
            Statement stmt=con.createStatement();
            
            ResultSet rs = stmt.executeQuery("SELECT * from departments");
            while(rs.next()) {
                System.out.println(rs.getString("first_name")+" "+rs.getString("dept_name")+" "+rs.getFloat("salary")+" "+rs.getInt("comm"));
            }
            con.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }  
}  