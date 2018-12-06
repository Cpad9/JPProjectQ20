import java.util.ArrayList;
//Created by: Chris Padgett
//Date: 9/26/18
//Last updated 12/05/18

//Driver for TestPlayer


public class PlayerDriver {

  //Method to testPlayer
  public static void testPlayer() {
    MoviePlayer moviePlayer = new MoviePlayer("Pyle PDV156BK",
        new Screen("1366x768", 40, 22),
        MonitorType.LED);

    AudioPlayer audioPlayer = new AudioPlayer("Walkman",
        "MP4");

    System.out.print(moviePlayer);

    ArrayList<MultimediaControl> arrayList = new ArrayList<>();
    arrayList.add(audioPlayer);
    arrayList.add(moviePlayer);

    for (MultimediaControl element : arrayList) {
      element.next();
      element.play();
      element.previous();
      element.stop();
    }

  }

}
