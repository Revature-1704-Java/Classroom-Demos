package com.revature.singleton;

public class MySingleton {
  private static MySingleton SINGLETON;

  private MySingleton() {
    super();
  }

  public static MySingleton getInstance() {
    if (SINGLETON == null) {
      SINGLETON = new MySingleton();
    }

    return SINGLETON;
  }

  public synchronized void writeFile (String contents) {
    System.out.println("wrote to file");
  }

  public String readFile() {
    System.out.println("read file");
    return "read";
  }
}