public class ProducerConsumerFun {
  public static void main(String[] args) {
    System.out.println(Thread.currentThread().getName());
    Basket b = new Basket();
    Runnable producerJob = new Producer(b);
    Runnable consumerJob = new Consumer(b);
    Thread producerWorker = new Thread(producerJob);
    Thread consumerWorker = new Thread(consumerJob);
    producerWorker.start();
    consumerWorker.start();
  }
}

class Basket {
  private int contents;
  private boolean available = false;

  public synchronized int get() {
    while (available == false) {
      try {
        System.out.println(Thread.currentThread().getName() + " called wait");
        wait();
      } catch (InterruptedException ex) {
        ex.getMessage();
      }
    }
    available = false;
    notifyAll();
    return contents;
  }

  public synchronized void put(int value) {
    while (available == true) {
      try {
        System.out.println(Thread.currentThread().getName() + " called wait");
        wait();
      } catch (InterruptedException ex) {
        ex.getMessage();
      }
    }
    available = true;
    contents = value;
    notifyAll();
  }
}

class Consumer implements Runnable {
  private Basket basket;

  public Consumer(Basket basket) {
    this.basket = basket;
  }

  public void run() {
    int value = 0;
    for (int i = 0; i < 10; i++) {
      value = basket.get();
      System.out.println(Thread.currentThread().getName() + " gets " + value);
    }
  }
}

class Producer implements Runnable {
  private Basket basket;

  public Producer(Basket basket) {
    this.basket = basket;
  }

  public void run() {
    for (int i = 0; i < 10; i++) {
      basket.put(i);
      System.out.println(Thread.currentThread().getName() + " puts " + i);

      try {
        Thread.sleep((int) (Math.random() * 100));
      } catch (InterruptedException ex) {
        ex.getMessage();
      }
    }
  }
}