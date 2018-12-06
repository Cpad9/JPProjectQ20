//Created by: Chris Padgett
//Date: 9/26/18
//Last updated 12/05/18

class AudioPlayerDriver {

  public static void testAudioPlayer() {
    AudioPlayer audioPlayer = new AudioPlayer("iPod Mini", "MP3");

    audioPlayer.play();
    audioPlayer.stop();
    audioPlayer.next();
    audioPlayer.previous();

    System.out.print(audioPlayer);

    AudioPlayer audioPlayer1 = new AudioPlayer("Walkman", "WAV");

    System.out.println(audioPlayer1);
  }
}