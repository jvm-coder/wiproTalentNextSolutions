class multiThread1 extends Thread
{
    public void run()
    {
        System.out.println("Thread name = "+Thread.currentThread().getName());
    }
    public static void main(String[] args)
    {
        multiThread1 t1 = new multiThread1();
        multiThread1 t2 = new multiThread1();
        t1.setName("Scooby");
        t2.setName("Shaggy");
        
        t1.start();
        t2.start();
    }
}
