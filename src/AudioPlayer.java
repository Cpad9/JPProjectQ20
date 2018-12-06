//Created by: Chris Padgett
//Date: 9/26/18
//Last updated 12/05/18

public class AudioPlayer extends Product implements MultimediaControl {

  private String audioSpecifications;
  private ItemType mediaType;

  //Create a constructor that takes in name and audioSpecification.
  //constructor calls parent constructor and sets up the media type.
  AudioPlayer(String name, String audioSpecifications) {
    super(name);
    mediaType = ItemType.AUDIO;
    this.audioSpecifications = audioSpecifications;
  }

  @Override
  public void play() {
    System.out.println("Playing");
  }

  @Override
  public void stop() {
    System.out.println("Stopping");
  }

  @Override
  public void previous() {
    System.out.println("Previous");
  }

  @Override
  public void next() {
    System.out.println("Next");
  }

  @Override
  public String toString() {
    return super.toString()
        + "Audio Spec : " + audioSpecifications + '\n'
        + "Type : " + mediaType + '\n';
  }
}
