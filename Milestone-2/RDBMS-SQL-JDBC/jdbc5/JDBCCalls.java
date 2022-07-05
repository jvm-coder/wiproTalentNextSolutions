import java.sql.*;
class JDBCCalls
{
    public static void main(String[] args)
    {
        DAOClass obj = new DAOClass();
        Boolean succeed = false;
        
        System.out.println("WELCOME !");

        int opt = Integer.parseInt(args[0]);

        switch(opt)
        {
            case 1 : 
                succeed = obj.insert(Integer.parseInt(args[1]), args[2], args[3], args[4], Integer.parseInt(args[5])); 
    
                if(succeed)
                {
                    System.out.println("Inserted Successfully");
                }
                else 
                {
                    System.out.println("Error in insertion");
                }
                break;
                
            case 2 :
                succeed = obj.delete(Integer.parseInt(args[1]));
                
                if(succeed)
                {
                    System.out.println("Deleted Successfully");
                }
                else 
                {
                    System.out.println("Error in deletion");
                }
                break;
                
             case 3 :
                succeed = obj.modify(Integer.parseInt(args[1]), Integer.parseInt(args[2]));
                
                if(succeed)
                {
                    System.out.println("Mofified Successfully");
                }
                else 
                {
                    System.out.println("Error in modification");
                }
                break;
                
             case 4 :
                if(args.length==1)
                {
                    succeed = obj.display();
                }
                else
                {
                    succeed = obj.display(Integer.parseInt(args[1]));
                }
                
                if(!succeed)
                {
                    System.out.println("Error in displying records !!!");
                }
                break;
                
             default :
                System.out.println("INVALID OPTION ENTERED ---");
        }
    }
}