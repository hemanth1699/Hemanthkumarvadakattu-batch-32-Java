package June_11_2023;

public class ThreadEx {
        public static class NumberThread extends Thread {
            public void run() {
                for (int i = 1; i <= 10; i++) {
                    System.out.println(i);
                }
            }
        }
        public static void main(String[] args) {
            NumberThread t = new NumberThread();
            t.start();
        }
    }

