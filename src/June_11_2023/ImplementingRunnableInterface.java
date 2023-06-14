package June_11_2023;

public class ImplementingRunnableInterface implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Implementing Runnable Interface  :: " + i);

        }
    }
}

class Main {
    public static void main(String[] args) {
        System.out.println("Create a Thread by Implementing Runnable Interface");
        ImplementingRunnableInterface implementingRunnableInterface = new ImplementingRunnableInterface();
        Thread thread = new Thread(implementingRunnableInterface);
        thread.start();

    }
}