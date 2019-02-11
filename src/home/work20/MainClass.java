package home.work20;

import java.io.File;
import java.util.Scanner;

public class MainClass {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String currentPath = "C:/Windows";
    String nextLine = "";

    
    String[] split = {"command"};
    String command;
    String path = "";
    File file = new File("C:/Windows");
    File[] files = file.listFiles();
    while (!split[0].equals("exit")) {
      nextLine = in.nextLine();
      System.out.println(nextLine);
      split = nextLine.split(" ");
      // command = nextLine.substring(0, nextLine.indexOf(' '));
      command = split[0];
      if (command.equals("cd")) {
        if (split[1].equals("..")) {
          currentPath = currentPath.substring(0, currentPath.lastIndexOf("/"));
          System.out.println(currentPath);
        } else {
          if (new File(currentPath + "/" + path).exists()) {
            currentPath = currentPath + "/" + path;
          } else {
            System.out.println("Directory does not exists");
          }
        }
      } else if (command.equals("dir")) {
        file = new File(currentPath);
        files = file.listFiles();
        for (int i = 0; i < files.length; i++) {
          if (files[i].isDirectory()) {
            System.out.println(files[i].toString());
          }
        }
      } else if (command.equals("ls")) {
        file = new File(currentPath);
        files = file.listFiles();
        for (int i = 0; i < files.length; i++) {
          if (files[i].isFile()) {
            System.out.println(files[i].toString());
          }
        }
      } else if (command.equals("mkdir")) {
        File dir = new File(currentPath + "/" + split[1]);
        if (!dir.exists()) {
          try {
            dir.mkdir();
            System.out.println("Directory created");
          } catch (SecurityException se) {
            System.out.println("Security exception");
          }
        } else {
          System.out.println("Directory already exists");
        }
      } else if (command.equals("copy")) {
        
      }

      System.out.println(currentPath + ">");
    }
  }

}
