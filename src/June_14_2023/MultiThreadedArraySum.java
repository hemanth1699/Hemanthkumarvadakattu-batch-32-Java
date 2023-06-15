package June_14_2023;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
    class SumCalculator implements Runnable { private int[] array;
        private int startIndex;
        private int endIndex;
        private int partialSum;
        public SumCalculator(int[] array, int startIndex, int endIndex) {
            this.array = array;
            this.startIndex = startIndex;
            this.endIndex = endIndex;
            this.partialSum = 0;
        }
        public int getPartialSum() {
            return partialSum;
        }
        @Override
        public void run() {
            for (int i = startIndex; i <= endIndex; i++) {
                partialSum += array[i];
            }
        }
    }
    public class MultiThreadedArraySum {
        public static void main(String[] args) {
            int[] array = new int[100];
            for (int i = 0; i < 100; i++) {
                array[i] = i + 1;
            }
            int numThreads = 5;
            int chunkSize = array.length / numThreads;
            int startIndex = 0;
            int endIndex = chunkSize - 1;
            ExecutorService executor = Executors.newFixedThreadPool(numThreads);
            SumCalculator[] calculators = new SumCalculator[numThreads];
            for (int i = 0; i < numThreads; i++) {
                if (i == numThreads - 1) {
                    endIndex = array.length - 1;
                }
                calculators[i] = new SumCalculator(array, startIndex, endIndex);
                executor.execute(calculators[i]);
                startIndex = endIndex + 1;
                endIndex += chunkSize;
            }
            executor.shutdown();
            int finalSum = 0;
            for (int i = 0; i < numThreads; i++) {
                try {
                    executor.awaitTermination(Long.MAX_VALUE, java.util.concurrent.TimeUnit.NANOSECONDS);
                    finalSum += calculators[i].getPartialSum();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Sum of elements in the array: " + finalSum);
        }
    }

