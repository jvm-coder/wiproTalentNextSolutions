/*
 * Display Student details
 * Write the code to display details of all the students, if no roll no. is passed, while executing the main program.
 * If while executing the main program, the roll no. is passed, then it should display the record of that particular student.
 */

import java.sql.*; 
import java.util.*;
class jdbc9 {  
    public static void main(String args[]){ 
        Scanner sc = new Scanner(System.in);
        int rollno=0;
        
        try{  
            Class.forName("oracle.jdbc.driver.OracleDriver");  

            Connection con=DriverManager.getConnection(  
                    "jdbc:oracle:thin:@localhost:1521:xe","XE","XE");
                    
            Statement stmt=con.createStatement();
            
            String query = "";
            if(args.length==0)
                query = "select * from stud";
            else
                query = "select * from stud where rollno="+Integer.parseInt(args[0]);
                
            ResultSet rs = stmt.executeQuery(query);
            
            while(rs.next())
            {
                System.out.println(rs.getInt(1)+" \t "+rs.getString(2)+" \t "+rs.getString(3)+" \t "+rs.getString(4)+" \t "+rs.getDouble(5));
            }
            
            con.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }  
}  