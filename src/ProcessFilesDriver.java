import java.io.FileReader;
//Created by: Chris Padgett
//Date: 9/26/18
//Last updated 12/05/18

public class ProcessFilesDriver {

  public static void main(String[] args) {
//        ProcessFiles p = new ProcessFiles();
//
//        try{
//            p.WriteFile();
//        } catch (Exception ex) {
//            System.out.println("Could not write");
//        }

    // pass the path to the file as a parameter
    try {
      FileReader fr =
          new FileReader("C:\\LineTests\\TestResults.txt");

      int i;
      while ((i = fr.read()) != -1) {
        System.out.print((char) i);
      }
    } catch (Exception ex) {
      System.out.println("File reader failed");
    }
  }
}
