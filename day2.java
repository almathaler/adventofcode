import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
public class day2{
  public static void main(String[] args){
    System.out.println("checksum: " + checksum());
  }
  public static int checksum(){
    String filename = "day2input.txt";
    try{
      File f = new File(fileName);
      Scanner in = new Scanner(f);
      }
    }catch(FileNotFoundException e){
      System.out.println("File not found: " + fileName);
    }
  }
}
