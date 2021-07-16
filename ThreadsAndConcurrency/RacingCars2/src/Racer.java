public class Racer implements Runnable /* TODO Add something here so that you can pass this Racer to the constructor of Thread*/
{
    Car c;
    int distance = 1000; // this is a racer that is going to run 1000 miles.
    public Racer(Car obj) {
        this.c = obj;
    }
    /* TODO
Create a constructor that receives a Car objec and initializes c.*/
    @Override
    public void run()   {
        try {
            System.out.println("Before the while loop: " +c.toString());

            while (c.odometer < distance)
            {

                if(c.miles == 0) {
                    System.out.println(c.name + " is charging");

                    Thread.sleep((long)c.maxMiles);
                    c.charge();

                }
                c.move(1);
            }
            System.out.println(c.name + " finished");
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
    }
    /* TODO
Override one method.  This is the task the thread will perform... You have to determine which method this is.
Check the method description. */
}