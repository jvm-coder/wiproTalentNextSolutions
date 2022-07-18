class multiThread3 extends Thread
{
    public static void main(String[] args)
    {
        Thread t1 = new Thread(new multiThread3(), "numbers");
        t1.start();
    }
    
    public void run()
    {
        System.out.println(Thread.currentThread().getName());
        for(int i=1;i<11;i++)
        {
            if(i==6)
            {
                try 
                {
                    Thread.sleep(5000);
                }
                catch(InterruptedException e)
                {
                    e.printStackTrace();
                }
            }
            System.out.println(i);
        }
    }
}