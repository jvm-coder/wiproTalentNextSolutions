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