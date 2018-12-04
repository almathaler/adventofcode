import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
public class day1{
  public static void main(String[] args){
    System.out.println("total freq: "  + getFreq());
    System.out.println("first repeat: " + getFirstRepeat());
  }
  public static int getFreq(){
    int frequency = 0;
    String fileName = "day1input.txt";
    try{
      File f = new File(fileName);
      Scanner in = new Scanner(f);
      while (in.hasNext()){
        String word = in.next();
        Integer change = Integer.parseInt(word);
        frequency += change;
      }
    }catch(FileNotFoundException e){
      System.out.println("File not found: " + fileName);
    }
    return frequency;
  }
  public static int getFirstRepeat(){
    ArrayList<Integer> previousFreqs = new ArrayList();
    int frequency = 0;
    String fileName = "day1input.txt";
    boolean returned = false;
    while (!returned){
      try{
        File f = new File(fileName);
        Scanner in = new Scanner(f);
        while (in.hasNext()){
          String word = in.next();
          Integer change = Integer.parseInt(word);
          frequency+=change;
          if (previousFreqs.contains(frequency)){
            returned = true;
            return frequency;
          }
          previousFreqs.add(frequency);
        }
      }catch(FileNotFoundException e){
        System.out.println("File not found: " + fileName);
      }
    }
    return 0;
  }
}
