//Created by: Chris Padgett
//Date: 9/26/18
//Last updated 12/05/18

//Driver for MoviePLayer
public class MoviePlayerDriver {

  //Method to testMoviePlayer
  public static void testMoviePlayer() {
    MoviePlayer moviePlayer = new MoviePlayer("MoviePlayer",
        new Screen("1080", 144, 1),
        MonitorType.LCD);

    System.out.println(moviePlayer);
  }

}
