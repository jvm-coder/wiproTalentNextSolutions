/*
 * Write a java program that establishes a connection to oracle database 
 *successfully. If the connection is successful, it should display a message 
 *“Connection Established successfully”. 
 *In case, it is not able to do so due to any exception, 
 *it should display the message “Connection could  not be established “. 
 *If there is an exception, it should also display the description of the exception.
 */
import java.sql.*;  
class jdbc1{  
    public static void main(String args[]){  
        try{  
            Class.forName("oracle.jdbc.driver.OracleDriver");  

            Connection con=DriverManager.getConnection(  
                    "jdbc:oracle:thin:@localhost:1521:xe","XE","XE");  
                    
            System.out.println("Connection Established successfully");
            
            con.close();
        }
        catch(Exception e){ 
            System.out.println("Connection could  not be established");
            System.out.println(e);
        }
    }  
}  