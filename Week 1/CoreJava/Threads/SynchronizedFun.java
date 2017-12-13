public class SynchronizedFun {
  public static void main(String[] args) {
    //Create and start() two threads which 
    //should print 10000, each thread printing
    //5000 times, but it won't happen

    Count c = new Count();
    Runnable job = new TestRunnable(c);

    Thread t1 = new Thread(job);
    Thread t2 = new Thread(job);

    t1.start();
    t2.start();

    try {
      t1.join();
      t2.join();
    } catch (InterruptedException ex) {
      ex.getMessage();
    }

    System.out.println("count: " + c.count);
  }
}

class Count {
  int count;

  public synchronized void increment() {
    //count = count + 1;
    //count += 1;
    count++;
  }
}

class TestRunnable implements Runnable {
  Count c;

  public TestRunnable (Count c) {
    this.c = c;
  }

  public void run() {
    for (int i=0; i < 5000; i++) {
      c.increment();
    }
  }
}