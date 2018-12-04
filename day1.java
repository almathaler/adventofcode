import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class day1 {
  public static void main(String[] args){
    System.out.println(getFreq());
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
}
