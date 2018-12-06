import java.util.ArrayList;
import java.util.Collections;
//Created by: Chris Padgett
//Date: 9/26/18
//Last updated 12/05/18

public class Main {

  //  public static void main(String[] args) {
  //
  //  Widget w1 = new Widget("Widget 1");
  //  System.out.println(w1.toString());
  //  Widget w2 = new Widget("Widget 2");
  //    System.out.println(w2.toString());
  //
  // /*    for (ItemType it : ItemType.values()) {
  //      System.out.println(it + " " + it.code);
  //    }
  //
  //    AudioPlayerDriver.testAudioPlayer();
  //
  //    ScreenDriver.testScreen();
  //
  //    MoviePlayerDriver.testMoviePlayer();
  //
  //    PlayerDriver.testPlayer();*/
  //
  //    ArrayList<Product> arrayList = new ArrayList<>();
  //    arrayList.add(w2);
  //    arrayList.add(w1);
  //
  //    TestCollections.print(arrayList);
  //
  //   Collections.sort(arrayList);
  //
  //    TestCollections.print(arrayList);
  //  }

  //Main
  public static void main(String[] args) {
    System.out.println("Test Print Type");
    AudioPlayer a1 = new AudioPlayer("iPod Mini", "MP3");
    AudioPlayer a2 = new AudioPlayer("Walkman", "WAV ");
    ArrayList<Product> products = new ArrayList<>();
    products.add(a1);
    products.add(a2);
    // Enter the line of code to call printType in Product
    try {
      Product.printType(products, Class.forName("AudioPlayer"));
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }

  }

}
