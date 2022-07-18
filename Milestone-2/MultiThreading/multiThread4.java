class multiThread4 implements Runnable 
{
    static Thread odd;
    static Thread even;
    public static void main(String[] args) 
    {
        multiThread4 obj = new multiThread4();
        odd = new Thread(obj, "oddThread");
        even = new Thread(obj, "evenThread");
        
        odd.start();
        even.start();
    }
    
    public void run()
    {
        if(Thread.currentThread().getName().equals("oddThread"))
        {
            try {
                even.join();
            }
            catch(InterruptedException e) {
                e.printStackTrace();
            }
        }
        
        for(int i=1;i<=20;i++)
        {
            if(Thread.currentThread().getName().equals("oddThread"))
                if(i%2 != 0)
                    System.out.println(i);
                    
            if(Thread.currentThread().getName().equals("evenThread"))
                if(i%2 == 0)
                    System.out.println(i);
        }
    }
}