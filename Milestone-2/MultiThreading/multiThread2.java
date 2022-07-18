import java.util.Random;
class multiThread2 implements Runnable
{
    public void run()
    {
        int ind;
        Random random = new Random();
        String[]  colors = {"white", "blue", "black", "green", "red", "yellow"};
        while((ind=random.nextInt(6)) != 4)
        {
             System.out.println(colors[ind]);
        }
    }

    public static void main(String[] args)
    {
         multiThread2 obj = new multiThread2();
         Thread t = new Thread(obj);
         t.start();
    }
}        