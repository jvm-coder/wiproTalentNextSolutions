/*
 * Modification of Student record 
 * When there is a change in the fee to be paid by a student, 
 * the respective row should be appropriately updated. 
 * Pass the rollno from the command prompt along with the new fee amount 
 * and this amount should be reflected in the table for that particular student.
 */

import java.sql.*; 
import java.util.*;
class jdbc8{  
    public static void main(String args[]){ 
        Scanner sc = new Scanner(System.in);
        int rollno=0;
        
        try{  
            Class.forName("oracle.jdbc.driver.OracleDriver");  

            Connection con=DriverManager.getConnection(  
                    "jdbc:oracle:thin:@localhost:1521:xe","XE","XE");
                    
            Statement stmt=con.createStatement();
            
            String query = "update stud set fees = "+Double.parseDouble(args[1])+" where rollno="+Integer.parseInt(args[0]);
            if(stmt.executeUpdate(query) == 1) {
                System.out.println("Data modified successfully");
            }
            else {
                System.out.println("Error in Modification");
            }
            
            con.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }  
}  