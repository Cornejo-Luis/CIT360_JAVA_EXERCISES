/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TR_EX_R;
import java.util.concurrent.atomic.*;
import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

/**
 *
 * @author Luis
 */
class Counter {
    private int value;
 
    public void increment() {
        value++;
    }
 
    public void decrement() {
        value--;
    }
 
    public int get() {
        return value;
    }
}

class UpdateThread extends Thread {
    private Counter counter;
 
    public UpdateThread(Counter counter) {
        this.counter = counter;
    }
 
    public void run() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException ex) { ex.printStackTrace(); }
 
        counter.increment();
    }
}
public class Threadss {
    static final int NUMBER_THREADS = 100;
 
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        System.out.println("Initial Counter = " + counter.get());
 
        UpdateThread[] threads = new UpdateThread[NUMBER_THREADS];
 
        for (int i = 0; i < NUMBER_THREADS; i++) {
            threads[i] = new UpdateThread(counter);
            threads[i].start();
        }
 
        for (int i = 0; i < NUMBER_THREADS; i++) {
            threads[i].join();
        }
 
        System.out.println("Final Counter = " + counter.get()+ "\n");
        
        //Atomic integer using incrementAndGet() method
        System.out.println("------------- ATOMIC INTEGER ---------------\n");
        System.out.println("---------incrementAndGet() method ----------\n");
        AtomicInteger atomicIntIncrement = new AtomicInteger(0);
        ExecutorService executor1 = Executors.newFixedThreadPool(2);
        IntStream.range(0, 1000).forEach(i -> executor1.submit(atomicIntIncrement::incrementAndGet));
        executor1.shutdown();
        //stop(executor);
        System.out.println(atomicIntIncrement.get());    // => 1000
        
        //Atomic integer using updateAndGet() method 
        AtomicInteger atomicIntUpdate = new AtomicInteger(0);
        ExecutorService executor2 = Executors.newFixedThreadPool(2);
        System.out.println("---------updateAndGet() method ----------\n");
        IntStream.range(0, 1000).forEach(i -> {
        Runnable task = () -> atomicIntUpdate.updateAndGet(n -> n + 2);
        executor2.submit(task);
        });
        executor2.shutdown();
        System.out.println(atomicIntUpdate.get());    // => 2000
        
        //Atomic integer using accumulateAndGet() method 
        AtomicInteger atomicIntAcumulate = new AtomicInteger(0);
        ExecutorService executor3 = Executors.newFixedThreadPool(2);
        System.out.println("---------accumulateAndGet() method ----------\n");
        IntStream.range(0, 1000).forEach(j -> {
        Runnable task = () -> atomicIntAcumulate.accumulateAndGet(j, (x, y) -> x + y);
        executor3.submit(task);
        });
        executor3.shutdown();
        System.out.println(atomicIntAcumulate.get());    // => 61078
        
        //Other useful atomic classes are AtomicBoolean, AtomicLong and AtomicReference.
    }
}
