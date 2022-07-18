import java.sql.*;
class DAOClass
{
    PreparedStatement pst = null;
    private Connection con = null;
    
    public DAOClass() 
    {
        con = dbresources.retConnection();
    }
    
    public boolean insert( int rollno, String name, String sec, String dob, int fee)
    {
        String query = "insert into stud values (?, ?, ?, ?, ?)";
        try
        {
            pst = con.prepareStatement(query);
            pst.setInt(1, rollno);
            pst.setString(2, name);
            pst.setString(3, sec);
            pst.setString(4, dob);
            pst.setInt(5, fee);
            
            pst.executeUpdate();
            
            return true;
        }
        catch(Exception e)
        {
            e.printStackTrace();
            return false;
        }
    }
    
    public boolean delete(int rollno)
    {
        String query = "delete from stud where rollno=?";
        try
        {
            pst = con.prepareStatement(query);
            pst.setInt(1, rollno);
            
            pst.executeUpdate();
            
            return true;
        }
        catch(Exception e)
        {
            e.printStackTrace();
            return false;
        }
    }
    
    public boolean modify( int rollno, int fee)
    {
        String query = "update stud set fee=? where rollno=?";
        try
        {
            pst = con.prepareStatement(query);
            pst.setInt(2, rollno);
            pst.setInt(1, fee);
            
            pst.executeUpdate();
            
            return true;
        }
        catch(Exception e)
        {
            e.printStackTrace();
            return false;
        }
    }
    
    public boolean display( int rollno)
    {
        String query = "select * from stud where rollno=?";
        try
        {
            pst = con.prepareStatement(query);
            pst.setInt(1, rollno);
            
            ResultSet rs = pst.executeQuery();
            
            while(rs.next())
            {
                System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getInt(5));
            }
            
            return true;
        }
        catch(Exception e)
        {
            e.printStackTrace();
            return false;
        }
    }
    
    public boolean display()
    {
        String query = "select * from stud";
        try
        {
            pst = con.prepareStatement(query);
            
            ResultSet rs = pst.executeQuery();
            
            while(rs.next())
            {
                System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getInt(5));
            }
            
            return true;
        }
        catch(Exception e)
        {
            e.printStackTrace();
            return false;
        }
    }
}