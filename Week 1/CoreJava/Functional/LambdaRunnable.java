public class LambdaRunnable {
  public static void main(String[] args) {
    //Anonymous Runnable
    Runnable r1 = new Runnable(){
      @Override
      public void run() {
        System.out.println("What's goin on?");
      }
    };

    //Lambda Runnable
    Runnable r2 = () -> System.out.println("The future is now");
    
    r1.run();
    r2.run();
  }

}