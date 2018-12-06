//Created by: Chris Padgett
//Date: 9/26/18
//Last updated 12/05/18
public class Screen implements ScreenSpec {

  private String resolution;
  private int refreshrate;
  private int responsetime;

  //Constructor for SCreen
  Screen(String resolution, int refreshrate, int responsetime) {
    this.resolution = resolution;
    this.refreshrate = refreshrate;
    this.responsetime = responsetime;
  }

  @Override
  public String getResolution() {
    return this.resolution;
  }

  @Override
  public int getRefreshRate() {
    return this.refreshrate;
  }

  @Override
  public int getResponseTime() {
    return this.responsetime;
  }

  @Override
  public String toString() {
    return
        "Resolution : " + resolution + '\n'
            + "Refresh rate : " + refreshrate + '\n'
            + "Response time : " + responsetime + '\n';
  }
}
