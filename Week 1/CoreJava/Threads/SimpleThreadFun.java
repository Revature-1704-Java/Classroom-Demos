public class SimpleThreadFun {
  public static void main(String[] args) {
    Runnable job = new MyRunnableThing();
    Thread worker = new Thread(job);
    worker.start();
    for (int i = 0; i < 50; i++) {
      System.out.println("main");
    }
  }
}

class MyRunnableThing implements Runnable {
  public void run() {
    for (int i = 0; i < 50; i++) {
      System.out.println("runnableThing");
    }
  }
}