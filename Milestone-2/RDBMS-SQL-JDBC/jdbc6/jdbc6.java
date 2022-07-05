/*
 * Inserting a record
 * ABC International School wants to computerize students details. 
 * The school maintains a database of students in Oracle. 
 * The student table contains information related to students and is shown in the following student table structure. 
 * Column Name Type  Constraint
 * Rollno Number (4) Primary Key
 * StudentName Varchar (20)  Not Null
 * Standard Varchar (2) Not Null
 * Date_Of_Birth Date 
 * Fees Number (9,2) 
           
 * When a new student joins the school, the student record is inserted in the student table.  The valid student details are as follows:
• Rollno: Valid value is a 4-digit number 
• StudentName: Valid value can contain maximum 20 letters in uppercase
• Standard : Valid values are Roman Letters representing I to X(I, II, III, IV….IX, X). 
Write a Java program to insert some records to the table
 */

import java.sql.*; 
import java.util.*;
class jdbc6{  
    public static void main(String args[]){ 
        Scanner sc = new Scanner(System.in);
        int rollno=0;
        String name="";
        String standard="";
        String dob;
        Double fees;
        
        try{  
            Class.forName("oracle.jdbc.driver.OracleDriver");  

            Connection con=DriverManager.getConnection(  
                    "jdbc:oracle:thin:@localhost:1521:xe","XE","XE");
                    
            Statement stmt=con.createStatement();
            
            String roll;
            do 
            {
                System.out.println("Enter rollno : ");
                roll = sc.nextLine();
                try {
                    rollno = Integer.parseInt(roll);
                }
                catch(Exception e) {
                    System.out.println("Enter integer value of size 4");
                    rollno=0;
                }
            }
            while(rollno==0 || roll.length() != 4);
            
            do
            {
                System.out.println("Enter name : ");
                name = sc.nextLine();
            }
            while(name.length() > 20);  
            name = name.toUpperCase();
            
            String[] stdrd = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
            ArrayList<String> ar = new ArrayList<String>(Arrays.asList(stdrd));
            do
            {
                System.out.println("Enter standard : ");
                standard = sc.nextLine();
            }
            while(!(ar.contains(standard)));
            
            System.out.println("Enter date of birth : ");
            dob = sc.nextLine();
            
            System.out.println("Enter fees : ");
            fees = sc.nextDouble();
            
            String query = "Insert into stud values ("+rollno+", '"+name+"', '"+standard+"', '"+dob+"', "+fees+")";
            //stmt.executeQuery("Insert into stud values (7896, 'ASDS', 'II', '14-MAY-12', 7845.3)");
            //stmt.executeQuery("Insert into stud values ("+Integer.toString(rollno)+", "+name+", "+standard+", "+dob+", "+Double.toString(fees)+")");
            stmt.executeQuery(query);
            System.out.println("Inserted successfully into the table .");
            con.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }  
}  