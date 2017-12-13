import java.io.*;
import java.util.Scanner;

public class IO {
  public static void main(String[] args) {
    String filename = "";
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter filename for Hello World");
    filename = sc.nextLine();

    try(FileWriter fw = new FileWriter(filename)) {
      fw.write("Hello World");
    } catch (IOException ex) {
      ex.printStackTrace();
    }

    try(FileReader fr = new FileReader(filename)) {
      int i;
      while ((i = fr.read()) != -1) {
        System.out.print((char) i);
      }
    } catch (FileNotFoundException ex) {
      ex.printStackTrace();
    } catch (IOException ex) {
      ex.printStackTrace();
    }

    System.out.println("Enter filename for Person");
    filename = sc.nextLine();

    Person p = new Person("Bob", 568);
    writeObject(filename, p);
    readObject(filename);
    
    sc.close();
  }

  static void writeObject(String filename, Object obj) {
    try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
      oos.writeObject(obj);
    } catch (IOException ex) {
      ex.printStackTrace();
    }
  }

  static void readObject(String filename) {
    try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
      Object obj = ois.readObject();
      System.out.println(obj);
    } catch (FileNotFoundException ex) {
      ex.printStackTrace();
    } catch (IOException ex) {
      ex.printStackTrace();
    } catch (ClassNotFoundException ex) {
      ex.printStackTrace();
    }
  }
}