/*
 * Deleting a Student’s record
 * When a student leaves the school, the record related to that student needs to be deleted from the Student table. 
 * The student’s roll no, whose record has to be deleted, should be passed as a command line argument.
 * Upon deletion, the Student details must be stored in another table named StudentLog which will maintain the 
 * details such as Rollno, StudentName, Standard and Leaving_date.
 */

import java.sql.*; 
import java.util.*;
class jdbc7{  
    public static void main(String args[]){ 
        Scanner sc = new Scanner(System.in);
        int rollno=0;
        
        try{  
            Class.forName("oracle.jdbc.driver.OracleDriver");  

            Connection con=DriverManager.getConnection(  
                    "jdbc:oracle:thin:@localhost:1521:xe","XE","XE");
                    
            Statement stmt=con.createStatement();
            
            rollno = Integer.parseInt(args[0]);
            int succeed1 = stmt.executeUpdate("insert into stud_log select rollno, studentname, standard, dob, fees, SYSDATE FROM STUD where rollno="+rollno);

            int succeed2 = stmt.executeUpdate("delete from stud where rollno="+rollno);
            
            if(succeed1==1 && succeed2==1) {
                System.out.println("Data deleted successfully");
            }
            else {
                System.out.println("Error in deletion");
            }
            
            con.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }  
}  