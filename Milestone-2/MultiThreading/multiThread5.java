class multiThread5 implements Runnable {
    
    public static void main(String[] args) {
        multiThread5 obj = new multiThread5();
        Thread t1 = new Thread(obj, "Thread1");
        Thread t2 = new Thread(obj, "Thread2");
        Thread t3 = new Thread(obj, "Thread3");
        
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);
        
        t1.start();
        t2.start();
        t3.start();
    }

    @Override
    public void run() {
        for(int i=0;i<40;i++)
            System.out.println(Thread.currentThread().getName()+" - "+i);
    }

}