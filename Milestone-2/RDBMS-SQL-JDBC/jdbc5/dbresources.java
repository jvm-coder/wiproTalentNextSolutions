/*
 * Develop a jdbc program containing main method, which should instantiate a class 
 * called DAOClass, which should contain methods called insert, delete, modify and display. 
 * Description of what each of these methods are expected to do is given below. 
 * Necessary details required for executing these methods, are passed from command line argument. 
 * For e.g. If the name of the class containing the main method is JDBCCalls, 
 * then if you want to insert a record, you will execute this class as java JDBCCalls 1 101 “Ajit” “IV” “20-Nov-2001” 4000
 * Where 1 is the option for inserting the record and all other details are the values for the columns in each row of the student table. 
 * The structure of student table is given below. Similarly, for deleting a record, you have to execute the code as java JDBCCalls 2 101
 * where 2 is the option for deleting a record and 101 is the rollno of the student, whose record has to be deleted.
 * For modifying a record, you will use java JDBCCalls 3 101 4500, 
 * where 3 is the option for modifying a record and the 4500 is the new fee which needs to replace the old fee value.
 * For Displaying records, if the main class is executed as follows  java JDBCCalls 4 101
 * it should display only one record, that of the student with roll no. 101. 4 option is for displaying the record. 
 * If the main class is executed as java JDBCCalls 4 (without specifying the rollno.),
 * it means that details of all the students should be displayed.
 */

import java.sql.*;  
public class dbresources{  
        public static Connection retConnection() {
        Connection con = null;
        try{  
            Class.forName("oracle.jdbc.driver.OracleDriver");  

            con=DriverManager.getConnection(  
                    "jdbc:oracle:thin:@localhost:1521:xe","XE","XE");  
        }
        catch(Exception e) { 
            System.out.println("Database connection could  not be established");
            e.printStackTrace();
        }
        
        return con;
    }  
}  
